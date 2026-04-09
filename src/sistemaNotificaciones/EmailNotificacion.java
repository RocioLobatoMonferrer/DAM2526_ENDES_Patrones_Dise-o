package sistemaNotificaciones;

public class EmailNotificacion implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("\t\t\tEmail: %s", mensaje);
	}

}
