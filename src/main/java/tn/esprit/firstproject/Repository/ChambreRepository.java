package tn.esprit.firstproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.firstproject.Entity.Chambre;

public interface ChambreRepository extends CrudRepository<Chambre,Long> {

    Chambre findByIdChambre(@Param("id") Long id);

}
