package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table
public class Chambre implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idChambre;
    @Column
    private long numChambre;
    @Enumerated(EnumType.STRING)
    @Column
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;
    @OneToMany(mappedBy = "chambre",cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}

