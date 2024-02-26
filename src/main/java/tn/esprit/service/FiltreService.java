package tn.esprit.service;

import tn.esprit.models.Investisseur;
import java.util.ArrayList;
import java.util.List;

public class FiltreService {
    public static List<Investisseur> filtrerInvestisseurs(List<Investisseur> investisseurs, String critereFiltre) {
        List<Investisseur> resultats = new ArrayList<>();
        for (Investisseur investisseur : investisseurs) {
            // Ajoutez ici la logique de filtrage selon vos critères (par exemple, par secteur d'intérêt)
            if (investisseur.getSecteurInteret().equalsIgnoreCase(critereFiltre)) {
                resultats.add(investisseur);
            }
        }
        return resultats;
    }
}
