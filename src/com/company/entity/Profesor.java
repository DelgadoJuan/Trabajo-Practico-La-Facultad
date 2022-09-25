package com.company.entity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Profesor extends Persona {
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    @Override
    public void modificarDatos() {

    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre=" + this.getNombre() +
                ", apellido=" + this.getApellido() +
                ", legajo=" + this.getLegajo() +
                ", basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
