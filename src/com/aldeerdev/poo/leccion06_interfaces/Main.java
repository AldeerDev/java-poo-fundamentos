package com.aldeerdev.poo.leccion06_interfaces;

public class Main {

	public static void main(String[] args) {

		// crear arreglo de atacantes
		Atacante[] atacantes = new Atacante[4];

		// agregar al arreglo distintos atacantes
		atacantes[0] = new Guerrero("Aragorn");
		atacantes[1] = new Mago("Gandalf");
		atacantes[2] = new Arquero("Legolas");
		atacantes[3] = new Dragon("Smaug");

		// reccorer arreglo
		for (Atacante personaje : atacantes) {
			personaje.atacar();
		}
	}

}
