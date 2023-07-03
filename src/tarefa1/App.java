package tarefa1;

import java.util.*;;

public class App {

	public static void main(String[] args) {
		
		//ler do console nome de pessoas separados por virgula, guardar em variaveis
		//fazer a ordenaçao da variavel em ordem alfabetica e imprimir no console
		
		System.out.println("Tarefa 1 - Ebac\n");
		
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		System.out.println("Digite os nomes das pessoas separados por virgula");
		String entrada = sc.nextLine();		
		
		String[] nomes = entrada.split(",");
		
		for (String nome : nomes) {
			nome = nome.trim();
			Pessoa pessoa = new Pessoa(nome, "");
			lista.add(pessoa);
			
		}
		
		Collections.sort(lista);
		
		System.out.println("Nome das pessoas");
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.getNome());
		}

		
		sc.close();
            
		System.out.println("=========================");
		System.out.println();
		
		
		
		
		
		
		
	}
	
	
}
