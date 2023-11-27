package tn.esprit.firstproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.firstproject.Entity.Foyer;
import tn.esprit.firstproject.Entity.Universite;
import tn.esprit.firstproject.Repository.FoyerRepository;
import tn.esprit.firstproject.Repository.UniversiteRepository;

import java.util.List;

public class FoyerService implements IFoyerService{
    @Autowired
    private FoyerRepository FoyerRep;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return FoyerRep.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return FoyerRep.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return FoyerRep.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return FoyerRep.findByIdFoyer(idFoyer);
    }

    @Override
    public void archiverFoyer(long idFoyer) {
        FoyerRep.archiverFoyer(idFoyer);

    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Foyer f = FoyerRep.save(foyer);
        Universite universite = UniversiteRepository.findbyIdUniversite(idUniversite).get();
        universite.setFoyer(f);
        UniversiteRepository.save(universite);
        return f;
    }
}
