package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EQUIPE_ID")
    private Long id; // Identifiant equipe (Clé primaire)

    @Column(name = "EQUIPE_NOM")
    private String nom;

    @Column(name = "EQUIPE_SPECIALITE")
    private String specialite;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Projet> projets;
}
