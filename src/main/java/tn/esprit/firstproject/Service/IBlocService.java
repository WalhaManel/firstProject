package tn.esprit.firstproject.Service;

import tn.esprit.firstproject.Entity.Bloc;

import java.util.List;

public interface IBlocService {

    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);
}

