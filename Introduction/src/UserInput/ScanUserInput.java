package UserInput;
import java.util.Scanner;

public class ScanUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		float simpleInterest = principal*rate*time / 100;
		System.out.println(simpleInterest);
		

	}

}
