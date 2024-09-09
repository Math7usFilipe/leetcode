package curso.teste;

import curso.Vetor;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(3);
		
		vetor.addBoolean("B");
		vetor.addBoolean("G");
		vetor.addBoolean("D");
		vetor.addBoolean("E");
		vetor.addBoolean("F");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Removing element E:");
		
		//removing element using the search method in  conjunction with the remove method
		int pos = vetor.search("E");
		if(pos > -1) {
			vetor.remove(pos);
		}
		else {
			System.out.println("Elemen not exist");
		}
		
		System.out.println(vetor);
	}

}


