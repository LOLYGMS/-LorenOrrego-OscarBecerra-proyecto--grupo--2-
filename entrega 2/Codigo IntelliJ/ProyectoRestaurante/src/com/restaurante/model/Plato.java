package com.restaurante.model;

import com.restaurante.interfaces.Preparaable;
import com.restaurante.interfaces.Servible;

/**
 * Implementa ambas interfaces porque se cocina y se sirve.
 */
public class Plato extends ElementoMenu implements Preparaable, Servible {

    public Plato(String id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public void preparar() {
        System.out.println("Cocinando el plato: " + nombre);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo el plato caliente en la mesa.");
    }

    @Override
    public String mostrarInformacion() {
        return "[PLATO] " + nombre + " | Precio: $" + precio;
    }
}