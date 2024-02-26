package tn.esprit.service;

import tn.esprit.Iservice.InvestisseurService;

import tn.esprit.models.Investisseur;
import tn.esprit.MyDataBase.MyDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class investisseur implements InvestisseurService<investisseur> {

    private Connection cnx;

    public investisseur(Connection cnx) {
        this.cnx = MyDataBase.getInstnce().getCnx();
    }

    @Override
    public void add(Investisseur investisseur) {
        String query = "INSERT INTO `investisseur`(`nom`, `email`, `compteBancaire`,`Address` , `Contact` ,`SecteurInteret`,`MontantInvestissementMinimum`,`HistoriqueInvestissements`,`MontantInvesti`) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stm = cnx.prepareStatement(query);
            stm.setString(1, investisseur.getNom());
            stm.setString(3, investisseur.getEmail());
            stm.setInt(4, investisseur.getCompteBancaire());
            stm.setString(4, investisseur.getAddress());
            stm.setString(4, investisseur.getContact());
            stm.setString(4, investisseur.getSecteurInteret());
            stm.setInt(4, investisseur.getMontantInvestissementMinimum());
            stm.setInt(4, investisseur.getMontantInvesti());
            stm.setString(4, investisseur.getHistoriqueInvestissements());
            stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Investisseur> getAll() {
        ArrayList<Investisseur> investisseurs = new ArrayList<>();
        String query = "SELECT * FROM `investisseur`";
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Investisseur investisseur = new Investisseur(1, "John Doe", "john@example.com", 123456789, "123 Street", "1234567890", "Secteur d'intérêt", 10000, "Historique des investissements");
                investisseur.setId(rs.getInt("id"));
                investisseur.setNom(rs.getString("nom"));
                investisseur.setEmail(rs.getString("email"));
                investisseur.setCompteBancaire(rs.getInt("compteBancaire"));
                investisseur.setAddress(rs.getString("Adress"));
                investisseur.setContact(rs.getString("contact"));
                investisseur.setSecteurInteret(rs.getString("SecteurInteret"));
                investisseur.setMontantInvestissementMinimum(rs.getInt("MontantInvestissementMinimum"));
                investisseur.setHistoriqueInvestissements(rs.getString("HistoriqueInvestissements"));
                investisseur.setMontantInvesti(rs.getInt("ontantInvesti"));


                investisseurs.add(investisseur);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return investisseurs;
    }

    @Override
    public void update(Investisseur updatedInvestisseur) {
        String query = "UPDATE `investisseur` SET `nom`=?, `email`=?, `compteBancaire`=? , `Adress`=? , `Contact`=? , `SecteurInteret`=? , `MontantInvestissementMinimum`=? , `HistoriqueInvestissements`=? , `compteBancaire`=? , `MontantInvesti`=? WHERE `id`=?";
        try {
            PreparedStatement stm = cnx.prepareStatement(query);
            stm.setString(1, updatedInvestisseur.getNom());
            stm.setString(2, updatedInvestisseur.getEmail());
            stm.setInt(3, updatedInvestisseur.getCompteBancaire());
            stm.setInt(4, updatedInvestisseur.getId());
            stm.setString(4, updatedInvestisseur.getAddress());
            stm.setString(4, updatedInvestisseur.getContact());
            stm.setString(4, updatedInvestisseur.getSecteurInteret());
            stm.setInt(4, updatedInvestisseur.getMontantInvestissementMinimum());
            stm.setString(4, updatedInvestisseur.getHistoriqueInvestissements());
            stm.setInt(4, updatedInvestisseur.getMontantInvesti());

            stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Investisseur investisseur) {
        String query = "DELETE FROM `investisseur` WHERE `id`=?";
        try {
            PreparedStatement stm = cnx.prepareStatement(query);
            stm.setInt(1, investisseur.getId());

            int rowsDeleted = stm.executeUpdate();
            return rowsDeleted > 0; // Return true if at least one row is deleted
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void ajouterInvestisseur(Investisseur investisseur) {

    }

    @Override
    public void supprimerInvestisseur(int id) {

    }

    @Override
    public void modifierInvestisseur(Investisseur investisseur) {

    }

    @Override
    public List<Investisseur> getAllInvestisseurs() {
        return null;
    }

    @Override
    public Investisseur getInvestisseurById(int id) {
        return null;
    }
}
