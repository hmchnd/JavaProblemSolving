package dataStructure;

public class PeakElement {
	
	
	public static int edgeCase (int [] arr, int length) {
		
		if(arr[0]>arr[1]) {
			return 0;
		}else if (arr[length-1]>arr[length-2]) {
			return length-1;
		}else {
			
			
			return -1;
		}
		
		
	}
	
public static int midCase (int [] arr, int length) {	
	if(arr[length/2-1]<arr[length/2] && arr[length/2+1]<arr[length/2]) {
		
		return length/2;
	}else {
		
		return -1;
	}	
			
	
}

	
	

	public static void main(String[] args) {
	int N = 3;	
	int arr[] = {1,2,6,4,0};
	int res = edgeCase(arr,arr.length);
	if(res!=-1) {
		System.out.println("EdgeCase"+res);
		
	}else {
		res = midCase(arr,arr.length);	
		System.out.println("MidCase"+res);
	}

		
		
		
		

	}

}
