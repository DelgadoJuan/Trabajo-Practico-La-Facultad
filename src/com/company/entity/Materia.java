package com.company.entity;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Materia implements Informacion {
    private String nombre;
    private Profesor titular;
    private List<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular, List<Estudiante> coleccionEstudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }
}
