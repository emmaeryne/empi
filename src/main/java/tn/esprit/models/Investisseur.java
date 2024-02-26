package tn.esprit.models;

public class Investisseur {

    private int id;
    private String nom;
    private String email;
    private int compteBancaire;
    private String Address;
    private String Contact;
    private String SecteurInteret;
    private int MontantInvestissementMinimum;
    private String HistoriqueInvestissements;

    public int getMontantInvesti() {
        return MontantInvesti;
    }

    public void setMontantInvesti(int montantInvesti) {
        MontantInvesti = montantInvesti;
    }

    private int MontantInvesti;

    public int getMontantInvestissementMinimum() {
        return MontantInvestissementMinimum;
    }

    public void setMontantInvestissementMinimum(int montantInvestissementMinimum) {
        MontantInvestissementMinimum = montantInvestissementMinimum;
    }


    public String getHistoriqueInvestissements() {
        return HistoriqueInvestissements;
    }

    public void setHistoriqueInvestissements(String historiqueInvestissements) {
        HistoriqueInvestissements = historiqueInvestissements;
    }




    public String getSecteurInteret() {
        return SecteurInteret;
    }

    public void setSecteurInteret(String secteurInteret) {
        SecteurInteret = secteurInteret;
    }



    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = Address;
    }



    public Investisseur(int i, String johnDoe, String mail, int i1, String s, String number, String string, int i2, String historiqueDesInvestissements) {
    }

    public Investisseur(int id, String nom, String email, int compteBancaire) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.compteBancaire = compteBancaire;
    }

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
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(int compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

    @Override
    public String toString() {
        return "Investisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", compteBancaire=" + compteBancaire +
                '}';
    }
}
