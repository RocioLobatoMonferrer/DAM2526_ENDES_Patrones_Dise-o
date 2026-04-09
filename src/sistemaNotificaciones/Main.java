package sistemaNotificaciones;

import java.util.Scanner;

import ejercicios6Excepciones.ConsoleInput;

public class Main {
	public void main() {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(keyboard);
		NotificacionFactory factory = new NotificacionFactory();
		int option;

		do {

			TipoNotificacion tipo = null;
			menu();
			option = ci.readIntInRange(1, 4);

			switch (option) {
			case 1 -> tipo = TipoNotificacion.EMAIL;
			case 2 -> tipo = TipoNotificacion.SMS;
			case 3 -> tipo = TipoNotificacion.PUSH;
			case 4 -> System.out.println("\t\t\tSaliendo...");
			}

			if (tipo != null) {

				Notificacion n = factory.crearNotificacion(tipo);
				n.enviar("Hola\n\n");
			}

		} while (option != 4);
	}

	public void menu() {
		System.out.println("\t\tSistema de Notificación ");
		System.out.println("\tSeleccione el tipo de notificación que desea: ");
		System.out.println("\t\t\t1. Email");
		System.out.println("\t\t\t2. SMS");
		System.out.println("\t\t\t3. Push");
		System.out.println("\t\t\t4. Salir");
	}

	public static void main(String[] args) {
		new Main().main();
	}

}
