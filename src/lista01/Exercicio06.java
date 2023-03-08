import java.util.Random;

public class Exercicio06 {
	public static void main(String[] args) {
		int [] numeros = new int [100];
		Random rand = new Random();
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100);
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " è Par.");
			}
		}
	}
}
