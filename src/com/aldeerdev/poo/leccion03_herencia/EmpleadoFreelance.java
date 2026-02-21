package com.aldeerdev.poo.leccion03_herencia;

public class EmpleadoFreelance extends Empleado {

	// Atributos privados
	private double pagoPorProyecto;
	private int cantidadProyectos;

	// Constructor
	public EmpleadoFreelance(String nombre, double pagoPorProyecto, int cantidadProyectos) {
		super(nombre, 0);
		this.pagoPorProyecto = pagoPorProyecto;
		this.cantidadProyectos = cantidadProyectos;
	}

	// Sobrescritura de método
	@Override
	public double calcularSalario() {
		return pagoPorProyecto * cantidadProyectos;
	}
}
