package exercicio1;

public class Veiculo {
		String marca;
		String modelo;
		String placa;
		String cor;
		float km;
		boolean isLigado;
		int litrosCombustivel;
		int velocidade;
		double preco;
		
		
		public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
				int litrosCombustivel, int velocidade, double preco) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.placa = placa;
			this.cor = cor;
			this.km = km;
			this.isLigado = isLigado;
			this.litrosCombustivel = litrosCombustivel;
			this.velocidade = velocidade;
			this.preco = preco;
		}
		
		public void acelerar() {
			if(this.isLigado)this.velocidade += 20;
			else throw new Error("O carro precisa estar	 ligado para acelerar");
			System.out.println("Acelerou! Agora a velocidade é de "+velocidade);
		}
		
		public void abastecer(int combustivel) {
			if(litrosCombustivel + combustivel <=60) {
				litrosCombustivel += combustivel;
				System.out.printf("Agora temos %s litros de combustível \n",litrosCombustivel );
			} else {
				System.out.println("Não há capacidade para tanto combustível");
			}
		}
		
		public void freiar() {
			if(velocidade >= 20) velocidade -= 20;
			System.out.println("Freiou! Agora a velocidade é de "+velocidade);
		}
		
		public void pintar(String novaCor) {
			this.cor = novaCor;
			System.out.println("Agora o carro é "+cor);
		}
		
		public void desligar(){
			if(velocidade == 0) {
				this.isLigado = false;
				System.out.println("Agora o carro está desligado.");
			}
			else throw new Error("O carro precisa estar parado para ser desligado");
		}
		public void ligar() {
			isLigado = true;
		}
	}

