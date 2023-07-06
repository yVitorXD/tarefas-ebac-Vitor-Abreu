
public class PessoaJuridica extends Pessoa {

	private String cpnj;
	
	private String enderenco;

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	public String getEnderenco() {
		return enderenco;
	}

	public void setEnderenco(String enderenco) {
		this.enderenco = enderenco;
	}

	
	public PessoaJuridica(String nome, int idade, String sexo, String cpnj, String enderenco) {
		super(nome, idade, sexo);
		this.cpnj = cpnj;
		this.enderenco = enderenco;
	}
	
	
	
}
