package dataStructure;

public class FindNonRepeat {

	public static void main(String[] args) {
		
		int result = 0;
	    int count =0;
	    int n=5;
	    int a[] = {-1,2,-1,3,2};
		
		for(int i=0;i<n;i++){
			count=0;
		   	for(int j=0;j<n;j++){
		   	    
		   	    if(a[i]==a[j]){
		   	      count++;
		   	     //System.out.println(count);	
		   	     
		   	 	 }
		   	    
		   	    
		   	} 
		   	
		   	
		   	if(count==1){
		   	    result = a[i];
		   	    
		   	    break;
		   	    
		   	}
		    
		    
		}
			
		
	System.out.println(result);	
		

	}

}
