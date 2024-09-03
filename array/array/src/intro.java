
public class intro {

	public static void main(String[] args) {
		
		double[] t = new double[365];
		//array definition
		//add items
		t[0] = 31.1;
		t[1] = 32;
		t[2] = 33.7;
		t[3] = 34;
		t[4] = 33.1;
		
		//print index
		System.out.println("The temperature value on day three is: " + t[2]);
		//array size
		System.out.println("The size of the array: " + t.length);
		//Traversing array
		for(int i = 0; i < t.length; i++) {
			System.out.println("The temperature value of day: " + (i + 1) + " is: " + t[i]);
		}
		
	}

}
