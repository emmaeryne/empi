package tn.esprit.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.esprit.MyDataBase.MyDataBase;

public class Don {

    private MyDataBase myDataBase;

    public Don() {
        // Initi db
        myDataBase = MyDataBase.getInstnce();
    }

    public void enregistrerDon(tn.esprit.models.Don don) {
        try (Connection connection = myDataBase.getCnx()) {
            String query = "INSERT INTO dons ( id ,date, montant, projet, typeDon, donateur, beneficiaire) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setDate(1, new java.sql.Date(don.getDate().getTime()));
                preparedStatement.setDouble(2, don.getMontant());
                preparedStatement.setString(3, don.getProjet());
                preparedStatement.setString(4, don.getTypeDon());
                preparedStatement.setString(5, don.getDonateur());
                preparedStatement.setString(6, don.getBeneficiaire());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public tn.esprit.models.Don getDonById(int id) {
        tn.esprit.models.Don don = null;
        try (Connection connection = myDataBase.getCnx()) {
            String query = "SELECT * FROM dons WHERE id=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, id);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        don = mapResultSetToDon(resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return don;
    }

    public List<tn.esprit.models.Don> getAllDons() {
        List<tn.esprit.models.Don> dons = new ArrayList<>();
        try (Connection connection = myDataBase.getCnx()) {
            String query = "SELECT * FROM dons";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        tn.esprit.models.Don don = mapResultSetToDon(resultSet);
                        dons.add(don);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dons;
    }

    public void updateDon(tn.esprit.models.Don updatedDon) {
        try (Connection connection = myDataBase.getCnx()) {
            String query = "UPDATE dons SET date=?, montant=?, projet=?, typeDon=?, donateur=?, beneficiaire=? WHERE id=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setDate(1, new java.sql.Date(updatedDon.getDate().getTime()));
                preparedStatement.setDouble(2, updatedDon.getMontant());
                preparedStatement.setString(3, updatedDon.getProjet());
                preparedStatement.setString(4, updatedDon.getTypeDon());
                preparedStatement.setString(5, updatedDon.getDonateur());
                preparedStatement.setString(6, updatedDon.getBeneficiaire());
                preparedStatement.setInt(7, updatedDon.getId());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean deleteDon(int id) {
        try (Connection connection = myDataBase.getCnx()) {
            String query = "DELETE FROM dons WHERE id=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, id);

                int rowsDeleted = preparedStatement.executeUpdate();
                return rowsDeleted > 0; // Return true if at least one row is deleted
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private tn.esprit.models.Don mapResultSetToDon(ResultSet resultSet) throws SQLException {
        tn.esprit.models.Don don = new tn.esprit.models.Don(

                resultSet.getDate("date"),
                resultSet.getDouble("montant"),
                resultSet.getString("projet"),
                resultSet.getString("typeDon"),
                resultSet.getString("donateur"),
                resultSet.getString("beneficiaire")
        );
        return don;
    }
}
