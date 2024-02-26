package tn.esprit.models;

public class Investissement {
    private int id;
    private String nom;
    private double montant;
    private String description;

    // Constructeur
    public Investissement(int id, String nom, double montant, String description) {
        this.id = id;
        this.setNom(nom);
        this.setMontant(montant);
        this.setDescription(description);
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        // Vérifier si le nom n'est pas vide
        if (nom != null && !nom.trim().isEmpty()) {
            this.nom = nom;
        } else {
            throw new IllegalArgumentException("Le nom ne peut pas être vide.");
        }
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        // Vérifier si le montant est positif
        if (montant >= 0) {
            this.montant = montant;
        } else {
            throw new IllegalArgumentException("Le montant ne peut pas être négatif.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        // La description peut être vide, donc aucune validation nécessaire
        this.description = description;
    }
}
