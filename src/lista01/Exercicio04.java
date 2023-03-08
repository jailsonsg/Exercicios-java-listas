
public class Exercicio04 {
	public static void main(String[]args) {
	
	 int [] numeros = new int [100];
		
	  // passa por cada elemento do vetor 
		for(int i = 0; i <= numeros.length-1; i++)  {
			//cada elemento recebe um numero aleatorio
		boolean ehPrimo = true;
			numeros[i] = (int)(Math.random()*100);
		for(int j=2; j< numeros[i]; j++) {
			if(numeros[i]%j==0) {
				ehPrimo = false;
			break;
			}	
		}
		
		if(ehPrimo) {
			System.out.println(numeros[i] + " é primo!");
			}
		}
	}
}

