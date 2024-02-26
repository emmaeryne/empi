package tn.esprit.Iservice;

import tn.esprit.models.Investisseur;

import java.util.ArrayList;
import java.util.List;

public interface InvestisseurService<I> {
    void add(Investisseur investisseur);

    ArrayList<Investisseur> getAll();

    void update(Investisseur updatedInvestisseur);

    boolean delete(Investisseur investisseur);

    void ajouterInvestisseur(Investisseur investisseur);
    void supprimerInvestisseur(int id);
    void modifierInvestisseur(Investisseur investisseur);
    List<Investisseur> getAllInvestisseurs();
    Investisseur getInvestisseurById(int id);
}
