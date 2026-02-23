package com.aldeerdev.poo.leccion05_clasesabstractas;

public class Automovil extends Vehiculo {

	// Constructor
	public Automovil(String marca) {
		super(marca);
	}

	@Override
	public void acelerar() {
		velocidad += 20;
		System.out.println(marca + " aceleró");
	}

}
