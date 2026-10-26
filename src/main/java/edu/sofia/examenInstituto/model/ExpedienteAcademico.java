package edu.sofia.examenInstituto.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "expedientes")
public class ExpedienteAcademico {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 10)
    private String numero_expediente;
    @Column (nullable = false)
    private LocalDate fecha_apertura;
    @Column (nullable = false)
    private Double nota_media_acceso;
    
    public ExpedienteAcademico() {
    }

    public ExpedienteAcademico(String numero_expediente, LocalDate fecha_apertura, Double nota_media_acceso) {
        this.numero_expediente = numero_expediente;
        this.fecha_apertura = fecha_apertura;
        this.nota_media_acceso = nota_media_acceso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero_expediente() {
        return numero_expediente;
    }

    public void setNumero_expediente(String numero_expediente) {
        this.numero_expediente = numero_expediente;
    }

    public LocalDate getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(LocalDate fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public Double getNota_media_acceso() {
        return nota_media_acceso;
    }

    public void setNota_media_acceso(Double nota_media_acceso) {
        this.nota_media_acceso = nota_media_acceso;
    }

    @Override
    public String toString() {
        return "ExpedienteAcademico [id=" + id + ", numero_expediente=" + numero_expediente + ", fecha_apertura="
                + fecha_apertura + ", nota_media_acceso=" + nota_media_acceso + "]";
    }

    
    

}
