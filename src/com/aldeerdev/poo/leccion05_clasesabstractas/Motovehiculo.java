package com.aldeerdev.poo.leccion05_clasesabstractas;

public class Motovehiculo extends Vehiculo {

	// constructor
	public Motovehiculo(String marca) {
		super(marca);
	}

	@Override
	public void acelerar() {
		velocidad += 30;
		System.out.println(marca + " aceleró");
	}

}
