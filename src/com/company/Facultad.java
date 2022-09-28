package com.company;

import java.util.LinkedList;

public class Facultad {
    private String nombre;
    private LinkedList<Carrera> coleccionCarrera;


    public Facultad(String nombre){
        this.nombre = nombre;
        this.coleccionCarrera = new LinkedList<Carrera>();
    }

    public void agregarCarrera(Carrera carreraNueva){
        coleccionCarrera.add(carreraNueva);
    }


    public void eliminarCarrera(String nombreCarrera){
        for(Carrera carrera: coleccionCarrera){
            if(carrera.getNombre() == nombreCarrera){
                coleccionCarrera.remove(carrera);
            }
        }
    }




}
