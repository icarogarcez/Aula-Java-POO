package aulajavapoo;

public class Avi�o02 {

	public static void main(String[] args) {

		Avi�o01 avi�o = new Avi�o01();

		avi�o.setClasse("Classe comercial.");
		avi�o.setCapacidademax("40 pessoas.");
		avi�o.setAltitude("10.000 metros de altura.");

		System.out.println("Dados do v�o da Reputation Tour:");
		System.out.println(avi�o.getClasse());
		System.out.println(avi�o.getCapacidademax());
		System.out.println(avi�o.getAltitude());

	}
}
