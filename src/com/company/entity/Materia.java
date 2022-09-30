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

    public void modificarTitular(Profesor titular) {
        this.titular = titular;
    }

    public List<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(List<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        coleccionEstudiantes.add(estudiante);
    }

    public void eliminarEstudiante(int legajo) {
        coleccionEstudiantes.removeIf(estudiante -> estudiante.getLegajo() == legajo);
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        StringBuilder cadena = new StringBuilder();
        coleccionEstudiantes.sort((Comparator.comparing(Estudiante::toString)));
        System.out.print("Estudiantes de la materia: " + this.nombre + "\n");
        if (coleccionEstudiantes.isEmpty())
            return "La materia no tiene ningun estudiante.";
        for (Estudiante estudiante: coleccionEstudiantes) {
            cadena.append("Legajo: ").append(estudiante.getLegajo()).append(", Nombre: ").append(estudiante.getNombre()).append(" ").append(estudiante.getApellido()).append("\n");
        }
        return cadena.toString();
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
