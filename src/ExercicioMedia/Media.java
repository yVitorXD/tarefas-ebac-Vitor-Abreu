package ExercicioMedia;

public class Media {

	private Double nota;

	public Double getNota() {
		return nota;
	}

	public void setNota(Double media1) {
		this.nota = media1;
	}
	
	
	public static void main(String[] args) {
		
		Double nota1 = 9.3;
		Double nota2 = 7.3;
		Double nota3 = 2.3;
		Double nota4 = 7.3;
		
		Double media1 = (nota1 + nota2 + nota3 + nota4) / 4;
		
		Media resultado = new Media();
		
		resultado.setNota(media1);
		
		System.out.println(resultado.getNota());
		//Fim 
		
	}
	
	
}
