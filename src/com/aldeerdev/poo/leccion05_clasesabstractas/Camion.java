package com.aldeerdev.poo.leccion05_clasesabstractas;

public class Camion extends Vehiculo {

	// Atributo privado
	private int capacidadCarga;

	// Constructor
	public Camion(String marca, int capacidadCarga) {
		super(marca);
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void acelerar() {
		velocidad += 10;
		System.out.println(marca + " aceleró");
	}

	@Override
	public void mostrarEstado() {
		System.out.println("Vehiculo: " + marca);
		System.out.println("Velocidad actual: " + velocidad);
		System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
	}
}
