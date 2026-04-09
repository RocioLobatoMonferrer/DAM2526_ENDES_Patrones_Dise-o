package sistemaNotificaciones;

public class SmsNotificacion implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("SMS: %s", mensaje);
	}

}
