package com.restaurante.service;

import com.restaurante.model.ElementoMenu;
import com.restaurante.model.Pedido;

public class GestorFacturacion {

    public void generarFactura(Pedido pedido) {
        System.out.println("\n********** FACTURA DE VENTA **********");
        System.out.println("Orden: " + pedido.getIdPedido());

        for (ElementoMenu item : pedido.getItems()) {
            System.out.println("- " + item.getNombre() + ": $" + item.getPrecio());
        }

        System.out.println("--------------------------------------");
        System.out.println("TOTAL FINAL: $" + pedido.calcularTotal());
        System.out.println("**************************************\n");
    }
}