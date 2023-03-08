package lista02;
import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a sua altura: ");
		float altura = scanner.nextFloat();
		
		System.out.println("Informe o seu peso: ");
		float peso = scanner.nextFloat();
		
		float imc = (peso/(altura*altura));
		
		System.out.println("O valor do seu IMC é: " + imc);
		
		scanner.close();
	}
}
