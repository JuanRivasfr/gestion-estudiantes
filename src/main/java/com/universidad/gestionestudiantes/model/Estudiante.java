package com.universidad.gestionestudiantes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private Double nota;

    // Constructor vacío necesario para JPA
    public Estudiante() {}

    public Estudiante(String nombre, String correo, Double nota) {
        this.nombre = nombre;
        this.correo = correo;
        this.nota = nota;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }
}
