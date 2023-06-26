import java.util.Scanner;

public class Mod10 {

	public static void main(String[] args) {
	
		// ler 4 notas do console e divir por 4, 
		// condiçao = nota >= 7 == APROVADO printlkn
		//	se nao for maior que 7, >= 5 == recuperaçao print
		// else == reprovado
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 notas");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
			
		int resultado = (n1 + n2 + n3 + n3) / 4;
		
		if (resultado >= 7 && resultado <= 10) {
			System.out.println("Aprovado, sua nota é = " + resultado);
		}
		else if(resultado >= 5) {
			System.out.println("Recuperação sua nota é = " + resultado);
		}
		else {
			System.out.println("Reprovado sua nota é = " + resultado);
		}
		
				
		sc.close();		
		
		
	}
	
}
