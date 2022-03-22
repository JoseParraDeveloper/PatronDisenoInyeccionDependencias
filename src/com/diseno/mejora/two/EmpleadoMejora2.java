package com.diseno.mejora.two;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.diseno.mejora.one.TareaSecretarioRRHHMejora;
import com.diseno.rigido.Persona;

public class EmpleadoMejora2 extends Persona {

	private static final Logger logger = Logger.getLogger(EmpleadoMejora2.class.getName());
	private ITarea tareaEmpleado;

	public EmpleadoMejora2() {
		super();
	}

	public EmpleadoMejora2(String nombre, String apellido, Date fechaNacimiento) {
		super(nombre, apellido, fechaNacimiento);
		tareaEmpleado = new TareaSecretarioRRHHMejora();

	}

	public void imprimeTareasEmpleado() {
		String detallaTareasEmpleado = String.format("Estas son las tareas del empleado: %s %s%n%s", this.getNombre(),
				this.getApellido(), tareaEmpleado.enumeraTareas());
		logger.log(Level.INFO, () -> detallaTareasEmpleado);
	}

}
