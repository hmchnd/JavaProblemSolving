package dataStructure;

public class FindSumOfTwoNumberUsingTwoPointer {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int n=7;
		boolean anySumFound = false;
		int j=n-1;
		int k=8;
	
		
		/*
		 * for(int i=0;i<n;i++) { int j=n-1; while(i<j) {
		 * 
		 * if(a[i]+a[j]==k) { anySumFound = true; System.out.print(a[i]+" ");
		 * System.out.print(a[j]+" "); }
		 * 
		 * j--;
		 * 
		 * } if(anySumFound) { System.out.println(); }
		 * 
		 * 
		 * 
		 * }
		 */
		
		/*
		 * if(!anySumFound) {
		 * 
		 * System.out.print(-1); }
		 */
		int i=0;
		while(i < j) {
			if(a[i]+a[j]==k) { 
				System.out.println(a[i] +" " +a[j] +" " +k);
				anySumFound = true;
				j--;
				i++;
				
			} else if(a[i]+a[j]<k) {
				
				i++;
				
			}else if(a[i]+a[j]>k) {
				j--;
				
			}
		
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
