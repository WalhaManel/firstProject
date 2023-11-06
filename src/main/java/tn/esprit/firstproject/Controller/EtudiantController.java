package tn.esprit.firstproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import tn.esprit.firstproject.Entity.Etudiant;
import tn.esprit.firstproject.Service.EtudiantService;

import java.util.List;

@Controller
public class EtudiantController {
    @Autowired
    EtudiantService ESer;

    public EtudiantController(EtudiantService ESer) {
        this.ESer = ESer;
    }

    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants(){
        return ESer.retrieveAllEtudiants();
    }

}
