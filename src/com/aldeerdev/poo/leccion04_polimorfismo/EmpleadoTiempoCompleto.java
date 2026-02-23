package com.aldeerdev.poo.leccion04_polimorfismo;

public class EmpleadoTiempoCompleto extends Empleado {

	// Atributos privados
	private double salarioBase;
	private double bono;

	// Constructor
	public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono) {
		super(nombre);
		this.salarioBase = salarioBase;
		this.bono = bono;
	}

	// Sobreescritura de método
	@Override
	public double calcularSalario() {
		return salarioBase + bono;
	}

	// Getters y Setters
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

}
