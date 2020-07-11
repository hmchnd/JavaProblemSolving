package intro;
import java.util.*; 
public class Testing {
	
	private static void printArray(int [] array) {
		for(int i:array) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
	}
	
	
private static int[] divideAndMerge(int [] array) {
		
		if(array.length<=1) {  // this is the exit method for recursion to avoid stack over flow
			
			return array;
		}
		
		int midpoint = array.length/2;
		int [] left = new int[midpoint];
		int[] right;
		
		if(array.length%2==0) {
			right = new int[midpoint];
			
		}else {
			
			right = new int[midpoint+1];
			
		}
		
		
		// populate
		
		for(int i=0; i<midpoint; i++) {
			left[i] = array[i];
			
		}
		
		for(int j=0; j<right.length; j++) {
			right[j] = array[midpoint+j];
			
		}
		printArray(left);
		printArray(right);
		int[] result = new int[array.length];
		left = divideAndMerge(left);  // left division will continue to happen using recursion; 
		
		right = divideAndMerge(right);// right divsion will contnue to happen ..recursive way
		printArray(left);
		printArray(right);
		return result;
		
	}
	

	public static void main(String[] args) {
      int a[] = {48,36,13,52,19,94,21};
		
		a = divideAndMerge(a);
		
		
		
		
	}

}
