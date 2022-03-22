package com.diseno.mejora.solucion;

import com.diseno.mejora.two.ITarea;

public class TareaDirector implements ITarea {

	@Override
	public String enumeraTareas() {
		return String.format("1. %s 2. %s", "Esta es la Responsabilidad número uno del director de la empresa.",
				"Esta es la segunda.");
	}

}
