package tn.esprit.test;

import tn.esprit.models.Investisseur;

public class Main {
    public static void main(String[] args) {
        // Création d'un nouvel investisseur avec les champs spécifiés
        Investisseur investisseur = new Investisseur(
                1,                      // id
                "John Doe",             // nom
                "john@example.com",    // email
                123456789,             // compteBancaire
                "123 Street",          // Address
                "1234567890",          // Contact
                "Secteur d'intérêt",   // SecteurInteret
                10000,                  // MontantInvestissementMinimum
                "Historique des investissements" // HistoriqueInvestissements
        );

        // Affichage des informations de l'investisseur
        System.out.println("Informations de l'investisseur :");
        System.out.println("ID : " + investisseur.getId());
        System.out.println("Nom : " + investisseur.getNom());
        System.out.println("Email : " + investisseur.getEmail());
        System.out.println("Compte bancaire : " + investisseur.getCompteBancaire());
        System.out.println("Adresse : " + investisseur.getAddress());
        System.out.println("Contact : " + investisseur.getContact());
        System.out.println("Secteur d'intérêt : " + investisseur.getSecteurInteret());
        System.out.println("Montant d'investissement minimum : " + investisseur.getMontantInvestissementMinimum());
        System.out.println("Historique des investissements : " + investisseur.getHistoriqueInvestissements());
    }
}
