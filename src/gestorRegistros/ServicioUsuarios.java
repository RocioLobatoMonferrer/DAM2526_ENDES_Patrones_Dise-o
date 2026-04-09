package gestorRegistros;

public class ServicioUsuarios {

	public void ejecutar() {
		Logger logger = Logger.getInstancia();
		logger.registrar("[INFO] Usuario creado");
		logger.registrar("[INFO] Usuario eliminado");
	}

}
