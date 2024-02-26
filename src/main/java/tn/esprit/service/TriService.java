package tn.esprit.service;

import tn.esprit.models.Don;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriService {
    public static void trierDons(List<Don> dons, int critereTri) {
        switch (critereTri) {
            case 1: // Trier par date
                Collections.sort(dons, Comparator.comparing(Don::getDate));
                break;
            case 2: // Trier par montant
                Collections.sort(dons, Comparator.comparingDouble(Don::getMontant));
                break;
            case 3: // Trier par nom du donateur
                Collections.sort(dons, Comparator.comparing(Don::getDonateur));
                break;
            default:
                System.out.println("Critère de tri invalide.");
                break;
        }
    }
}
