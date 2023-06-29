package tarefa2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App2 {
    public static void main(String[] args) {
        // Cria um ArrayList de objetos Pessoa
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Alice", 25, Sexo.FEMININO));
        listaPessoas.add(new Pessoa("João", 30, Sexo.MASCULINO));
        listaPessoas.add(new Pessoa("Maria", 20, Sexo.FEMININO));

        // Organiza o ArrayList com base no sexo das pessoas
        Collections.sort(listaPessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return pessoa1.getSexo().compareTo(pessoa2.getSexo());
            }
        });

        // Exibe o ArrayList organizado
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade() + " - " + pessoa.getSexo());
        }
    }
}

enum Sexo {
    MASCULINO,
    FEMININO
}

class Pessoa {
    private String nome;
    private int idade;
    private Sexo sexo;

    public Pessoa(String nome, int idade, Sexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Sexo getSexo() {
        return sexo;
    }
}

