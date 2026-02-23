package com.aldeerdev.poo.leccion05_clasesabstractas;

public abstract class Vehiculo {

	protected String marca;
	protected int velocidad;

	public Vehiculo(String marca) {
		this.marca = marca;
		this.velocidad = 0;
	}

	// Método abstracto
	public abstract void acelerar();

	// Método concreto
	public void frenar() {
		velocidad -= 10;
		if (velocidad < 0) {
			velocidad = 0;
		}
		System.out.println("frenó. Velocidad actual: " + velocidad);
	}

	public void mostrarEstado() {
		System.out.println("Vehículo: " + marca);
		System.out.println("velocidad actual: " + velocidad);
	}
}
