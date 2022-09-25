package com.company.entity;

import java.util.List;

public class Facultad implements Informacion {
    private String nombre;
    private List<Carrera> coleccionCarreras;

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }
}
