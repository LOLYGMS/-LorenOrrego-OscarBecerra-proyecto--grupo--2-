package com.restaurante;

import com.restaurante.model.*;
import com.restaurante.service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicialización de servicios
        ServicioNotificacion notificador = new ServicioNotificacion();
        GestorPedidos cocina = new GestorPedidos(notificador);
        GestorFacturacion caja = new GestorFacturacion();

        // Base de datos ficticia del menú
        ElementoMenu[] menuDisponibles = {
                new Plato("P1", "Bandeja Paisa", 25000),
                new Plato("P2", "Ajiaco", 22000),
                new Bebida("B1", "Limonada", 6000, false),
                new Bebida("B2", "Cerveza", 8000, true),
                new Postre("D1", "Postre de Natas", 12000, true)
        };

        Pedido miPedido = new Pedido("ORD-001");
        boolean salir = false;

        System.out.println("=== BIENVENIDO A RESTAURANTE APP ===");

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ver menú y agregar producto");
            System.out.println("2. Ver mi pedido actual");
            System.out.println("3. Eliminar último producto");
            System.out.println("4. Pagar y Salir");
            System.out.println("5. Salir sin pagar");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- CARTA ---");
                    for (int i = 0; i < menuDisponibles.length; i++) {
                        System.out.println((i + 1) + ". " + menuDisponibles[i].mostrarInformacion());
                    }
                    System.out.print("Elija el número del producto: ");
                    int seleccion = sc.nextInt();
                    if (seleccion > 0 && seleccion <= menuDisponibles.length) {
                        miPedido.agregarItem(menuDisponibles[seleccion - 1]);
                        System.out.println("¡Agregado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- TU PEDIDO ---");
                    if (miPedido.getItems().isEmpty()) {
                        System.out.println("El carrito está vacío.");
                    } else {
                        for (ElementoMenu item : miPedido.getItems()) {
                            System.out.println("- " + item.getNombre());
                        }
                        System.out.println("Total parcial: $" + miPedido.calcularTotal());
                    }
                    break;

                case 3:
                    miPedido.eliminarUltimoItem();
                    System.out.println("Último producto eliminado.");
                    break;

                case 4:
                    if (miPedido.getItems().isEmpty()) {
                        System.out.println("No hay nada que pagar.");
                    } else {
                        cocina.procesarPedido(miPedido);
                        caja.generarFactura(miPedido);
                        System.out.println("¡Gracias por su compra!");
                        salir = true;
                    }
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}