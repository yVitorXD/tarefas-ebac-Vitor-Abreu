import java.util.Scanner;

public class Mod10 {

	public static void main(String[] args) {
	
		// ler 4 notas do console e divir por 4, 
		// condi�ao = nota >= 7 == APROVADO printlkn
		//	se nao for maior que 7, >= 5 == recupera�ao print
		// else == reprovado
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 notas");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
			
		int resultado = (n1 + n2 + n3 + n3) / 4;
		
		if (resultado >= 7 && resultado <= 10) {
			System.out.println("Aprovado, sua nota � = " + resultado);
		}
		else if(resultado >= 5) {
			System.out.println("Recupera��o sua nota � = " + resultado);
		}
		else {
			System.out.println("Reprovado sua nota � = " + resultado);
		}
		
				
		sc.close();		
		
		
	}
	
}
