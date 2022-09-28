package com.company;

import java.util.LinkedList;

public class Materia {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public Profesor getTitular(){

        return titular;
    }

    public void setTitular(Profesor titular) {

        this.titular = titular;
    }

    public Materia(String nombre, Profesor titular){
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }

    public void eliminarEstudiante(int legajo){
        for (Estudiante estudiante: coleccionEstudiantes){
            if(estudiante.getLegajo() == legajo){
                coleccionEstudiantes.remove(estudiante);
            }
        }
    }

    public void modificarTitular(Profesor profesor){
        this.titular = titular;
    }

    public void agregarEstudiante(Estudiante estudiante){

        coleccionEstudiantes.add(estudiante);
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
