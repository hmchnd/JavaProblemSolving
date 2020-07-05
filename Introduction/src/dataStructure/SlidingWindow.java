package dataStructure;

public class SlidingWindow {

	public static void main(String[] args) {
		// find max sum in subarry of length 4........ 
		/*  if window is of size K and array of size N then loop will run till N-K */
		
		int a[] = {1,9,-1,-2,7,3,-1,2};
		int n=a.length;
		int k=4;  // window of 4
		int msum = 0;// max sum
		
		
		// Below is the brute force solution and not optimized
		
		/*
		 * for(int i=0;i<n-k;i++) { int wsum= 0; // window sum for(int j=i;j<i+k;j++) {
		 * 
		 * wsum+=a[j]; }
		 * 
		 * msum = Math.max(wsum, msum);
		 * 
		 * 
		 * }
		 */
		
		
		// now we will use sliding window technique ti optimkze the soln
		
		/*  In Sliding window tech first take the *sum of value till the length of window and after that start another 
		 * loop from the end of window length and add next value of aaray into summ and remove first value as window frame is sliding till length of array/
		 */
		
		int windowSum=0;
		for(int i=0;i<k;i++) {
			windowSum+=a[i];
			
		}
		
		for(int end=k; end<n;end++) {
			windowSum+=a[end]-a[end-k];
			msum=Math.max(windowSum, msum);
			
		}
		
		
		
		
		
		
		System.out.println(msum);
		

	}

}
