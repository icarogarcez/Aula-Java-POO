package aulajavapoo;

public class ContaBanc�ria02 {

	public static void main(String[] args) {

		ContaBanc�ria01 contabanc�ria = new ContaBanc�ria01();

		contabanc�ria.setNome("�caro da Silva Garcez.");
		contabanc�ria.setBanco("Nubank.");
		contabanc�ria.setModalidade("Conta Corrente.");

		System.out.println("O nome completo do propriet�rio dessa conta � " + contabanc�ria.getNome());
		System.out.println("Essa conta � uma conta " + contabanc�ria.getBanco());
		System.out.println("A sua modalidade � " + contabanc�ria.getModalidade());

	}

}
