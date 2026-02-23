package com.aldeerdev.poo.leccion06_interfaces;

public class Dragon implements Atacante, Volador {

	// atributos privados
	private String nombre;

	// Constructor
	public Dragon(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void volar() {
		System.out.println(nombre + ": ha comenzado a volar");

	}

	@Override
	public void atacar() {
		System.out.println(nombre + ": ataca con fuego");
	}

}
