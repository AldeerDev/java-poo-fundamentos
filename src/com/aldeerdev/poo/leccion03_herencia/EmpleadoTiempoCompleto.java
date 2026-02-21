package com.aldeerdev.poo.leccion03_herencia;

public class EmpleadoTiempoCompleto extends Empleado {

	// Atributo privado
	private double bono;

	// Constructor
	public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono) {
		super(nombre, salarioBase);
		this.bono = bono;
	}

	// Sobrescritura del método
	@Override
	public double calcularSalario() {
		return salarioBase + bono;
	}

}
