package tn.esprit.firstproject.Controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.firstproject.Entity.Etudiant;
import tn.esprit.firstproject.Service.EtudiantService;

@Controller
@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("api/etudiants")
public class EtudiantController {
    @Autowired
    EtudiantService ESer;

    @GetMapping("/all")
    public Iterable<Etudiant> getAllEtudiants(){
        return ESer.retrieveAllEtudiants();
    }


}
