package sistemaNotificaciones;

public class NotificacionFactory {

	public Notificacion crearNotificacion(String tipo) {
		return switch (tipo) {
		case "EMAIL" -> new EmailNotificacion();
		case "SMS" -> new SmsNotificacion();
		case "PUSH" -> new PushNotificacion();
		default -> throw new IllegalArgumentException("Unexpected value: " + tipo);
		};
	}
}
