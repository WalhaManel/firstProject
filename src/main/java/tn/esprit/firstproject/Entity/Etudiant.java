package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idEtudiant;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private long cin;
    @Column
    private String ecole;
    @Column
    private Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;





}
