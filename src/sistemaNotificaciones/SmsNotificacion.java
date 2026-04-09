package sistemaNotificaciones;

public class SmsNotificacion implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("\t\t\tSMS: %s", mensaje);
	}

}
