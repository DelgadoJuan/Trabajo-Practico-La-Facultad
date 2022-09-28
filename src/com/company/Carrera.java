package com.company;

import java.util.LinkedList;

public class Carrera {
    private String nombre;
    private LinkedList<Materia> materias;

    public Carrera(String nombre){
        this.nombre = nombre;
        this.materias = new LinkedList<Materia>();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getMaterias(){

        return materias;
    }

    public void agregarMateria(Materia materia){

        materias.add(materia);
    }

    public void eliminarMatera(String nombreMateria){
        for(Materia materia : materias){
            if(materia.getNombre() == nombreMateria){
                materias.remove(materia);
            }
        }
    }

    public void encontrarMateria(String nombreMateria){
        for(Materia materia: materias){
            if(materia.getNombre() == nombreMateria){
                System.out.println("La materia esta dentro de la carrera");
            }
        }
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", materias=" + materias +
                '}';
    }
}
