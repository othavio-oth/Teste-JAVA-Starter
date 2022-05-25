package exercicio4;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Pessoa {
	
	String nome;	
	int idade;
	public static int qntd;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		qntd++;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Aqui eu resolvo o problema de não conseguir visualizar as listas no console.
	@Override
	public String toString() {
	  return String.valueOf(this.getNome());
	}
	
	
	
		
		

	


	
	
}
