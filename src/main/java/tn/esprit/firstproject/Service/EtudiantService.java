package tn.esprit.firstproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.Entity.Etudiant;
import tn.esprit.firstproject.Repository.EtudiantRepository;

import java.util.List;
@Primary
@Service
public class EtudiantService implements IEtudiantService  {
    @Autowired
    private EtudiantRepository ERep;

    @Override
    public List<Etudiant> retrieveAllEtudiants(){
        return ERep.retrieveAllEtudiants();
    };
    @Override
    public Etudiant addEtudiant(Etudiant e){
        return ERep.addEtudiant(e);
    };
//    @Override
//    public Etudiant updateEtudiant(Etudiant e){
//        return ERep.updateEtudiant(e);
//    };
    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant){
        return ERep.retrieveEtudiant(idEtudiant);
    };
    @Override
    public void removeEtudiant(Long idEtudiant){
        ERep.removeEtudiant(idEtudiant);
    };

}
