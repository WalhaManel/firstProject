package tn.esprit.firstproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.firstproject.Entity.Chambre;
import tn.esprit.firstproject.Entity.Reservation;
import tn.esprit.firstproject.Repository.ChambreRepository;
import tn.esprit.firstproject.Repository.ReservationRepository;

import java.util.Calendar;
import java.util.Date;

public class ReservationService implements IReservationService{
    @Autowired
    private ReservationRepository reservationRep;

    @Override
    public Reservation ajouterReservation(long idChambre, long cinEtudiant) {
        Reservation reservation = new Reservation();
        Calendar calendar = Calendar. getInstance();
        reservation.setAnneeUniversite(calendar.get(Calendar.YEAR));
        Chambre chambre = ChambreRepository.findByIdChambre(idChambre).get();
        String bloc = chambre.getBloc().getNomBloc();
        reservation.setIdReservation(Long.toString(idChambre) + '-' + Long.toString(bloc) + '-' + Integer.toString(anneeUniversitaire));
        var nbrReservations = chambre.getReservations().size();
        if(chambre.getTypeC().equals("SIMPLE") && nbrReservations == 0){
            reservation.setEstValide(true);

        } else if (chambre.getTypeC().equals("DOUBLE") && nbrReservations <= 1) {
            reservation.setEstValide(true);

        }else if (chambre.getTypeC().equals("TRIPLE") && nbrReservations <= 2){
            reservation.setEstValide(true);

        }
        else {
            reservation.setEstValide(false);

        }

    }
}

