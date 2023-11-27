package tn.esprit.firstproject.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.firstproject.Entity.Bloc;

public interface BlocRepository extends CrudRepository<Bloc,Long> {
    Bloc affecterChambresABloc();
}
