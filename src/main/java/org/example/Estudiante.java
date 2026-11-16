package org.example;

import lombok.Data;

@Data
public class Estudiante {
    private String nombre;
    private int edad;
    private int curso;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}