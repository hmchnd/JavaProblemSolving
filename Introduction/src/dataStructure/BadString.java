package dataStructure;

public class BadString {

	public static void main(String[] args) {
		 String str = "dvgup?";
		 int testingV =0;
		  int testingC = 0;
		 
		 
		 for(int i=0;i<str.length();i++){
		  
		    char ch = str.charAt(i);
		    
		   	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		        
		        testingV++;
		        
		    }else if (ch=='?'){
		         testingV++;
		         testingC++;
		        
		    }else{
		       testingC++;
		        
		    }
		     
		     
		 } 
		  System.out.println(testingV); 
		  System.out.println(testingC); 

		if(testingV>5 || testingC>3){
		    
		    System.out.println("0");
		    
		}else{
		    
		   System.out.println("1");   
		}





}

}
