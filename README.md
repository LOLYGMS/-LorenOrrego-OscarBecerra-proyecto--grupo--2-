# -LorenOrrego-OscarBecerra-proyecto--grupo--2-
# Diseño del Sistema de Gestión de Restaurante - UML

Este proyecto presenta el diagrama de clases para un sistema de administración de restaurante, desarrollado como parte de mi formación en la tecnología de Desarrollo de Software. El objetivo principal fue estructurar la lógica del negocio aplicando los pilares de la Programación Orientada a Objetos (POO).

##  Aspectos Técnicos del Diseño

Para este modelo, me enfoqué en crear una estructura limpia y fácil de escalar:

* **Encapsulamiento:** Definí todos los atributos como privados (`-`) y utilicé métodos **Getters** y **Setters** para controlar el acceso a la información.
* **Abstracción:** Implementé la clase abstracta `ElementoMenu` para agrupar los datos comunes de `Plato`, `Bebida` y `Postre`, evitando la duplicidad de código.
* **Interfaces:** Utilicé las interfaces `Preparable` y `Servible` para definir comportamientos específicos según el tipo de producto.
* **Flujo Operativo:** La clase `Pedido` centraliza la gestión, vinculando las mesas con los empleados y conectando directamente con la generación de la `Factura`.

##  Herramientas Utilizadas

* **Modelado:** Draw.io para la construcción del diagrama UML.
* **IDE de Referencia:** Los conceptos de clases y métodos están alineados con el uso de **IntelliJ IDEA**.


## Información del Proyecto

* **Estudiante:** Loren Orrego y Oscar Becerra
* **Programa:** Ingenieria de Sistemas
* **Fecha:** Abril 2026.
