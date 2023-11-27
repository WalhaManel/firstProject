package tn.esprit.firstproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.firstproject.Entity.Chambre;
import tn.esprit.firstproject.Repository.ChambreRepository;

public class ChambreService implements IChambreService{

    @Autowired
    private ChambreRepository chambreRep;
    @Override
    public String getNomBloc(long idChambre) {
        Chambre chambre = chambreRep.findById(idChambre).get();
        String bloc = chambre.getBloc().getNomBloc();

        return bloc ;
    }

}
