package dataStructure;
import java.util.Scanner;
public class Populate2Darray {

	 public static void spiral(int[][] a,int m,int n){
	     /*
	      * a is 2d array
	      * m is max row length
	      * n is col length
	      * k is row starting index
	      * l = col starting index
	      * */   
		 
		 int k=0,l=0;
	        
	        
	        while(k<m && l<n){
	            
	            for(int i=l;i<n;i++){
	                
	                System.out.print(a[k][i]+" ");
	            }
	            k++;
	            
	           for(int i=k;i<m;i++){
	                
	                System.out.print(a[i][n-1]+" ");
	            }  
	           n--;
	           
	           if(k<m){
	               
	               for(int i=n-1;i>=l;--i){
	                
	                System.out.print(a[m-1][i]+" ");
	            }  
	            m--;   
	               
	           }
	           
	           
	           if(l<n){
	               
	                
	               for(int i=m-1;i>=k;--i){
	                
	                System.out.print(a[i][l]+" ");
	            }  
	               l++;
	               
	           }
	            
	            
	        }
	         
	         
	         
	     }
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			int R = sc.nextInt();
	 		int C = sc.nextInt();
	 		int matrix[][] = new int [R][C];
		
	 		 for (int i = 0; i < R; i++)
	          {
	              for (int j = 0; j < C; j++)
	              {
	                  
	                  matrix[i][j] = sc.nextInt();
	              }
	          }
	 		 
	 		spiral(matrix,R,C);
	 		System.out.println();

		
		
	}







 }


