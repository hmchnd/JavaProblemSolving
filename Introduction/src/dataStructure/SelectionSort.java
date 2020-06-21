/*
* Selection sort do swapping only when it found smallest element in the searching list and put that on top.
* It do less no. of swap than bubble sort.
* It search smallest element on remain element part of array not in all which got swapped earlier. 
*/


package dataStructure;

public class SelectionSort {

	public static void main(String[] args) {
	
		int a[] = {3,1,-2,7,4,0};
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			int minIndex =i;
			for(int j=i;j<n;j++) {
				
				if(a[j]<a[minIndex]) {
					minIndex = j;
					
				}
				
				
				
			}
			int temp=a[i];            
			a[i] = a[minIndex];
			a[minIndex] = temp;
			
			
		}
		
		
		for(int item:a) {
			
			
			System.out.print(item+" ");
		}
		
		

	}

}
