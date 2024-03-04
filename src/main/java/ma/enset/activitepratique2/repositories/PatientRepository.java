package ma.enset.activitepratique2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.enset.activitepratique2.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}