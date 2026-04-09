package pedidos;

public class Main {
	public void main() {
		Pedido p1 = new Pedido.Builder("Juan", "Calle Real 5").build();
		Pedido p2 = new Pedido.Builder("Juan", "Calle Real 5").setTelefono(12345678).setEmail("juanpedro@gmail.com")
				.setObservaciones("Su pedido está pendiente de enviar").build();

		System.out.println(p1);
		System.out.println(p2);
	}

	public static void main(String[] args) {
		new Main().main();
	}

}
