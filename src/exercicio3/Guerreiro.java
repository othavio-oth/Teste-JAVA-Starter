package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem {
	 

		List<String> habilidades = new ArrayList<String>();
		
		public Guerreiro(String nome) {
			super(nome, 15, 30 );
			
		}
		
		

		public List<String> getHabilidades() {
		return habilidades;
	}

		
		
		public void attack() {
			super.attack(this.forca);
		}
		
		public void lvlUp() {
			super.lvlUp(forca, vida);
		}
		
		public void aprenderHabilidade(String habilidade) {
			habilidades.add(habilidade);
		}
		

	
}
