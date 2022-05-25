package exercicio7;

public class Gerente extends Funcionario {


	public Gerente(String nome, int idade) {
		super(nome, idade, bonificacao());
	}
	
	public static double bonificacao() {
		return bonificacao(10000.00);
	}
}

