package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Projet_Detail  implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "PD_ID")
        private Long id; // Identifiant projet detail (Clé primaire)

        @Column(name = "PD_DESCRIPTION")
        private String description;

        @Column(name = "PD_TECHNOLOGIE")
        private String technologie;

        @Column(name = "PD_COUT_PROVISOIRE")
        private Long cout_provisoire;

        @Temporal(TemporalType.DATE)
        private Date dateDebut;

}
