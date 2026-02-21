package com.aldeerdev.poo.leccion03_herencia;

public class Empleado {

	// Atributos protegidos
	protected String nombre;
	protected double salarioBase;

	// Constructor
	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public double calcularSalario() {
		return salarioBase;
	}

	// Método
	public void mostrarInformacion() {
		System.out.println("Empleado: " + nombre);
		System.out.println("Salario: " + calcularSalario());
	}

}
