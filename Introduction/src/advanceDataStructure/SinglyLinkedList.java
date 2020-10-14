package advanceDataStructure;
/*
 * Class Implementation for Linked List data structure.
 */
public class SinglyLinkedList {
	private ListNode head;

	/*
	 * Static inner class for list node
	 */
	private static class ListNode{
		
		private int data;
		private ListNode next;
		
		
	/*
	 * Constructor for List Node while new node created
	 * @param data - pass the argument to create data node
	 */
		public ListNode(int data) {
			this.data = data;
			this.next = null;
			
		}
		
		
	}
	
	/*
	 * Insert Node to the beginning to Linked List.
	 */
	public ListNode insertAtBegin(ListNode head, int data) {
		
		ListNode newNode = new ListNode(data);
		if(head==null) {
			
			return newNode;
		}
		
		newNode.next = head;
		head = newNode; 
		return head;
		
	}
	
	
	/*
	 * Insert Node to the last of linked List.
	 */
	public void insertLast(ListNode head,int value) {
		ListNode newNode = new ListNode(value);
		if(head==null) {
			
			head = newNode;
			return;
		}
		
		
		ListNode current = head;
		while(current.next!=null) {
			current = current.next;
			
		}
		
		current.next = newNode;
		
		
	}
	
	/*
	 * Insert a node after any given node in linked list.
	 */
	public void insertAfter(ListNode previous, int data) {
		if(previous==null) {
			
			return;
		}
		
		ListNode newNode = new ListNode(data);
		newNode.next = previous.next;
		previous.next = newNode;
		
	}
	
	
	
	/*
	 * Display method for linked list.
	 * @param head node
	 */
	public void display (ListNode head ) {
	
		if(head==null) {
			return;
		}
		
		ListNode current = head;
		
		while(current!=null) {
			
			System.out.print(current.data+"-->");
			current = current.next;
			
		}
		System.out.print(current);
	}
	
	/*
	 * Given a Listnode head, find length of list.
	 */
	
	public int length(ListNode head) {
		if(head==null) {
			return 0;
			
		}
		
		int count = 0;
		ListNode current = head;
		
		while(current!=null) {
			count++;
			current = current.next;
			
		}
		return count;
	}
	
	
	/*
	 * Insert Node at given position in linked list
	 */
	public ListNode insertAtPos(ListNode head, int data, int pos) {
		int size = length(head);
		if(pos> size+1 || pos<1) {
			System.out.println("Invalid position");
			return head;
		}
		
		ListNode newNode = new ListNode(data);
		
		if(pos==1) {
			newNode.next = head;
		    return newNode;
			
		} else {
			int count =1;
			ListNode previous = head;
			while(count< pos-1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
			return head;
			
		}
		
	}
	
	/*
	 * Delete Last Node from linked list.
	 */
	public ListNode deleteLastNode(ListNode head) {
		if(head==null) {
			
			return head;
		}
		
		ListNode last = head;
		ListNode previousToLast = null;
		
		while(last.next!=null) {
			previousToLast = last;
			last = last.next;
		}
		
		previousToLast.next = null; 
		return previousToLast;
		
	}
	
	/*
	 * Delete First node from the linked list.
	 * 
	 */
	
	public ListNode deleteFirstNode(ListNode head) {
		if(head==null) {
			return head;
		}
		
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
		
	}
	
	
	/*
	 * Search a node from the linked list 
	 */
	
	public void searchNode(ListNode head, int searchKey) {
		if(head==null) {
			
			System.out.println("List is empty. No search found!!");
			return;
		}
		
		
		ListNode current = head;
		
		while(current!=null) {
			
			if(current.data==searchKey) {
				System.out.println("Node found");
				return;
			}
			current = current.next;
			
		}
		
		System.out.println("Node not found");
		
		
	}
	
	
	/*
	 * 
	 * Delete the node from the given position of linked list.
	 */
	
	public ListNode deleteAtPos (ListNode head, int pos) {
		
		int size = length(head);
		if(pos > size || pos<1) {
			return head;
			
		}
		
		
		if(pos==1) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
			
		}else {
			ListNode previous = head;
			int count = 1;
			
			while(count >pos-1) {
				previous = previous.next;
				count++;
				
			}
			
			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
			return current;
			
		}
		
		
		
		
	}
	
	
	/*
	 * Reverse the linked List.
	 */
	public ListNode reverse(ListNode head) {
		
		if(head==null) {
			
			
			return head;
		}
		
		ListNode current = head;
		ListNode next = null;
		ListNode previous = null;
		while(current!=null) {
			next =current.next;
			current.next = previous;
			previous = current;
			current = next;
	}
		return previous;
		
		
	}
	
	/*
	 * 
	 * Find the middle node from the given linked list
	 */
	
	public ListNode MiddleNode(ListNode head){
		if(head==null) {
			
			return null;
			
		}
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
	
		return slowPtr;
		
		
	}
	
	
	/*
	 * 
	 * FInd the Nth node from the end of linked list.
	 */
	public ListNode getNthNodeFromEnd(ListNode head, int n) {
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count =0;
		
		while(count<n) {
			refPtr = refPtr.next;
			count++;
		}
		
		while(refPtr!=null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
			
		}
		
		return mainPtr;
		
	}
	
	/*
	 * Remove duplicate node from linked list
	 */
	
	public void removeDuplicate(ListNode head) {
		ListNode current = head;
		while(current!=null && current.next!=null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				
				current = current.next;
			}
			
		}
		
	}
	
	/*
	 * Inser new node into the sorted linked list without changing sorting.
	 */
	
	public ListNode insertInSortedList(ListNode head, int value) {
		ListNode current = head;
		ListNode temp = null;
		ListNode newNode = new ListNode(value);
		 while(current!=null & current.data<newNode.data) {
		    	temp = current;
			 current = current.next;
			 
		 }
		 
		 newNode.next = current;
		 temp.next = newNode;
		 return head;
		
		
	}
	
	/*
	 * Remove the given key from the linked list
	 * 
	 */
	
	public void removeGivenKeyFromList(ListNode head, int key) {
		ListNode current = head;
		ListNode temp = null;
		
		while(current!=null && current.data!=key) {
			temp = current;
			current = current.next;
			
		}
		
		if(current==null) {
			return;
		}
		
		temp.next = current.next;
		
	}
	
	
	
	
	// Driver Method to run Java class.
	public static void main(String[] args) {
		// 10-->8-->1-->11-->null
		// 10 is head node
		
		  ListNode head = new ListNode(1); 
 		  ListNode second = new ListNode(8); 
		  ListNode third = new ListNode(10);
		  ListNode fourth = new ListNode(11);
		  ListNode fifth = new ListNode(15);
		  ListNode sixth = new ListNode(16);
		  
		  head.next = second; 
		  second.next = third; 
		  third.next = fourth;
		  fourth.next = fifth;
		  fifth.next = sixth;
				  
	      
		  
		  SinglyLinkedList list = new SinglyLinkedList(); 
		  list.display(head);
		  System.out.println();
		  
		  list.insertInSortedList(head, 14);
		  list.display(head);
		  System.out.println(); 
		  
		  list.removeGivenKeyFromList(head, 14);
		  list.display(head);
		  System.out.println(); 
		  //list.removeDuplicate(head);
		  //list.display(head);
	
		  
		  //ListNode newHead = list.reverse(head);
		  //list.display(newHead);
		  
		 //ListNode Nth = list.getNthNodeFromEnd(head,2);
		  //System.out.println(Nth.data);
		 
		 // list.searchNode(head, 8);
		  
		  //ListNode deletedNode = list.deleteAtPos(head, 3);
		  //System.out.println(deletedNode.data);
		  //list.display(head);
		  
		  
		 
		/*
		 * ListNode newHead = list.insertAtBegin(head, 15); list.display(newHead);
		 */
		
		/*
		 * System.out.println(); list.insertLast(head,20); list.display(head);
		 */
		
		/*
		 * System.out.println(); list.insertAfter(second, 21); list.display(head);
		 */
		
		/*
		 * System.out.println(); head = list.insertAtPos(head, 67, 3);
		 * list.display(head);
		 */                                                                
		
		/*
		 * System.out.println(); ListNode last = list.deleteLastNode(head);
		 * System.out.println(last.data);
		 */
	
		
		//System.out.println("Length="+list.length(head));

	}
	
	
	

}
