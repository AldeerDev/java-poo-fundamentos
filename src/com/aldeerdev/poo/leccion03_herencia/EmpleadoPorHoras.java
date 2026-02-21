package com.aldeerdev.poo.leccion03_herencia;

public class EmpleadoPorHoras extends Empleado {

	// Atributos privados
	private int horasTrabajadas;
	private double pagoPorHora;

	// Constructor
	public EmpleadoPorHoras(String nombre, double pagoPorHora, int horasTrabajadas) {
		super(nombre, 0);
		this.pagoPorHora = pagoPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	// Sobrescritura de método
	@Override
	public double calcularSalario() {
		return pagoPorHora * horasTrabajadas;
	}
}
