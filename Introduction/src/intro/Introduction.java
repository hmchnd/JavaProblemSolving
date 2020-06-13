package intro;
import java.util.ArrayList;
public class Introduction {
	
	
	 static String decode(String pattern){
	        String Code="";
	       for(int i=0;i<pattern.length();i++){
		       int j=i+1;
		       
		       char c1=pattern.charAt(i);
		       char c2 = pattern.charAt(j);
		       
		       if(c1==c2){
		           
		        Code=Code+".";  
		           
		       }else{
		           
		           Code = Code+"-";
		       }
		      
		      if(j==pattern.length()-1){
		          break;
		      }  
		        
		    }  
	       return Code;
	    }
	

	public static void main(String[] args) {
		//sysout
		
		String pattern ="foo";
		String [] dict = {"abb" ,"abc" ,"xyz" ,"xyy"};
		String Code=decode(pattern);
		
		//String Code =decode(pattern);
	    ArrayList<String> result = new ArrayList<String>();
	    
	    int l = dict.length;
	    
	    for(int i=0;i<l;i++){
	        String newCode = decode(dict[i]);
	        System.out.println(newCode);
	        if(Code.equals(newCode)){
	            result.add(dict[i]);
	            
	        }
	        
	    }
	   
		 
		
		
		System.out.println(result);

	}

}
