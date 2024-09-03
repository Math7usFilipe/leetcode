import java.util.Arrays;

public class remove_duplicates_array {

	public static void main(String[] args) {
		

		
		int[] v = {1,1,1,2,2,3,2,4,4,5,7,7,6,8,9,10,11};

		int[] w = removeDuplicates(v);	
		
		System.out.println(Arrays.toString(w));
	}
	
	private static int[] removeDuplicates(int[] v) {
		int n = v.length;
		int[] w = Arrays.copyOf(v, n);
		
		for(int i = 0; i < n;i++) {
			int k = i + 1;
			int removidos = 0;
			for(int j = i + 1; j < n; j++) {
				if(w[j] == w[i]) {
					removidos++;
				}
				else {
					w[k++] = w[j];
				}
				n -= removidos;
			}
		}
		w = Arrays.copyOf(w, n);
		return w;
	}

}
