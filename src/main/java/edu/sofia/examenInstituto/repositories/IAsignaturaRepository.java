package edu.sofia.examenInstituto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sofia.examenInstituto.model.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {

}
