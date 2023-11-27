package tn.esprit.firstproject.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Reservation implements Serializable {
    @Id
    @Column
    private String idReservation;
    @Column
    private Date anneeUniversite;
    @Column
    private Boolean estValide;
    @ManyToOne
    private Chambre chambre;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "reservations")
    private Set<Etudiant> etudiants;


    public Reservation() {
        this.idReservation = idReservation;
        this.anneeUniversite = anneeUniversite;
        this.estValide = estValide;
        this.chambre = chambre;
        this.etudiants = etudiants;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversite() {
        return anneeUniversite;
    }

    public void setAnneeUniversite(Date anneeUniversite) {
        this.anneeUniversite = anneeUniversite;
    }

    public Boolean getEstValide() {
        return estValide;
    }

    public void setEstValide(Boolean estValide) {
        this.estValide = estValide;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
