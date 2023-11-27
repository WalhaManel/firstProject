package tn.esprit.firstproject.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.firstproject.Entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation,String> {

    @Query(value = "INSERT INTO Reservation VALUES (:r)",nativeQuery = true)
    Reservation addReservation(@Param("r")  Reservation r);
}
