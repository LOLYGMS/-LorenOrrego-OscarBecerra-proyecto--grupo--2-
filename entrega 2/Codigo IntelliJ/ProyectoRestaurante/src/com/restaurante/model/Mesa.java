package com.restaurante.model;

public class Mesa {
    private String idMesa;
    private int numero;
    private boolean libre;

    public Mesa(String idMesa, int numero) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.libre = true;
    }

    public void setLibre(boolean libre) { this.libre = libre; }
    public boolean isLibre() { return libre; }
    public int getNumero() { return numero; }
}