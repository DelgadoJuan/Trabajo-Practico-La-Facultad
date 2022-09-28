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
        try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
            System.out.print("¿Desea modificar el nombre? s/n: ");
            String opcion = scanner.nextLine();
            if (opcion.toLowerCase().equals("s")) {
                System.out.print("Ingrese el nombre: ");
                this.setNombre(scanner.nextLine());
            }
            System.out.print("¿Desea modificar el apellido? s/n: ");
            opcion = scanner.nextLine();
            if (opcion.toLowerCase().equals("s")) {
                System.out.print("Ingrese el apellido: ");
                this.setApellido(scanner.nextLine());
            }
            System.out.print("¿Desea modificar el legajo? s/n: ");
            opcion = scanner.nextLine();
            if (opcion.toLowerCase().equals("s")) {
                System.out.print("Ingrese el legajo: ");
                this.setLegajo(scanner.nextInt());
            }
            System.out.print("¿Desea modificar el sueldo básico? s/n: ");
            opcion = scanner.nextLine();
            if (opcion.toLowerCase().equals("s")) {
                System.out.print("Ingrese el básico: ");
                basico = scanner.nextDouble();
            }
            System.out.print("¿Desea modificar la antiguedad? s/n: ");
            opcion = scanner.nextLine();
            if (opcion.toLowerCase().equals("s")) {
                System.out.print("Ingrese la antiguedad: ");
                antiguedad = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Ingresó un dato erróneo.");
        }
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
