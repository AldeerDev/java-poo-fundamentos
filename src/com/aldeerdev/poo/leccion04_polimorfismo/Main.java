package com.aldeerdev.poo.leccion04_polimorfismo;

public class Main {

	public static void main(String[] args) {

		// Arreglo de objeto empleado
		Empleado[] empleados = new Empleado[4];

		// Crear y agregar tipos de empleados al arreglo
		empleados[0] = new EmpleadoTiempoCompleto("Juan", 3000, 1000);
		empleados[1] = new EmpleadoPorHora("Pedro", 500, 9);
		empleados[2] = new EmpleadoTiempoCompleto("Mateo", 4000, 1500);
		empleados[3] = new EmpleadoFreelance("Maria", 2000, 3);

		// recorrer arreglo de empleado
		for (Empleado empleado : empleados) {
			empleado.mostrarInformacion();
			System.out.println("---------------");
		}
	}
}
