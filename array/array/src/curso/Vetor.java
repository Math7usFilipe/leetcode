package curso;

public class Vetor {
	
	//attributes
	private String[] elements;
	private int size;
	
	//constructor
	public Vetor(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}
	
	//add element
	public void add(String elements) throws Exception {
		if(this.size < this.elements.length) {
			this.elements[this.size] = elements;
			this.size++;
		}
		else {
			throw new Exception("The array is full, there is no more space for new elements");
		}

	}
	
	
	//old method add
	/*
	 * 
		public void adds(String elements) {
		for(int i=0; i <this.elements.length; i++) {
			if(this.elements[i] == null) {
				this.elements[i] = elements;
				break;
			}
		}
	} 
    */
	
	

}
