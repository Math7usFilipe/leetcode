import java.util.Scanner;

public class static_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//static array of ten numbers
		int v[] = new int[10];
		int contador = 0;
		
		System.out.print("Enter the first number: ");
		for(int i = 0; i < v.length; i++) {
			if(i == 0) {
				System.out.print("");
			}
			else {
				System.out.print("Enter another number:");
			}
			v[i] = sc.nextInt();
		}
		
		//prints greater than five
		System.out.println("Numbers greater than five:");
		for(int i = 0; i < v.length; i++) {
			if(v[i] > 5) {
				System.out.println("Greater than five: " + v[i]);
			}
		}
		
		sc.close();
	}

}
