
package lista02;
import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int inteiro = scanner.nextInt();
		
		System.out.println("Digite um n�mero long: ");
		long l = scanner.nextLong();
		
		System.out.println("Digite um n�mero float: ");
		float f = scanner.nextFloat();
		
		System.out.println("O inteiro digitado foi: " + inteiro);
		System.out.println("O long digitado foi: " + l);
		System.out.println("O float digitado foi: " + f);
		
		scanner.close();
	}
}
