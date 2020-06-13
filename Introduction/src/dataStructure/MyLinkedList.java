package dataStructure;

public class MyLinkedList {
	Node head;
	
	// Add method implementation
	
	void add(int data) {
		Node toAdd = new Node(data);
		// check if linked list is empty if yes then add node to head itself
		if(head==null) {
			
			head=toAdd;
			return;
		}
		
		
		// to add any new node into linked list we need to traverse to last node and add there . to identify last node we 
		// have to look for null value node
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
			
		}
		
		temp.next = toAdd;
		
		
	}
	
	
	
	 /* Takes index as argument and return data at index*/
     void GetNth(int index) 
    { 
        Node current = head; 
        int count = 0; /* index of Node we are 
                          currently looking at */
        while (current != null) 
        { 
            if (count == index) 
               // return current.data; 
            	System.out.println(current.data);
            count++; 
            current = current.next; 
        } 
  
    } 
	
	
	
	
	void print() {
		
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
			
		}	
		
	}
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			
			this.data = data;
			next=null;
			
		}
		
		
	}
	
	
	
	

public static void main(String[] args) {
		
MyLinkedList myLL = new MyLinkedList();
myLL.add(12);
myLL.add(13);
myLL.add(15);

//myLL.print();
myLL.GetNth(1);

}

}
