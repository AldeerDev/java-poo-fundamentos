package com.aldeerdev.poo.leccion04_polimorfismo;

public class EmpleadoFreelance extends Empleado {

	// Atributo privado
	private double salarioPorProyecto;
	private int cantidadProyectos;

	// Constructor
	public EmpleadoFreelance(String nombre, double salarioPorProyecto,
			int cantidadProyectos) {
		super(nombre);
		this.salarioPorProyecto = salarioPorProyecto;
		this.cantidadProyectos = cantidadProyectos;
	}

	// Sobrescritura de método
	@Override
	public double calcularSalario() {
		return salarioPorProyecto * cantidadProyectos;
	}

	public double getSalarioPorProyecto() {
		return salarioPorProyecto;
	}

	public void setSalarioPorProyecto(double salarioPorProyecto) {
		this.salarioPorProyecto = salarioPorProyecto;
	}

	public int getCantidadProyectos() {
		return cantidadProyectos;
	}

	public void setCantidadProyectos(int cantidadProyectos) {
		this.cantidadProyectos = cantidadProyectos;
	}

}
