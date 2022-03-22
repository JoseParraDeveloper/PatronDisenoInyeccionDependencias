package com.diseno.rigido;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empleado extends Persona {
	private static final Logger logger = Logger.getLogger(Empleado.class.getName());

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, Date fechaNacimiento) {
		super(nombre, apellido, fechaNacimiento);

	}

	public void imprimeTareasEmpleado() {

		String detallaTareasEmpleado = String.format("Estas son las tareas del empleado: %s %s", this.getNombre(),
				this.getApellido());
		logger.log(Level.INFO, () -> detallaTareasEmpleado);
		TareaSecretarioRRHH tareaEmpleado = new TareaSecretarioRRHH();
		tareaEmpleado.enumeraTareas();
	}
}
