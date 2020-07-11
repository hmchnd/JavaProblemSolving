package dataStructure;

public class CalculateAmountOfWaterTrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,0,0,2,0,4};
		int n=6;
		int sum=0;
		int i=0;
		int j=n-1,k;
		int leftMax = a[0];
		int rightMax= a[j];
		
		while(i<j) {
			if(leftMax>rightMax) {
				k = j-1;
				if(a[k]<rightMax) {
					
					sum+=rightMax-a[k];
				}else {
					
					rightMax = a[k];
					
				}
				
				j--;
				
			}else {
				k=i+1;
				
				if(a[k]<leftMax) {
					
					sum+=leftMax-a[k];
					
				}else {
					
					 leftMax=a[k];
				}
				
				i++;
			}
			
			
		}
		
		
		System.out.println(sum);
		
		
		

	}

}
