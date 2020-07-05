package dataStructure;

public class FindSumOfTwoNumberUsingTwoPointer {

	public static void main(String[] args) {
		
		int a[] = {61,719,754,140,424,280,997,688,530,550,438,867,950,194,196,298,417,287,106,489,283,456,735,115,702,317,672,787,264,314,356,186,54,913,809,833,946,314,757,322,559,647,983,482,145,197,223,130,162,536,451,174,467,45,660,293,440,254,25,155,511,746,650,187,314,475,23,169,19,788,906,959,392,203,626,478,415,315,825,335,875,373,160,834,71,488,298,519,178,774,271,764,669,193,986,103,481,214,628,803,100,528,626,544,925,24,973,62,182,4,433,506,594};
		int n=113;
		boolean anySumFound = false;
		int j=n-1;
		int k=146;
	
		
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
		
		
		if(!anySumFound) {
			
			System.out.println("Not Found any summ");
		}
		
		
		
		
		
		

	}

}
