package com.aldeerdev.poo.leccion06_interfaces;

public class Arquero implements Atacante {

	// Atributos privados
	private String nombre;

	// Constructor
	public Arquero(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void atacar() {
		System.out.println(nombre + ": dispara una flecha");
	}
}
