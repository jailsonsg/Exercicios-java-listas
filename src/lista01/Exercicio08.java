import java.util.Random;

public class Exercicio08 {
	public static void main(String[] args) {
		int [] numeros = new int[100];
		Random rand = new Random();
		
			for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100);
		}
		
		int soma = 0;
		
			for (int i = 0; i < numeros.length; i++) {
				soma += numeros[i];
			}
			
		double media = (double) soma / numeros.length;	
	
		System.out.println("Média é: " + media);
	}
}
