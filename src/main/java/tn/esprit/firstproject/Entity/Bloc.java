package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idBloc ;

    @Column
    private String nomBloc;
    @Column Long capaciteBloc;


}
