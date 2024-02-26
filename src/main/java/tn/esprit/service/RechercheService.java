package tn.esprit.service;

import tn.esprit.models.Don;
import java.util.ArrayList;
import java.util.List;

public class RechercheService {
    public static List<Don> rechercherDons(List<Don> dons, String critereRecherche) {
        List<Don> resultats = new ArrayList<>();
        for (Don don : dons) {
            // Ajoutez ici la logique de recherche selon vos critères (par exemple, par nom du donateur)
            if (don.getDonateur().equalsIgnoreCase(critereRecherche)) {
                resultats.add(don);
            }
        }
        return resultats;
    }
}
