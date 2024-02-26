package tn.esprit.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AjoutInvestissementController {

    @FXML
    private TextField idTextField;

    @FXML
    private TextField nomTextField;

    @FXML
    private TextField montantTextField;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private void ajouterInvestissement() {
        // Récupérer les valeurs des champs
        int id = Integer.parseInt(idTextField.getText());
        String nom = nomTextField.getText();
        double montant = Double.parseDouble(montantTextField.getText());
        String description = descriptionTextField.getText();

        // Ajouter la logique d'ajout de l'investissement (par exemple, appel à un service)
        // investissementService.ajouterInvestissement(id, nom, montant, description);

        // Effacer les champs après l'ajout
        idTextField.clear();
        nomTextField.clear();
        montantTextField.clear();
        descriptionTextField.clear();

        // Afficher un message de confirmation ou une action appropriée
    }
}
