import java.util.Random;

public class Exercicio07 {
	public static void main(String[] args) {
		int [] numeros = new int[100];
		Random rand = new Random();
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100);
		}
		
		int maior = numeros[0];
		int menor = numeros[0];
		for(int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
	System.out.println("Maior elemento: " + maior);
	System.out.println("Menor elemento: " + menor); 
		}
}
