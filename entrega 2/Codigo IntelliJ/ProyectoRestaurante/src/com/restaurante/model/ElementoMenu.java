package com.restaurante.model;

/**
 * Clase abstracta: No se puede instanciar directamente.
 * Principio OCP: Abierta para extenderse a nuevos productos.
 */
public abstract class ElementoMenu {
    protected String id;
    protected String nombre;
    protected double precio;

    public ElementoMenu(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    /**
     * Método abstracto obligatorio para todas las subclases.
     */
    public abstract String mostrarInformacion();
}