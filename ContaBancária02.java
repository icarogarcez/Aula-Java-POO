package aulajavapoo;

public class ContaBancária02 {

	public static void main(String[] args) {

		ContaBancária01 contabancária = new ContaBancária01();

		contabancária.setNome("Ícaro da Silva Garcez.");
		contabancária.setBanco("Nubank.");
		contabancária.setModalidade("Conta Corrente.");

		System.out.println("O nome completo do proprietário dessa conta é " + contabancária.getNome());
		System.out.println("Essa conta é uma conta " + contabancária.getBanco());
		System.out.println("A sua modalidade é " + contabancária.getModalidade());

	}

}
