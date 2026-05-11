package com.restaurante.service;

import com.restaurante.interfaces.Notificable;

public class ServicioNotificacion implements Notificable {

    @Override
    public void enviarNotificacion(String mensaje, String tipo) {
        // Simulación de envío de alerta
        System.out.println("[ALERTA - " + tipo + "]: " + mensaje);
    }
}