package com.aldeerdev.poo.leccion02_encapsulamiento;

public class Persona {

	// Atributos privados
	private String nombre;
	private int edad;

	// Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		setEdad(edad); // usar setter para validar

	}

	// Getter nombre
	public String getNombre() {
		return nombre;
	}

	// Setter nombre
	public void setNombre(String nombre) {
		if (nombre == null || nombre.isBlank()) {
			System.out.println("Nombre vacio. Se asignará `sin nombre`");
			this.nombre = "sin nombre";
		} else {
			this.nombre = nombre;
		}
	}

	// Getter edad
	public int getEdad() {
		return edad;
	}

	// Setter edad con validacion
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		} else {
			System.out.println("Edad inválida. Se asignará 0.");
			this.edad = 0;
		}
	}

	// Método
	public void saludar() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
	}

}
