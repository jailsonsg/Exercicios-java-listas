package lista02;
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O valor digitado é par.");
		} else {
			System.out.println("O valor digitado é ímpar.");
		}
		scanner.close();
	}
}
