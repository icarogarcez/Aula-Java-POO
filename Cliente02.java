package aulajavapoo;

public class Cliente02 {

	public static void main(String[] args) {

		Cliente01 cliente = new Cliente01();

		cliente.setnome("Taylor Swift.");
		cliente.setgenero("Feminino.");
		cliente.setmanequim("M.");

		System.out.println("Cliente Folklore Store:");
		System.out.println(cliente.getnome());
		System.out.println(cliente.getgenero());
		System.out.println(cliente.getmanequim());

	}
}
