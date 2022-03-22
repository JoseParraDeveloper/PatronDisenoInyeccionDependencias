
import java.util.Date;
import java.util.logging.Logger;

import com.diseno.mejora.one.EmpleadoMejora;
import com.diseno.mejora.one.TareaSecretarioRRHHMejora;
import com.diseno.mejora.solucion.EmpleadoMejorSolucion;
import com.diseno.mejora.solucion.TareaDirector;
import com.diseno.mejora.two.EmpleadoMejora2;
import com.diseno.rigido.Empleado;

public class PruebaDiseno {
	private static final Logger logger = Logger.getLogger(PruebaDiseno.class.getName());

	public static void main(String[] args) {

		logger.info(() -> "<<PRUEBA: DISEÑO RÍGIDO.>>");

		Empleado empleado1 = new Empleado("Jose Guillermo1", "Parra Aponte1", new Date());
		empleado1.imprimeTareasEmpleado();

		logger.info(() -> "<<PRUEBA: QUITAR RESPONSABILIDAD DE SALIDA POR PANTALLA EN LA CLASE TAREA.>>");

		EmpleadoMejora empleado2 = new EmpleadoMejora("Jose Guillermo2", "Parra Aponte2", new Date());
		empleado2.imprimeTareasEmpleado();

		logger.info(() -> "<<PRUEBA: ABSTRAER LA INTERFAZ ITarea (PATRÓN FACHADA).>>");

		EmpleadoMejora2 empleado3 = new EmpleadoMejora2("Jose Guillermo3", "Parra Aponte3", new Date());
		empleado3.imprimeTareasEmpleado();

		logger.info(() -> "<<PRUEBA: INYECTAR LA DEPENDENCIA USANDO EL CONSTRUCTOR.>>");

		EmpleadoMejorSolucion empleado4 = new EmpleadoMejorSolucion("Jose Guillermo4", "Parra Aponte4", new Date(),
				new TareaSecretarioRRHHMejora());
		empleado4.imprimeTareasEmpleado();

		EmpleadoMejorSolucion empleado5 = new EmpleadoMejorSolucion("Jose Guillermo5", "Parra Aponte5", new Date(),
				new TareaDirector());
		empleado5.imprimeTareasEmpleado();

	}

}
