package com.company;

import com.company.entity.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Facultad facultad = new Facultad("UTN", new ArrayList<>());
        Carrera carrera = new Carrera("Tecnicatura en Programación", new ArrayList<>());
        Carrera carrera1 = new Carrera("Ingenieria en Sistemas", new ArrayList<>());

        Materia materia = new Materia("Fisica I", new Profesor("Jorge", "Barabas", 15000, 50000,10), new ArrayList<>());
        System.out.println("Agregue estudiante a la materia Fisica I");
        materia.setColeccionEstudiantes(agregarEstudiante());

        Materia materia1 = new Materia("Laboratorio II", new Profesor("Facundo", "Uferer", 16400, 50000,7), new ArrayList<>());
        System.out.println("Agregue estudiante a la materia Laboratorio II");
        materia1.setColeccionEstudiantes(agregarEstudiante());

        Materia materia2 = new Materia("Programación II", new Profesor("Facundo", "Mattof", 12510, 50000,8), new ArrayList<>());
        System.out.println("Agregue estudiante a la materia Programación II");
        materia2.setColeccionEstudiantes(agregarEstudiante());

        carrera1.agregarMateria(materia);
        carrera.setColeccionMaterias(new ArrayList<>(){{
            add(materia1);
            add(materia2);
        }});

        facultad.agregarCarrera(carrera);
        facultad.agregarCarrera(carrera1);

        System.out.println(facultad.listarContenidos());
        System.out.println(carrera.listarContenidos());



    }
    public static List<Estudiante> agregarEstudiante(){
        List<Estudiante> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opc = "s";
        while (opc.toLowerCase().equals("s")){
            Estudiante estudiante = new Estudiante();
            System.out.print("Ingrese el nombre: ");
            estudiante.setNombre(scanner.next());
            System.out.print("Ingrese el apellido: ");
            estudiante.setApellido(scanner.next());
            try {
                System.out.print("Ingrese el legajo: ");
                estudiante.setLegajo(scanner.nextInt());
            }catch (InputMismatchException exception){
                System.out.print("Ingreso mal el legajo.");
            }
            estudiantes.add(estudiante);
            System.out.print("¿Desea seguir agregando estudiantes? s/n: ");
            opc = scanner.next();

        }
        return estudiantes;
    }
}
