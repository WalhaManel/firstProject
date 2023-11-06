package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
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

}

