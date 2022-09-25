package com.company.entity;

import java.util.List;

public class Carrera implements Informacion{
    private String nombre;
    private List<Materia> coleccionMaterias;

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }
}
