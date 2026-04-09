package sistemaNotificaciones;

public class PushNotificacion implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("\t\t\tPush: %s", mensaje);
	}

}
