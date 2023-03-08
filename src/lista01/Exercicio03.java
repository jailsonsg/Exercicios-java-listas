
public class Exercicio03 {
	public static void main(String[] args) {
      // vetor de 100 numeros 		
	    int [] numeros = new int [100];
		
	  // passa por cada elemento do vetor 
		for(int i = 0; i <= numeros.length-1; i++)  {
			//cada elemento recebe um numero aleatorio
			numeros[i] = (int)(Math.random()*100);
			// imprime ordem crescente
			System.out.println(numeros[i]);
			
		}
		
		System.out.println("fim");
		
		for(int i = numeros.length-1; i >= 0; i--) {
			// imprime ordem decrescente
			System.out.println(numeros[i]);
		}
	}
}