package tn.esprit.Iservice;

import tn.esprit.models.RetourSurInvestissement;
import java.util.List;

public interface RetourSurInvestissementService {
    void ajouterRetourSurInvestissement(RetourSurInvestissement retour);
    void supprimerRetourSurInvestissement(int id);
    void modifierRetourSurInvestissement(RetourSurInvestissement retour);
    List<RetourSurInvestissement> getAllRetoursSurInvestissement();
    RetourSurInvestissement getRetourSurInvestissementById(int id);
}
