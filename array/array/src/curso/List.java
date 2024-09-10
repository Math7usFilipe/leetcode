package curso;

public class List<T> {
	
	//attributes
	private T[] elements;
	private int size;
	
	//constructor
	public List(int capacity) {
		this.elements = (T[]) new Object[size];
		this.size = 0;
	}
	
	
	//method that increases vector capacity
	private void increasesCapacity() {
		if(this.size == this.elements.length) {
			T[] newElements = (T[]) new Object[this.elements.length * 2];
			for(int i =0; i < elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	} 
	
	//add element using type a boolean type method
	public boolean addBoolean(T elements) {
		this.increasesCapacity();
		if(this.size < this.elements.length) {
			this.elements[this.size] = elements;
			this.size++;
			return true;
		}
		return false;
	}
	
	public boolean add(int position, T elements) {
		
		if(!(position >= 0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		
		this.increasesCapacity();
		//move all elements
		for(int i = this.size - 1; i >= position; i--) {
			this.elements[i + 1] = this.elements[i];
		}
		this.elements[position] = elements;
		this.size++;
		
		return false;
	}
	
	
	public int size() {
		return this.size;
	}
	
	
	public Object search(int position) {
		if(!(position >= 0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		return this.elements[position];
	}
	
	public int search(Object elements) {
		for(int i = 0; i < this.size; i++) {
			if(this.elements[i].equals(elements)) {
				return i;
			}
		}
		return - 1;
	}
	//remove elements
	public void remove(int position) {
		if(!(position >= 0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for(int i = position; i < this.size - 1; i++ ) {
			this.elements[i] = this.elements[i + 1];
		}
		this.size--;
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
