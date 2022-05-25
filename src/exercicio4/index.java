package exercicio4; // Também 4 e 6
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


public class index {

    public static void main(String[] args) {

       Pessoa p1 = new Pessoa("João",15);
       Pessoa p2 = new Pessoa("Leandro",21);
       Pessoa p3 = new Pessoa("Paulo",17);
       Pessoa p4 = new Pessoa("Jéssica",18);

       //Exercicio 4
       
      List<Pessoa> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
    
        mostraMaisVelho(lista);
  
     
       
       
       //Exercicio 5
       
      System.out.println("Com todos os participantes da lista:"+lista); // Com todos os participantes da lista
      
      removeMenores(lista);
      System.out.println("Sem os menores de 18 anos:"+lista);
      lista.add(p1);
      lista.add(p3);
      
      
      
      //Exercício 6 
      pesquisarPor("Jéssica", lista);
    }
    
    
    
    
    
    public static void removeMenores(List<Pessoa> lista) {
		for (int i = 0; i < lista.size(); i++) {
			Pessoa p = (Pessoa) lista.get(i);
			
			if(p.getIdade()<18) {
				lista.remove(i);
			}
		}
	}
    
    public static void mostraMaisVelho(List<Pessoa> lista) {
    	 System.out.println("A pessoa mais velha é...");
    	Optional<Pessoa> maisVelho  = lista.stream()
				.reduce((Pessoa a,Pessoa b)
						->{
							if(a.idade>b.idade) {
								return a;
							}else {
								return b;
							}
							
						});
    					System.out.println(maisVelho);
		
	}
    
    
    public static void pesquisarPor(String nome, List<Pessoa> list) {
    	for (int i = 0; i < list.size(); i++) {
    		Pessoa p = (Pessoa) list.get(i);
    		if(p.nome == nome) {
    			System.out.println(p.nome +" está na lista, sua idade é "+p.idade);
    		} 
    		
			
		}
			
		}
    	
    
    
    
   
    
    
}