package intro;
import java.util.*; 
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sd = "pqr.mno";
		
		String [] stAray = sd.split("\\.");
	      
		Collections.reverse(Arrays.asList(stAray));
	      StringBuilder nstr = new StringBuilder();
	      
	      for(int i=0;i<stAray.length;i++){
	          
	          nstr.append(stAray[i]);
	          
	          if(i!=stAray.length-1){
	              
	              nstr.append(".");
	          }
	          
	          
	      }
	      
	      
	      System.out.println(nstr);
		
		
		
		

	}

}
