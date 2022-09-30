package com.company.entity;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Carrera implements Informacion{
    private String nombre;
    private List<Materia> coleccionMaterias;

    public Carrera(String nombre, List<Materia> coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(List<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        String cadena = "";
        coleccionMaterias.sort((Comparator.comparing(Materia::toString)));
        System.out.print("Materias de la carrera: " + this.nombre + "\n");
        if (coleccionMaterias.isEmpty())
            return "La carrera no tiene ninguna materia asociada.";
        for (Materia materia: coleccionMaterias) {
            cadena += "Materia: " + materia.getNombre() + "\n";
            cadena += "Profesor: " + materia.getTitular().getNombre() + " " + materia.getTitular().getApellido() +
                    ", Legajo: " + materia.getTitular().getLegajo() + ", Básico: " + materia.getTitular().getBasico() +
                    ", Antiguedad: " + materia.getTitular().getAntiguedad() + "\nEstudiantes:\n";
            for (Estudiante estudiante: materia.getColeccionEstudiantes()) {
                cadena += "Legajo: " + estudiante.getLegajo() + ", Nombre: " + estudiante.getNombre() + " " + estudiante.getApellido() + "\n";
            }
            cadena += "\n";
        }
        return cadena;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

    public void eliminarMateria(String nombreMateria){
        coleccionMaterias.removeIf(materia -> materia.getNombre().equals(nombreMateria));
    }

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }
    public void encontrarMateria(String nombreMateria){
        Iterator<Materia> iterator = coleccionMaterias.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNombre().equals(nombreMateria)){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Se encontro la materia ¿Desea eliminarla? s/n: ");
                String opcion = scanner.nextLine();
                if (opcion.equals("s")){
                    iterator.remove();
                    System.out.println("Se eliminó la materia con éxito.");
                }
                scanner.close();
            }
        }
    }
}
