package tn.esprit.firstproject.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.firstproject.Entity.Foyer;

import java.util.List;

public interface FoyerRepository extends CrudRepository<Foyer,Long> {
    Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite);

    void archiverFoyer(long idFoyer);

    Foyer retrieveFoyer(long idFoyer);

    Foyer addFoyer(Foyer f);

    List<Foyer> findAll();
    Foyer findByIdFoyer(long idfoyer);
}
