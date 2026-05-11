package com.restaurante.service;

import com.restaurante.interfaces.Notificable;
import com.restaurante.interfaces.Preparaable;
import com.restaurante.model.ElementoMenu;
import com.restaurante.model.Pedido;

public class GestorPedidos {
    // Este es el atributo que faltaba conectar
    private Notificable notificador;

    // El constructor DEBE recibir el notificador para que el Main no de error
    public GestorPedidos(Notificable notificador) {
        this.notificador = notificador;
    }

    public void procesarPedido(Pedido pedido) {
        System.out.println("\n>>> COCINA: Preparando orden #" + pedido.getIdPedido());
        for (ElementoMenu item : pedido.getItems()) {
            if (item instanceof Preparaable) {
                ((Preparaable) item).preparar();
            }
        }
        // Usamos el notificador que recibimos en el constructor
        notificador.enviarNotificacion("Pedido " + pedido.getIdPedido() + " terminado.", "COCINA");
    }
}