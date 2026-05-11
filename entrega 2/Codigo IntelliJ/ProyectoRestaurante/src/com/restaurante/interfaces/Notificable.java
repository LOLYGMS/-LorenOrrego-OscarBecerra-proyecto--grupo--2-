package com.restaurante.interfaces;

/**
 * Abstracción para el envío de notificaciones.
 * Principio DIP: Los servicios dependen de esta interfaz, no de una clase concreta.
 */
public interface Notificable {

    /**
     * Envía una notificación.
     * @param mensaje contenido del aviso
     * @param tipo tipo de notificación (PREPARACION, LISTO, FACTURA)
     */
    void enviarNotificacion(String mensaje, String tipo);
}