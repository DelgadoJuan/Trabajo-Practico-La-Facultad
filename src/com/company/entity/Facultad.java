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
        for (Carrera carrera: coleccionCarreras) {
            cadena.append(carrera.toString()).append("\n");
        }
        return String.valueOf(cadena);
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

        for (Carrera carrera: coleccionCarreras){
            if (carrera.getNombre().equals(nombreCarrera)){
                coleccionCarreras.remove(carrera);
            }
        }
    }
    public void eliminarEstudiante(Estudiante estudiante){
        for (Carrera carrera: coleccionCarreras){
            for(Materia materia: carrera.getColeccionMaterias()){
                for(Estudiante estudiante1: materia.getColeccionEstudiantes()){
                    if (estudiante1.equals(estudiante)){
                        materia.getColeccionEstudiantes().remove(estudiante1);
                    }
                }
            }
        }
    }
}
