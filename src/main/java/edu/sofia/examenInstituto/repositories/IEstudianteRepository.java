package edu.sofia.examenInstituto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sofia.examenInstituto.model.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

}
