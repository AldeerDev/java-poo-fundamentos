package com.aldeerdev.poo.leccion04_polimorfismo;

public abstract class Empleado {

	protected String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public abstract double calcularSalario();

	public void mostrarInformacion() {
		System.out.println("Empleado: " + nombre);
		System.out.println("Salario: " + calcularSalario());
	}
}
