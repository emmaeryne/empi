package tn.esprit.Iservice;

import tn.esprit.models.Don;
import java.util.List;

public interface DonService {
    void ajouterDon(Don don);
    void supprimerDon(int id);
    void modifierDon(Don don);
    List<Don> getAllDons();
    Don getDonById(int id);
}
