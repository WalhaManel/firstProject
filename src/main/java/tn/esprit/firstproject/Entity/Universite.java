package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
     private long idUniversite ;
    @Column
     private String nomUniversite ;
    @Column
     private String adresse ;

}
