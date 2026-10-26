package edu.sofia.examenInstituto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false, length = 100, unique = true)
    private String dni;
    @Column (nullable = false, length = 100)
    private String nombre;
    @Column (nullable = false, length = 100)
    private String apellidos;

    @OneToOne 
    @JoinColumn (name = "id_expediente", referencedColumnName = "id")
    private ExpedienteAcademico expedienteAcademico;

    public Estudiante() {
    }

    public Estudiante(String dni, String nombre, String apellidos, ExpedienteAcademico expedienteAcademico) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.expedienteAcademico = expedienteAcademico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ExpedienteAcademico getExpedienteAcademico() {
        return expedienteAcademico;
    }

    public void setExpedienteAcademico(ExpedienteAcademico expedienteAcademico) {
        this.expedienteAcademico = expedienteAcademico;
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", expedienteAcademico=" + expedienteAcademico + "]";
    }

    
}
