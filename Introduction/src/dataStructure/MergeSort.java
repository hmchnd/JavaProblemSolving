package dataStructure;

public class MergeSort {
	private static void printArray(int [] array) {
		for(int i:array) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
	}
	
// divide the array and merge it
	private static int[] divideAndMerge(int [] array) {
		
		if(array.length<=1) {
			
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
		
		int[] result = new int[array.length];
		left = divideAndMerge(left);  // left division will continue to happen using recurrsion; 
		right = divideAndMerge(right);// right divsion will contnue to happen ..recursive way
		result = merge(left,right); // merge left and right based on sort value
		return result;
		
	}
	
	private static int[] merge (int [] left, int[] right) {
		int [] result = new int[left.length+ right.length];
		int leftPointer,rightPointer,resultPointer;
		leftPointer= rightPointer = resultPointer = 0;
		
		while(leftPointer<left.length || rightPointer<right.length) {
			
		if(leftPointer<left.length && rightPointer<right.length) {
			
			if(left[leftPointer] < right[rightPointer]) {
				
				result[resultPointer++] = left[leftPointer++];
			} else {
				
				result[resultPointer++] = right[rightPointer++];
				
			}
			
		}	
		
		else if(leftPointer< left.length) {
			
			result[resultPointer++] = left[leftPointer++];
			
			
		} else if(rightPointer< right.length) {
			
			result[resultPointer++] = right[rightPointer++];
			
			
		} 
			
		} // end while
		
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		int a[] = {48,36,13,52,19,94,21};
		
		a = divideAndMerge(a);
		printArray(a);

	}

}
