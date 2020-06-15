package dataStructure;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RotateArray {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int deg = 2;  // degree of rotation
		int rotated[] = new int[5];
		int size = 5;
		
		for(int index=0;index<size;index++){
			int pos = index-deg;
			if(pos<0) {
				
				pos = pos+size;
			}
			
			rotated[pos] = array[index];
			
			
		}
		
		
		
	
		
		for(int i=0;i<size;i++) {
			
			System.out.println(rotated[i]);	
			
		}
		
		
	}

}
