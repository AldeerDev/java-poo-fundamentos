package com.aldeerdev.poo.leccion02_encapsulamiento;

public class Main {

	public static void main(String[] args) {

		// Crear objeto
		Persona persona = new Persona("Juan", 22);

		persona.saludar();

		// Intentar modificar edad
		persona.setEdad(-10);

		System.out.println("Edad actual: " + persona.getEdad());

		// Intentar asignar nombre vacio
		persona.setNombre(null);

	}

}
