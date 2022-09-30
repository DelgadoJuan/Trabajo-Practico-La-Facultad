package com.company.entity;

import java.util.Comparator;
import java.util.List;

public class Facultad implements Informacion {
    private String nombre;
    private List<Carrera> coleccionCarreras;

    public Facultad(String nombre, List<Carrera> coleccionCarreras) {
        this.nombre = nombre;
        this.coleccionCarreras = coleccionCarreras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(List<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        StringBuilder cadena = new StringBuilder();
        coleccionCarreras.sort((Comparator.comparing(Carrera::toString)));
        System.out.print("Carreras de la facultad: " + this.nombre + "\n");
        if (coleccionCarreras.isEmpty())
            return "La facultad no tiene ninguna carrera asociada.";
        for (Carrera carrera: coleccionCarreras) {
            cadena.append(carrera.getNombre()).append("\n");
        }
        return cadena.toString();
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarreras=" + coleccionCarreras +
                '}';
    }

    public void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }
    public void eliminarCarrera(String nombreCarrera){
        coleccionCarreras.removeIf(carrera -> carrera.getNombre().equals(nombreCarrera));
    }
    public void eliminarEstudiante(Estudiante estudiante){
        for (Carrera carrera: coleccionCarreras){
            for(Materia materia: carrera.getColeccionMaterias()){
                materia.getColeccionEstudiantes().removeIf(estudiante1 -> estudiante1.equals(estudiante));
            }
        }
    }
}
