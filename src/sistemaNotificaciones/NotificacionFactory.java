package sistemaNotificaciones;

public class NotificacionFactory {

	public Notificacion crearNotificacion(TipoNotificacion tipo) {
		return switch (tipo) {
		case EMAIL -> new EmailNotificacion();
		case SMS -> new SmsNotificacion();
		case PUSH -> new PushNotificacion();
		};
	}
}
