package com.company.entity;

import java.util.Comparator;
import java.util.List;

public class Carrera implements Informacion{
    private String nombre;
    private List<Materia> coleccionMaterias;

    public Carrera(String nombre, List<Materia> coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(List<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        StringBuilder cadena = new StringBuilder();
        coleccionMaterias.sort((Comparator.comparing(Materia::toString)));
        for (Materia materia: coleccionMaterias) {
            cadena.append(materia.toString()).append("\n");
        }
        return String.valueOf(cadena);
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }
}
