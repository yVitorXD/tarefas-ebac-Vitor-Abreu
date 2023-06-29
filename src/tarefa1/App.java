package tarefa1;

import java.util.*;;

public class App {

	public static void main(String[] args) {
		
		//ler do console nome de pessoas separados por virgula, guardar em variaveis
		//fazer a ordenaçao da variavel em ordem alfabetica e imprimir no console
		
		System.out.println("Tarefa 1 - Ebac\n");
		
		Pessoa a = new Pessoa("Vitor", "M");
		Pessoa b = new Pessoa("Wendy", "F");
		Pessoa c = new Pessoa("Luana", "F");
		Pessoa d = new Pessoa("Vinicius", "M");
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		System.out.println();
		System.out.println("Tarefa 2 - Ebac");
		System.out.println();
		
		//obs: comando split
		//2 parte
		//ler do console nome - sexo (m/f), separar por grupos, por generos
		//imprimir no console com os grupos separados
		
		
            
        
		
	}
	
	
}
