package aulajavapoo;

public class Avião02 {

	public static void main(String[] args) {

		Avião01 avião = new Avião01();

		avião.setClasse("Classe comercial.");
		avião.setCapacidademax("40 pessoas.");
		avião.setAltitude("10.000 metros de altura.");

		System.out.println("Dados do vôo da Reputation Tour:");
		System.out.println(avião.getClasse());
		System.out.println(avião.getCapacidademax());
		System.out.println(avião.getAltitude());

	}
}
