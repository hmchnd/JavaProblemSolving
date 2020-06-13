package dataStructure;
import java.util.*; 
public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Integer, String> map = new HashMap<Integer, String>();  
		 
		   map.put(1,"Java");  
		   map.put(2, "Python");  
		   map.put(3, "PHP");  
		   map.put(4, "SQL");
		   map.put(5, "C++");
		   
		   String lag = map.get(5);
		 
		   System.out.println(lag);    

	}

}
