package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

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

    @OneToOne(mappedBy = "foyer")
    private Universite universite;
    @OneToMany(mappedBy = "foyer",cascade = CascadeType.ALL)
    private Set<Bloc> blocs;
}
