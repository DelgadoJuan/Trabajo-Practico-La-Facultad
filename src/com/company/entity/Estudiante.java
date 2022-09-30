package com.company.entity;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    public Estudiante() {
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
        } catch (InputMismatchException e) {
            System.out.println("Ingresó un dato erróneo.");
        }
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
