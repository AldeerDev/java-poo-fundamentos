package com.aldeerdev.poo.leccion05_clasesabstractas;

public class Bicicleta extends Vehiculo {

	public Bicicleta(String marca) {
		super(marca);
	}

	@Override
	public void acelerar() {
		velocidad += 5;
		System.out.println(marca + " pedaleó");
	}
}
