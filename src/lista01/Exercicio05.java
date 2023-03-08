
public class Exercicio05 {
	public static void main(String[] args) {
		int [] numeros = new int [100];
		
		for(int i = 0; i <= numeros.length-1; i++) {
			boolean naoPrimo = true;
			numeros[i] = (int)(Math.random()*100);
			for(int j=2; j <= numeros[i]; j++) {
				if(numeros[i] % 2 == 0) {
					naoPrimo = false;
				break;
				}	
		}
		
			if(naoPrimo) {
				System.out.println(numeros[i] + " É Impar");
		 }
			
		}				
	}
}

