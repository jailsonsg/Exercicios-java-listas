package lista02;
import java.util.Scanner;
public class Exercicio03 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Digite a medida da base menor (em cm): ");
	        double bMenor = scanner.nextDouble();
	        
	        System.out.print("Digite a medida da base maior (em cm): ");
	        double bMaior = scanner.nextDouble();
	        
	        System.out.print("Digite a medida da altura (em cm): ");
	        double altura = scanner.nextDouble();
	        
	        
	        double area = (bMenor + bMaior) * altura / 2.0;
	        
	        
	        System.out.printf("A área do trapézio é de %.2f cm².", area);
	        
	        scanner.close();
	    }
}
