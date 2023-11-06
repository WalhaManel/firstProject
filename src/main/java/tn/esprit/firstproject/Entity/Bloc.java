package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idBloc ;

    @Column
    private String nomBloc;
    @Column
    private Long capaciteBloc;

    @OneToMany(mappedBy = "bloc",cascade = CascadeType.ALL)
    private Set<Chambre> chambres;
    @ManyToOne
    private Foyer foyer;
}
