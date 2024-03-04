package ma.enset.activitepratique2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.activitepratique2.entities.Medecin;

public interface MedecinRepo extends JpaRepository<Medecin, Long> {

}