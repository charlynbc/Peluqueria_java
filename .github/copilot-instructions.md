# Copilot Instructions for Peluqueria_java

## Visión General
Este proyecto es una aplicación Java para la gestión de una peluquería. Los clientes pueden crear usuarios (el email es la clave única) y realizar reservas.

## Estructura Principal
- `src/Cliente.java`: Lógica y atributos del cliente.
- `src/Fecha.java`: Manejo de fechas para reservas.
- `src/Reserva.java`: Gestión de reservas.
- `src/Main.java`: Punto de entrada de la aplicación, orquesta la interacción entre componentes.

## Flujos y Patrones Clave
- **Identificación de usuario:** El email es el identificador único para los clientes.
- **Reservas:** Los clientes pueden crear reservas asociadas a su usuario.
- **Separación de responsabilidades:** Cada clase representa una entidad principal del dominio (Cliente, Reserva, Fecha).

## Convenciones y Prácticas
- No se utilizan frameworks externos ni dependencias fuera de la biblioteca estándar de Java.
- Los archivos `.java` están en el directorio `src/` y no hay subpaquetes.
- El código sigue una estructura orientada a objetos simple, sin patrones avanzados.

## Workflows de Desarrollo
- **Compilación:**
  ```bash
  javac src/*.java
  ```
- **Ejecución:**
  ```bash
  java -cp src Main
  ```
- No existen scripts de build ni tests automatizados.

## Ejemplo de Uso
- Crear un cliente: instanciar `Cliente` con email único.
- Crear una reserva: instanciar `Reserva` asociada a un `Cliente` y una `Fecha`.

## Reglas Específicas
- El email debe ser único para cada cliente.
- Las reservas deben estar asociadas a un cliente existente.

## Archivos Clave
- `README.md`: Breve descripción del proyecto.
- `src/`: Contiene toda la lógica de la aplicación.

---

Para cambios estructurales, mantener la simplicidad y la orientación a objetos. Documentar cualquier convención nueva en este archivo.
