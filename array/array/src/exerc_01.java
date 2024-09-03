import java.util.Arrays;

import javax.lang.model.type.PrimitiveType;

public class exerc_01 {

	public static void main(String[] args) {
	
		//pegarei 2 arrays e irei concatenar eles e realizar uma ordenacao crescente
		//depois removerei os elementos repetidos no array
		
		int[] a = {1,4,3,2,1};//length: 5
		int[] b = {2,1,4,3,3};
		
		int[] c = new int[a.length + b.length]; //terceiro array com tamanho do array. A+B=C 
		
		//armazenando valores do array a no array c
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}// {1,4,3,2,1,0,0,0,0,0}
		
		//aramzenado valores do array b apos os valores do array a
		for(int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		
		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println(Arrays.toString(c));
		
		int tamanhoArray = c.length;
		int[] t = new int[tamanhoArray];
		int p_esquerda = 0;
		
		
		
		
	}
}


