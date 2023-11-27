package tn.esprit.firstproject.Service;

import tn.esprit.firstproject.Entity.Reservation;

public interface IReservationService {
    Reservation ajouterReservation (long idChambre, long cinEtudiant) ;
}
