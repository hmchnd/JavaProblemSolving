package dataStructure;

public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		reduce(5);
		

	}
	
	
	public static void reduce(int n) {
		if(n>0) {
			
			reduce(n-1);
			System.out.print(n);
	}
		
	}

}
