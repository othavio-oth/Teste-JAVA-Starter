package exercicio3;

public class Index{
	
	public static void main(String args[]) {
		Mago mago = new Mago("Robert");
		mago.attack();
		mago.aprenderMagia("Bola de fogo");
		mago.aprenderMagia("Transforma num Sapo");
		System.out.println(mago.getMagias());
		
		
		Guerreiro espadachim = new Guerreiro("Florence");
		espadachim.attack();
	
		espadachim.aprenderHabilidade("Apunhalada");
		espadachim.aprenderHabilidade("Golpe com o cabo");
		
		System.out.println(espadachim.getHabilidades());
		
	
	}

} 
