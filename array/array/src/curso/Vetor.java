package curso;

import java.util.Arrays;

public class Vetor {
	
	//attributes
	private String[] elements;
	private int size;
	
	//constructor
	public Vetor(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}
	
	//add element using type a boolean type method
	public boolean addBoolean(String elements) {
		if(this.size < this.elements.length) {
			this.elements[this.size] = elements;
			this.size++;
			return true;
		}
		return false;
	}
	
	
	 /* 	//add element using exceptions
	public void add(String elements) throws Exception  {
		if(this.size < this.elements.length) {
			this.elements[this.size] = elements;
			this.size++;
		}
		else {
			throw new Exception("The array is full, there is no more space for new elements");
		}

	}
	 *
	 * 
	 * */
	
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
	public int size() {
		return this.size;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.size-1; i++) {
			s.append(this.elements[i]);
			s.append(", ");
		}
		
		if(this.size>0) {
			s.append(this.elements[this.size-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}

}
