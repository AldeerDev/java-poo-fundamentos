# Lección 01 - Clases y Objetos

## Objetivo

Comprender qué es una clase, qué es un objeto y cómo funcionan en memoria dentro de Java.

---

## Conceptos clave

- Clase
- Objeto
- Atributos
- Métodos
- Constructor
- Instanciación
- Palabra clave `this`

---

## ¿Qué es una Clase?

Una clase es un molde que define las características y comportamiento de un objeto.

Ejemplo:

```java
public class Persona {
    String nombre;
    int edad;

    public void saludar() {
        System.out.println("Hola soy " + nombre + " tengo " + edad + " años");
    }
}