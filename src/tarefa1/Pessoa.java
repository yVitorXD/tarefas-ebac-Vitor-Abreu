package tarefa1;

public class Pessoa implements Comparable<Pessoa> {

	public Pessoa(String nome, String sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}

	private String nome;
	
	private String sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	

	
	@Override
	public int compareTo(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(pessoa.getNome());
	}

	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", sexo = " + sexo + "]";
	}
	
}
