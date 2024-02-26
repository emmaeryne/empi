package tn.esprit.Iservice;

import tn.esprit.models.Investissement;
import java.util.List;

public interface InvestissementService {
    void ajouterInvestissement(Investissement investissement);
    void supprimerInvestissement(int id);
    void modifierInvestissement(Investissement investissement);
    List<Investissement> getAllInvestissements();
    Investissement getInvestissementById(int id);
}
