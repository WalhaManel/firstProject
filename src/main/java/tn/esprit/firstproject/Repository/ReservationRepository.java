package tn.esprit.firstproject.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.firstproject.Entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation,String> {
}
