package tn.esprit.firstproject.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.Entity.Etudiant;

import java.util.List;
@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {
    @Query("select e from  Etudiant e")
    List<Etudiant> retrieveAllEtudiants();

    @Modifying
    @Query(value = "INSERT INTO Etudiant VALUES (:e)",nativeQuery = true)
    Etudiant addEtudiant(@Param("e")  Etudiant e);

//    @Query("update Etudiant etu set etu =(:e) where etu.idEtudiant =: e.idEtudiant")
//    Etudiant updateEtudiant(@Param("e") Etudiant e);

    @Query("select e from Etudiant e where e.id_etudiant =: id")
    Etudiant retrieveEtudiant(@Param("id") Long idEtudiant);

    @Modifying
    @Query("DELETE FROM Etudiant e WHERE e.id_etudiant= ?1")
    void removeEtudiant(Long idEtudiant);
}
