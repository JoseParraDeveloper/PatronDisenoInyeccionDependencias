package com.diseno.mejora.solucion;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.diseno.mejora.two.ITarea;
import com.diseno.rigido.Persona;

public class EmpleadoMejorSolucion extends Persona {
	private static final Logger logger = Logger.getLogger(EmpleadoMejorSolucion.class.getName());
	private ITarea tareaEmpleado;

	public EmpleadoMejorSolucion() {
		super();
	}

	public EmpleadoMejorSolucion(String nombre, String apellido, Date fechaNacimiento, ITarea tareaEmpleado) {
		super(nombre, apellido, fechaNacimiento);
		this.tareaEmpleado = tareaEmpleado;
	}

	public void imprimeTareasEmpleado() {
		String detallaTareasEmpleado = String.format("Estas son las tareas del empleado: %s %s%n%s", this.getNombre(),
				this.getApellido(), tareaEmpleado.enumeraTareas());
		logger.log(Level.INFO, () -> detallaTareasEmpleado);
	}
}
