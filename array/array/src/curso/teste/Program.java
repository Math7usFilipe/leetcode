package curso.teste;

import curso.Contact;
import curso.VetorObject;

public class Program {

	public static void main(String[] args) throws Exception {
		
		VetorObject vetor = new VetorObject(3);
		
		Contact c1 = new Contact("Contato 1", "123-3213", "contato1@gmail.com");
		Contact c2 = new Contact("Contato 2", "223-3213", "contato2@gmail.com");
		Contact c3 = new Contact("Contato 3", "323-3213", "contato3@gmail.com");
		
		vetor.addBoolean(c1);
		vetor.addBoolean(c2);
		vetor.addBoolean(c3);
		
		System.out.println("Size = " + vetor.size());
		
		System.out.println(vetor);
		
		
		
		//removing element using the search method in  conjunction with the remove method
		/*
		int pos = vetor.search("E");
		if(pos > -1) {
			vetor.remove(pos);
		}
		else {
			System.out.println("Elemen not exist");
		}
		
		System.out.println(vetor);
		*/
	}

}


