package dataStructure;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 2,1,8,-3,6,4,12
				
		};
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1-i;j++) {       //for(int j=0;j<n-1;j++) {  this will also work
				
				if(a[j+1]<a[j]) {                      //  >  decending  or < for accending
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					
				}
				
				
			}
			
			
			
		}
		
		
		for(int item:a) {
			System.out.print(item+" ");
			
			
		}
		
		
		
		

	}

}
