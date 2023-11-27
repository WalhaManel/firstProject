package tn.esprit.firstproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.firstproject.Entity.Bloc;
import tn.esprit.firstproject.Repository.BlocRepository;

import java.util.List;

public class BlocService implements IBlocService{
    @Autowired
    private BlocRepository BlocRep;

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        return BlocRep.affecterChambresABloc();
    }
}
