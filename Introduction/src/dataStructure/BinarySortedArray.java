package dataStructure;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BinarySortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1 ,0 ,1 ,1 ,1, 1, 1 ,0, 0, 0};
		int n= 10;
		
		 ArrayList<Integer> binaryzero = new ArrayList<Integer>();  
		  ArrayList<Integer> binaryone = new ArrayList<Integer>();  
		    
		  for(int i=0;i<n;i++){
		      if(arr[i]==0){
		        binaryzero.add(arr[i]);  
		          
		      }else{
		          
		       binaryone.add(arr[i]);    
		      }
		      
		  }
		    
		  binaryzero.addAll(binaryone);  
		  
		 // for(int i=0;i<n;i++){
			//  binaryzero.get(i);  
			System.out.println(binaryzero);  
		  //}  
		  
	}

}
