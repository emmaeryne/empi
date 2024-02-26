package tn.esprit.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SuppressionInvestissementController {

    @FXML
    private TextField idInvestissementTextField;

    @FXML
    private void supprimerInvestissement() {
        // Récupérer l'ID de l'investissement à supprimer
        int idInvestissement = Integer.parseInt(idInvestissementTextField.getText());

        // Appeler la méthode de suppression de l'investissement avec l'ID récupéré
        // investissementService.supprimerInvestissement(idInvestissement);

        // Effacer le champ de saisie après la suppression
        idInvestissementTextField.clear();

        // Afficher un message de confirmation ou une action appropriée
    }
}
