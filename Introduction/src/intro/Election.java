package intro;
import java.util.*; 
public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 String [] someArray = new String[]{"john", "johnny", "jackie", "johnny","john" ,"jackie", "jamie" ,"jamie" ,"john", "johnny" ,"jamie", "johnny", "john"};
		    Map<Integer,String> repeatationMap= new HashMap<Integer,String>();
		    for(String str : someArray){

		        if(repeatationMap.containsKey(str)) {
		        	int ind = repeatationMap.hashCode() + 1;
		            repeatationMap.put(ind,str);
		        }
		        else {
		            repeatationMap.put(1,str);
		        }
		    }

		    Set set = repeatationMap.entrySet();
	         Iterator iterator2 = set.iterator();
	         while(iterator2.hasNext()) {
	              Map.Entry me2 = (Map.Entry)iterator2.next();
	              System.out.println("Election result: " + me2.getKey());
	              
	         }
	         
		   

	}

}
