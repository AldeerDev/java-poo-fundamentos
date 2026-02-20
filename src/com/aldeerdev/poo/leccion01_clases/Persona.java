package com.aldeerdev.poo.leccion01_clases;

public class Persona {

	// Atributos
	String nombre;
	int edad;

	// Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Método
	public void saludar() {
		System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
	}

	// Mètodo
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
}
