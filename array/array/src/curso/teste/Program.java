package curso.teste;

import java.util.Arrays;

import curso.Vetor;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(2);
		Vetor vetor2 = new Vetor(10);
		
		//add with exceptions
		/*
		try {
			vetor.add("Element 1");
			vetor.add("Element 2");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(vetor);
		*/
		
		//add using boolean
		vetor2.addBoolean("Element 1");
		vetor2.addBoolean("Element 2");
		vetor2.addBoolean("Element 3");
		//returns array size
		System.out.println(vetor2.size());
		
		System.out.println(vetor2);
	}

}
