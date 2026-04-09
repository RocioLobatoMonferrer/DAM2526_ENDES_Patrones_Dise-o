package gestorRegistros;

public class Main {
	public void main() {
		ServicioUsuarios ser1 = new ServicioUsuarios();
		ServicioPedidos ser2 = new ServicioPedidos();

		ser1.ejecutar();
		ser2.ejecutar();

		Logger logger = Logger.getInstancia();

		logger.mostrarLogs();

	}

	public static void main(String[] args) {
		new Main().main();
	}

}
