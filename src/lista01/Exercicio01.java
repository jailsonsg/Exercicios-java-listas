import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
 		Scanner ler = new Scanner(System.in);
		
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int nota4 = 0;
		int nota5 = 0;
		
		System.out.println("Informe a primeira nota");
		nota1 = ler.nextInt();
		
		System.out.println("Informe a segunda nota");
		nota2 = ler.nextInt();
		
		System.out.println("Informe a terceira nota");
		nota3 = ler.nextInt();
		
		System.out.println("Informe a quarta nota");
		nota4 = ler.nextInt();
		
		System.out.println("Informe a quinta nota");
		nota5 = ler.nextInt();
		
		int soma = (nota1+nota2+nota3+nota4+nota5);
	    int media = soma/5;
			
	    System.out.println("A sua média é:" + media);
	}
}