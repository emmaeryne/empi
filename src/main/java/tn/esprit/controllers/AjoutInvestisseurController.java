package tn.esprit.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import tn.esprit.models.Investisseur;
import tn.esprit.Iservice.InvestisseurService;

public class AjoutInvestisseurController {

    @FXML
    private TextField nomTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField compteBancaireTextField;

    private InvestisseurService investisseurService;

    @FXML
    private void ajouterInvestisseur() {
        String nom = nomTextField.getText();
        String email = emailTextField.getText();
        int compteBancaire = Integer.parseInt(compteBancaireTextField.getText());

        // Créer un nouvel objet Investisseur avec les données saisies
        Investisseur nouvelInvestisseur = new Investisseur(1, "John Doe", "john@example.com", 123456789, "123 Street", "1234567890", "Secteur d'intérêt", 10000, "Historique des investissements");
        nouvelInvestisseur.setNom(nom);
        nouvelInvestisseur.setEmail(email);
        nouvelInvestisseur.setCompteBancaire(compteBancaire);

        // Enregistrer le nouvel investisseur
        investisseurService.ajouterInvestisseur(nouvelInvestisseur);

        // Réinitialiser les champs de saisie
        nomTextField.clear();
        emailTextField.clear();
        compteBancaireTextField.clear();

        // Vous pouvez également afficher un message de succès ou effectuer d'autres actions nécessaires
    }

    public void setInvestisseurService(InvestisseurService investisseurService) {
        this.investisseurService = investisseurService;
    }
}
