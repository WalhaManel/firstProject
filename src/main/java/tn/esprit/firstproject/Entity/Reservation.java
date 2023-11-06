package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idReservation;
    @Column
    private Date anneeUniversite;
    @Column
    private Boolean estValide;
    @ManyToOne
    private Chambre chambre;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "reservations")
    private Set<Etudiant> etudiants;


}
