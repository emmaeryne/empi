package tn.esprit.models;

public class RetourSurInvestissement {
    private int id;
    private String description;
    private double montantInitial;
    private double montantRetour;

    // Constructeur, getters et setters
    public RetourSurInvestissement(int id, String description, double montantInitial, double montantRetour) {
        this.id = id;
        this.description = description;
        this.montantInitial = montantInitial;
        this.montantRetour = montantRetour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontantInitial() {
        return montantInitial;
    }

    public void setMontantInitial(double montantInitial) {
        this.montantInitial = montantInitial;
    }

    public double getMontantRetour() {
        return montantRetour;
    }

    public void setMontantRetour(double montantRetour) {
        this.montantRetour = montantRetour;
    }

    // Méthode pour calculer le retour sur investissement (ROI)
    public double calculerROI() {
        return (montantRetour / montantInitial) * 100.0;
    }
}
