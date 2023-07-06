import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		 
		ArrayList<PessoaFisica> listPessoa = new ArrayList<>();
		ArrayList<PessoaJuridica> listPessoa2 = new ArrayList<>();
		
		
		PessoaFisica pessoaFisica = new PessoaFisica("Vitor", 21, "Masculino", "32323232", "2834903X");
		// nome, idade, sexo, cpf, rg;
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Vitor Juridico", 32, "Masculino", "12.345.678/0001-00", "Rua teste 123");
		// nome, idade, sexo, cpnj, endereco
		
		listPessoa.add(pessoaFisica);
		listPessoa2.add(pessoaJuridica);
		
		// imprimir lista de pessoa fisicas
		System.out.println("Pessoas Fisicas\n");
		for (PessoaFisica pessoa : listPessoa) {
			System.out.println("Nome: " + pessoa.nome + " \nIdade: " + pessoa.idade + " \nSexo: " + pessoa.sexo + " \nCpf: " + pessoa.getCpf() + " \nRG: " + pessoa.getRg());
		}
		
		System.out.println("**********************\n");
		System.out.println("Pessoas Juridicas\n");
		
		for (PessoaJuridica pessoa2 : listPessoa2) {
			System.out.println("Nome: " + pessoa2.nome + " \nIdade: " + pessoa2.idade + " \nSexo: " + pessoa2.sexo + " \nCNPJ: " + pessoa2.getCpnj() + " \nEndereço" + pessoa2.getEnderenco());
		}
		
		
		
		
		
		
	}
	
}
