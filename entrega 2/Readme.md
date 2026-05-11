# Sistema de Gestión de Restaurante

Este proyecto es una aplicación de consola interactiva desarrollada en Java que permite gestionar pedidos en un restaurante. El diseño se basa en principios de arquitectura limpia y buenas prácticas de programación orientada a objetos (SOLID).

## Características
- Menú Interactivo Navegación por consola mediante `Scanner`.
- Gestión de Pedidos Permite agregar y eliminar productos en tiempo real.
- Procesamiento de Cocina Identifica automáticamente qué productos requieren preparación mediante polimorfismo.
- Facturación Automática Calcula montos totales e impuestos de forma precisa.
- Arquitectura SOLID Implementación de interfaces segregadas y desacoplamiento de servicios.

##  Estructura del Proyecto (Paquetes)

El proyecto está organizado en tres capas principales

1.  `com.restaurante.interfaces` Contiene los contratos de comportamiento (`Preparaable`, `Servible`, `Notificable`).
2.  `com.restaurante.model` Contiene las entidades de datos y la jerarquía de herencia (`ElementoMenu`, `Plato`, `Bebida`, `Postre`, `Pedido`, `Mesa`, `Factura`).
3.  `com.restaurante.service` Contiene la lógica de negocio (`GestorPedidos`, `GestorFacturacion`, `ServicioNotificacion`).

##  Principios SOLID Aplicados

- SRP (Single Responsibility Principle) Cada gestor tiene una única función (cocinar o cobrar).
- ISP (Interface Segregation Principle) Las bebidas no están obligadas a implementar la interfaz de preparación.
- DIP (Dependency Inversion Principle) El sistema de notificaciones depende de una interfaz, permitiendo cambiar el medio de aviso sin afectar la lógica interna.

## Requisitos
- Java JDK 17 o superior.
- IntelliJ IDEA (u otro IDE compatible con Java).

##  Autores
- Loren Dayana Orrego Botero
- Oscar Fernando Becerra Lancheros

---
Proyecto presentado a: Julian Andres Castro Quimbayo