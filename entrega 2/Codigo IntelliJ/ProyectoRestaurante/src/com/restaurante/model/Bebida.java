package com.restaurante.model;

import com.restaurante.interfaces.Servible;

/**
 * Principio ISP: NO implementa Preparaable porque solo se sirve.
 */
public class Bebida extends ElementoMenu implements Servible {
    private boolean esAlcoholica;

    public Bebida(String id, String nombre, double precio, boolean esAlcoholica) {
        super(id, nombre, precio);
        this.esAlcoholica = esAlcoholica;
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo la bebida: " + nombre + (esAlcoholica ? " (Con alcohol)" : ""));
    }

    @Override
    public String mostrarInformacion() {
        return "[BEBIDA] " + nombre + " | Precio: $" + precio + " | Alcohol: " + (esAlcoholica ? "Sí" : "No");
    }
}