package com.diseno.mejora.one;

import com.diseno.mejora.two.ITarea;

public class TareaSecretarioRRHHMejora implements ITarea {

	public String enumeraTareas() {

		return String.format("1. %s 2. %s", "Lleva la Agenda del Director de Recurso Humanos.",
				"Realiza Informes Mensuales.");

	}

}
