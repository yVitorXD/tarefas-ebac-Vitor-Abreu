package tarefa2;


import java.util.*;

public class App {

    public static void main(String[] args) {

        System.out.println("Tarefa 1 - Ebac\n");

        Scanner sc = new Scanner(System.in);

        List<Pessoa> lista = new ArrayList<>();

        System.out.println("Digite os nomes das pessoas separados por vírgula e o sexo separado por espaço");
        String entrada = sc.nextLine();

        String[] pessoas = entrada.split(",");

        for (String pessoaInfo : pessoas) {
            pessoaInfo = pessoaInfo.trim();
            String[] info = pessoaInfo.split(" ");
            String nome = info[0];
            String sexo = info[1];
            Pessoa pessoa = new Pessoa(nome, sexo);
            lista.add(pessoa);
        }

        Collections.sort(lista);

        System.out.println("Pessoas organizadas por sexo:");
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.getNome() + ", " + pessoa.getSexo());
        }

        sc.close();
    }
}