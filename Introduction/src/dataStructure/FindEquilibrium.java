package dataStructure;
import java.io.*;
public class FindEquilibrium {

	public static void main(String[] args) throws  IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		int t= Integer.parseInt(br.readLine());
 		while(t-->0){
 		    int n= Integer.parseInt(br.readLine());
 		    int a[] = new int[n];
 	String s= br.readLine(); //Input the number seperated by space
	String[] s1 = s.split(" ");
	
	for(int i=0;i<n;i++)
  {
     a[i]=Integer.parseInt(s1[i]);
  }
  
  
  if(n==1){
      
      System.out.println(1);
  } else if(n==2){
      
       System.out.println(-1);
      
  } else if (n==3){
      
      if(a[0]==a[2]){
          
         System.out.println(2);  
      }else{
          
           System.out.println(-1);  
      }
      
      
  }
  
  else{
      int eqi = -1;
      int sum1=0;
      int sum2 =0;
    int j=0,k=n-1;
    
    	for(int i=1;i<n-2;i++)
  {
      while(j<i){
          sum1+=a[j];
          j++;
          
      }
      
      while(i<k){
          sum2+=a[k];
          k--;
          
      }
      
      if(sum1==sum2){
          eqi=i+1;
         
          break;
          
      }else{
         j=0;
         k=n-1;
          sum1=0;
          sum2=0;
      }
      
      
  }
    
    
   System.out.println(eqi);    
      
  }


 		    





           }



 
 
 
 
 }

}
