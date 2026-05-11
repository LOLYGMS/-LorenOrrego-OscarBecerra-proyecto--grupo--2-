package com.restaurante.model;

import com.restaurante.interfaces.Preparaable;
import com.restaurante.interfaces.Servible;

public class Postre extends ElementoMenu implements Preparaable, Servible {
    private boolean esDulce;

    public Postre(String id, String nombre, double precio, boolean esDulce) {
        super(id, nombre, precio);
        this.esDulce = esDulce;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando el postre: " + nombre);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo el postre en plato pequeño.");
    }

    @Override
    public String mostrarInformacion() {
        return "[POSTRE] " + nombre + " | Precio: $" + precio + " | Dulce: " + (esDulce ? "Sí" : "No");
    }
}