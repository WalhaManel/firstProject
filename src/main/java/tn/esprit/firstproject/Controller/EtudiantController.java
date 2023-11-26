package tn.esprit.firstproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.firstproject.Entity.Etudiant;
import tn.esprit.firstproject.Service.EtudiantService;

@Controller
@RestController
public class EtudiantController {
    @Autowired
    EtudiantService ESer;

    @GetMapping("/all")
    public Iterable<Etudiant> getAllEtudiants(){
        return ESer.retrieveAllEtudiants();
    }


}
