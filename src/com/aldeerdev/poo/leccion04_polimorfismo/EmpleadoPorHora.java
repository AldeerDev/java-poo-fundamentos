package com.aldeerdev.poo.leccion04_polimorfismo;

public class EmpleadoPorHora extends Empleado {

	// Atributo privado
	private double salarioPorHora;
	private int horasTrabajadas;

	// Constructor
	public EmpleadoPorHora(String nombre, double salarioPorHora, int horasTrabajadas) {
		super(nombre);
		this.salarioPorHora = salarioPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	// Sobreescritura de método
	@Override
	public double calcularSalario() {
		return salarioPorHora * horasTrabajadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

}
