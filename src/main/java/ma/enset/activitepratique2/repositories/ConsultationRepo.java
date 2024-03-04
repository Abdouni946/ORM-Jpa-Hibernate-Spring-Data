package ma.enset.activitepratique2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.enset.activitepratique2.entities.Consultation;

public interface ConsultationRepo extends JpaRepository<Consultation, Long> {

}