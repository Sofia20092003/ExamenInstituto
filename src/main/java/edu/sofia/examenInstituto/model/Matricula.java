package edu.sofia.examenInstituto.model;

import java.time.LocalDate;

import edu.sofia.examenInstituto.enums.Convocatoria;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "matriculas")
public class Matricula {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private LocalDate fecha_matriculacion;
    @Column 
    private Double calificacion;
    @Enumerated(EnumType.STRING)
    @Column 
    private Convocatoria convocatoria;

    @ManyToOne
    @JoinColumn (name = "id_estudiante", referencedColumnName = "id")
    private Estudiante estudiante;

    @ManyToOne 
    @JoinColumn (name = "id_asignatura", referencedColumnName = "id")
    private Asignatura asignatura;

    public Matricula() {
    }

    public Matricula(LocalDate fecha_matriculacion, Double calificacion, Convocatoria convocatoria, Estudiante estudiante, Asignatura asignatura) {
        this.fecha_matriculacion = fecha_matriculacion;
        this.calificacion = calificacion;
        this.convocatoria = convocatoria;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha_matriculacion() {
        return fecha_matriculacion;
    }

    public void setFecha_matriculacion(LocalDate fecha_matriculacion) {
        this.fecha_matriculacion = fecha_matriculacion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Matricula [id=" + id + ", fecha_matriculacion=" + fecha_matriculacion + ", calificacion=" + calificacion
                + ", convocatoria=" + convocatoria + ", estudiante=" + estudiante + ", asignatura=" + asignatura + "]";
    }


    

}
