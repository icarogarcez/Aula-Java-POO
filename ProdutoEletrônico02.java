package aulajavapoo;

public class ProdutoEletr�nico02 {

	public static void main(String[] args) {

		ProdutoEletr�nico01 ps5 = new ProdutoEletr�nico01();

		ps5.setProduto("Playstation 5.");
		ps5.setAnodelan�amento(2020);
		ps5.setJogo1("Spider-Man");
		ps5.setJogo2("Horizon Zero Dawn");
		ps5.setJogo3("Grand Theft Auto V");

		System.out.println("Voc� acabou de adquirir um " + ps5.getProduto() + ", lan�ado em " + ps5.getAnodelan�amento()
				+ ". " + "O seu produto tamb�m v�m com um kit de tr�s jogos:\n" + ps5.getJogo1() + ", " + ps5.getJogo2()
				+ " e " + ps5.getJogo3() + ".");
		System.out.println("Divirta-se!");

	}

}
