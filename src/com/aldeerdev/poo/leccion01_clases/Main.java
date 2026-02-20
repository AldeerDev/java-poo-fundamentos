package com.aldeerdev.poo.leccion01_clases;

public class Main {

	public static void main(String[] args) {

		// Crear objetos
		Persona persona1 = new Persona("Juan", 15);
		Persona persona2 = new Persona("Pedro", 26);

		// Usar método saludar
		persona1.saludar();
		persona2.saludar();

		// Usar método esMayorDeEdad
		System.out.println(persona1.esMayorDeEdad());
		System.out.println(persona2.esMayorDeEdad());

	}

}
