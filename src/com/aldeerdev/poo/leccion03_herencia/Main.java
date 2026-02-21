package com.aldeerdev.poo.leccion03_herencia;

public class Main {

	public static void main(String[] args) {

		// Crear objetos
		Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 2000, 500);
		Empleado empleado2 = new EmpleadoPorHoras("Pedro", 20, 80);
		Empleado empleado3 = new EmpleadoFreelance("Mateo", 1000, 2);

		empleado1.mostrarInformacion();
		System.out.println("---------------");
		empleado2.mostrarInformacion();
		System.out.println("---------------");
		empleado3.mostrarInformacion();
	}

}
