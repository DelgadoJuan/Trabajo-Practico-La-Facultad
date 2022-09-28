package com.company.entity;

import java.util.Comparator;
import java.util.List;

public class Materia implements Informacion {
    private String nombre;
    private Profesor titular;
    private List<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular, List<Estudiante> coleccionEstudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public List<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(List<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        StringBuilder cadena = new StringBuilder();
        coleccionEstudiantes.sort((Comparator.comparing(Estudiante::toString)));
        for (Estudiante estudiante: coleccionEstudiantes) {
            cadena.append(estudiante.toString()).append("\n");
        }
        return String.valueOf(cadena);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }
}
