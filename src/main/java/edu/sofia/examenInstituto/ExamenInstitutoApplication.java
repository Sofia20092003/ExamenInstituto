package edu.sofia.examenInstituto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.sofia.examenInstituto.repositories.IAsignaturaRepository;
import edu.sofia.examenInstituto.repositories.IEstudianteRepository;
import edu.sofia.examenInstituto.repositories.IMatriculaRepository;

@SpringBootApplication
public class ExamenInstitutoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteRepository estudianteRepository;
	@Autowired
	private IAsignaturaRepository asignaturaRepository;
	@Autowired
	private IMatriculaRepository matriculaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamenInstitutoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
