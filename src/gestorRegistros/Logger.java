package gestorRegistros;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	private static Logger instancia;
	private List<String> listaMensajes = new ArrayList<>();

	private Logger() {
	}

	public static Logger getInstancia() {
		if (instancia == null) {
			instancia = new Logger();
		}
		return instancia;
	}

	public void registrar(String mensaje) {
		listaMensajes.add(mensaje);
	}

	public void mostrarLogs() {
		for (int i = 0; i < listaMensajes.size(); i++) {
			System.out.println(listaMensajes.get(i));
		}
	}

}
