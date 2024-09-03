package curso.teste;

import curso.Vetor;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(2);
		
		try {
			vetor.add("Element 1");
			vetor.add("Element 2");
			vetor.add("Element 2");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
