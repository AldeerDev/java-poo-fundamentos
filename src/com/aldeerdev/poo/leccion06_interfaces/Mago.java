package com.aldeerdev.poo.leccion06_interfaces;

public class Mago implements Atacante, Magico {

	// Atributo privado
	private String nombre;

	// Constructor
	public Mago(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void atacar() {
		System.out.println(nombre + ": lanza un ataque mágico");
	}

	@Override
	public void lanzarHechizo() {
		System.out.println(nombre + ": lanza un héchizo poderoso");
	}
}
