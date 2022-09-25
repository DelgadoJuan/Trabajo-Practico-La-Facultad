package com.company.entity;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellido='" + this.getApellido() + '\'' +
                ", legajo=" + this.getLegajo() +
                '}';
    }
}
