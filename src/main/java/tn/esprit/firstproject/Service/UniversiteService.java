package tn.esprit.firstproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.firstproject.Entity.Universite;
import tn.esprit.firstproject.Repository.FoyerRepository;
import tn.esprit.firstproject.Repository.UniversiteRepository;

import java.util.List;

public class UniversiteService implements IUniversiteService{
    @Autowired
    private UniversiteRepository universiteRep;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) UniversiteRepository.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return UniversiteRepository.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return UniversiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return UniversiteRepository.findByIdUniversite(idUniversity);
    }

    @Override
    public void removeUniversity(long idUniversity) {
        UniversiteRepository.deleteUni(idUniversity);

    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite universite = UniversiteRepository.findByNomUniversite(nomUniversite);
        universite.setFoyer(FoyerRepository.findById(idFoyer).get());
        return UniversiteRepository.save(universite);    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = UniversiteRepository.findById(idUniversite).get ();
        universite.setFoyer(null);
        return UniversiteRepository.save(universite);
    }
}
