package aulajavapoo;

public class ProdutoEletrônico02 {

	public static void main(String[] args) {

		ProdutoEletrônico01 ps5 = new ProdutoEletrônico01();

		ps5.setProduto("Playstation 5.");
		ps5.setAnodelançamento(2020);
		ps5.setJogo1("Spider-Man");
		ps5.setJogo2("Horizon Zero Dawn");
		ps5.setJogo3("Grand Theft Auto V");

		System.out.println("Você acabou de adquirir um " + ps5.getProduto() + ", lançado em " + ps5.getAnodelançamento()
				+ ". " + "O seu produto também vêm com um kit de três jogos:\n" + ps5.getJogo1() + ", " + ps5.getJogo2()
				+ " e " + ps5.getJogo3() + ".");
		System.out.println("Divirta-se!");

	}

}
