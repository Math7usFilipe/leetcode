package curso.teste;

import curso.Vetor;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(10);
		
		vetor.addBoolean("B");
		vetor.addBoolean("C");
		vetor.addBoolean("E");
		vetor.addBoolean("F");
		vetor.addBoolean("G");
		
		System.out.println(vetor);
		
		vetor.add(0, "A");
		
		System.out.println(vetor);
		
		vetor.add(3, "D");
		
		System.out.println(vetor);
	}

}


