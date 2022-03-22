package com.diseno.mejora.one;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.diseno.rigido.Persona;

public class EmpleadoMejora extends Persona {
	private static final Logger logger = Logger.getLogger(EmpleadoMejora.class.getName());

	public EmpleadoMejora() {
		super();
	}

	public EmpleadoMejora(String nombre, String apellido, Date fechaNacimiento) {
		super(nombre, apellido, fechaNacimiento);

	}

	public void imprimeTareasEmpleado() {
		TareaSecretarioRRHHMejora tareaEmpleado = new TareaSecretarioRRHHMejora();
		String detallaTareasEmpleado = String.format("Estas son las tareas del empleado: %s %s%n%s", this.getNombre(),
				this.getApellido(), tareaEmpleado.enumeraTareas());
		logger.log(Level.INFO, () -> detallaTareasEmpleado);
	}
}
