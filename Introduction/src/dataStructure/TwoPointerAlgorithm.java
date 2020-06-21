/*
 * Two pointer algorithm generally work with sorted array.
 * */

package dataStructure;

import java.util.*;

public class TwoPointerAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,-2,3,-1,0};
		int n=5;
		Arrays.sort(arr);
		
		for(int i=0;i<n-2;i++) {
			if(twoSum(arr,-arr[i],i)) {
				
				System.out.println("Triplet Available");
			}else {
				
				System.out.println("Triplet Not Available");
			}
			
			
		}
		
		

	}
	
	
	/*
	 * Check if sum of two number is equal to passing number -X
	 * */
	public static boolean twoSum(int a[], int x, int i) {
		int j = a.length-1;
		while(i<j) {
			
			if(a[i]+a[j]>x){
				
				j--;
				
			}else if(a[i]+a[j]<x) {
				
				i++;
				
			}else {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	

}
