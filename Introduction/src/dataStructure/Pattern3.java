package dataStructure;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=10;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");	
				
			}

			for(int j=i;j<=n;j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
		

	}

}
