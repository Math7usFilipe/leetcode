
public class exerc01 {

	public static void main(String[] args) {
		
		/* O bubble sort percorre o array inteiro diversas vezes, devido a isso nao e recomendado 
		 * o uso dele para aplicacoes que requerem velocidade ou trabalhem com uma grande 
		 * quantidade de dados.
		 * 
		 * v[0] > v[1]
		 */ 
		//Ordenar um vetor de 5 elementos em ordem crescente
		
		int[] vect  = {5,3,1,4,2};
		int aux;
		boolean controle;
		
		for(int i = 0; i < vect.length; i++) {
			controle = true;
			for(int j = 0; j < (vect.length -1); j++) {
				
				if(vect[j] > vect[j + 1]) {
					
					aux = vect[j];
					vect[j] = vect[j + 1];
					vect[j + 1] = aux;
					controle = false;
				}
			}
			if(controle) {
				break;
			}
		}
		
		 for(int i = 0; i < vect.length; i++) {
			 System.out.println(vect[i] + " ");
		 }
		
		
	}

}
