package com.aldeerdev.poo.leccion05_clasesabstractas;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// crear arreglo de objeto vehiculo
		Vehiculo[] vehiculos = new Vehiculo[4];

		// agregar instancias de distintos vehiculos al arreglo
		vehiculos[0] = new Automovil("Toyota");
		vehiculos[1] = new Motovehiculo("Yamaha");
		vehiculos[2] = new Bicicleta("GLP");
		vehiculos[3] = new Camion("Scania", 25000);

		// recorrer el arreglo
		for (Vehiculo vehiculo : vehiculos) {
			// acelerar vehiculo
			vehiculo.acelerar();

			// mostrar estado del vehiculo
			vehiculo.mostrarEstado();

			// frenar vehiculo
			vehiculo.frenar();
			System.out.println("---------------");
		}
	}

}
