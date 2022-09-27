package com.company;

import java.util.Scanner;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo(){
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void modificarDatos(){
        Scanner eleccion = new Scanner(System.in);
        int opcion, legajo;
        String nombre, apellido;

        System.out.println("Que datos desea modificar?");
        System.out.println("Eliga su opcion: 1)nombre \n2)apellido \n3)legajo");
        opcion = eleccion.nextInt();
        eleccion.nextLine();

        if(opcion == 1){
            System.out.println("ingrese el nombre a modificar");
            nombre = eleccion.nextLine();
            setNombre(nombre);
            System.out.println(getNombre() + ", " + getApellido());
        }else if(opcion == 2){
            System.out.println("ingrese el apeliido a modificar");
            apellido = eleccion.nextLine();
            setApellido(apellido);
            System.out.println(getNombre() + ", " + getApellido());
        }else if(opcion == 3){
            System.out.println("ingrese el legajo a modificar");
            legajo = eleccion.nextInt();
            setLegajo(legajo);
            System.out.println(getLegajo());
        }else{
            System.out.println("el numero elegido no figura dentro de las opciones");
        }
    }

    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Legajo: " + legajo;
    }


}
