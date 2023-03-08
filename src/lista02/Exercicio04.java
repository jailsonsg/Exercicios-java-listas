package lista02;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Digite o primeiro valor: ");
		int primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite o segundo valor:  ");
		int segundoNumero = scanner.nextInt();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O primeiro numero digitado é maior que o segundo.");
		} else {
			System.out.println("O segundo numero digitado é maior que o primeiro.");
			scanner.close();
		}
	}
}
