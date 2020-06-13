package dataStructure;

public class LinkedList {
	
	 Node head; // head of the list 
	 
	 /* Linked list Node*/
	 static  class Node { 
	        int data; 
	        Node next; 
	  
	        // Constructor to create a new node 
	        // Next is by default initialized 
	        // as null 
	        
	        Node(int d) {
	        	data = d; 
	        	next = null; 
	        	
	        } 
	    } 
	
	 /* This function prints contents of linked list starting from head */
	    public void printList() 
	    { 
	        Node n = head; 
	        while (n != null) { 
	            System.out.print(n.data + " "); 
	            n = n.next; 
	        } 
	    } 
	    
	    
	    
	public static void main(String[] args) {
		 /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
        llist.head = new Node(1); 
        Node second = new Node(2); 
        Node third = new Node(3); 
        
        
        llist.head.next = second;
        second.next = third;
        
        llist.printList(); 

	}

}
