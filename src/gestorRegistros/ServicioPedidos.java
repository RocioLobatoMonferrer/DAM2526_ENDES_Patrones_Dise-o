package gestorRegistros;

public class ServicioPedidos {

	public void ejecutar() {
		Logger logger = Logger.getInstancia();
		logger.registrar("[INFO] Pedido creado");
		logger.registrar("[INFO] Pedido enviado");
	}
}
