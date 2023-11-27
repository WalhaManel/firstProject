package tn.esprit.firstproject.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.firstproject.Entity.Universite;

import java.util.List;

public interface UniversiteRepository extends CrudRepository<Universite,Long> {
    Universite UniversiteRepository.findByIdUniversite(Long idUniversity);
    static void deleteUni(long idUniversity) {
        UniversiteRepository.deleteByIdUniversite(idUniversity);
    }

    Universite findByNomUniversite(String nomUniversite);
    List<Universite> findAll();
    Universite findByIdUniversite(Long idUniversite);
}
