package dataStructure;
import java.lang.Math; 
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9};
		int n = 9;
		int l=0;
		int r = n-1;
		int x=9;
		boolean found = false;
		
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(a[mid]==x) {
				System.out.println("Item found at "+ mid);
				found=true;
				break;
			}
			
			else if(a[mid]>x) {
				r=mid-1;
			}else {
				l=mid+1;
			}
			
			
		}
		if(found==false) {
			System.out.println("Item not found");
		}
		

	}

}
