package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idFoyer;

    @Column
    private String nomFoyer;

    @Column
    private long capaciteFoyer;

}
