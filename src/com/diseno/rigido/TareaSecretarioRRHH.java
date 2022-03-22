package com.diseno.rigido;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TareaSecretarioRRHH {
	private static final Logger logger = Logger.getLogger(TareaSecretarioRRHH.class.getName());

	public void enumeraTareas() {

		String detallaTareas = String.format("1. %s 2. %s", "Lleva la Agenda del Director de Recurso Humanos.",
				"Realiza Informes Mensuales.");

		logger.log(Level.INFO, () -> detallaTareas);

	}

}
