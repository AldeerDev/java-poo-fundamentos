package com.aldeerdev.poo.leccion06_interfaces;

public class Guerrero implements Atacante, Defendible {

	// Atributo privado
	private String nombre;

	public Guerrero(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void atacar() {
		System.out.println(nombre + ": ataca con espada");
	}

	@Override
	public void defender() {
		System.out.println(nombre + ": se defiende con escudo");
	}
}
