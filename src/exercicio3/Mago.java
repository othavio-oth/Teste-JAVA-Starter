package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem {

	
	List<String> magias = new ArrayList<String>();		
			
	public Mago(String nome) {
		super(nome,  40, 10);
		
	}
	
	
	public List<String> getMagias(){
		return magias;
	}
	
	
	public void attack() {
		super.attack(this.inteligencia);
	}
	
	public void lvlUp() {
		super.lvlUp(inteligencia, mana);
	}
	
	public void aprenderMagia(String magia) {
		magias.add(magia);
	}
	

}
