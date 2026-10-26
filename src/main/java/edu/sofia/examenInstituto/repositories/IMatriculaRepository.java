package edu.sofia.examenInstituto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sofia.examenInstituto.model.Matricula;

public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {

}
