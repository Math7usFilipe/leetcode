package curso.teste;

import curso.Contact;
import curso.VetorObject;

public class Program {

	public static void main(String[] args) throws Exception {
		
		VetorObject vetor = new VetorObject(3);
		
		Contact c1 = new Contact("Contato 1", "123-3213", "contato1@gmail.com");
		Contact c2 = new Contact("Contato 2", "223-3213", "contato2@gmail.com");
		Contact c3 = new Contact("Contato 3", "323-3213", "contato3@gmail.com");
		Contact c4 = new Contact("Contato 4", "423-3213", "contato4@gmail.com");
		
		vetor.addBoolean(c1);
		vetor.addBoolean(c2);
		vetor.addBoolean(c3);
		
		System.out.println("Size = " + vetor.size());
		
		int pos = vetor.search(c4);
		if(pos > - 1) {
			System.out.println("Element exists in the vector");
		}
		else {
			System.out.println("Element does not exist in the vector");
		}
		
		System.out.println(vetor);
		
		
	}

}


