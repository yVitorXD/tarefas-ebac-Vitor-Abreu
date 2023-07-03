package tarefa2;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        int resultado = sexo.compareTo(outraPessoa.getSexo());
        if (resultado == 0) {
            resultado = nome.compareTo(outraPessoa.getNome());
        }
        return resultado;
    }
}