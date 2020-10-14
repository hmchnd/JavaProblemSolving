package advanceDataStructure;

import java.util.NoSuchElementException;

/*
 * 
 * Doubly linked list class implementation. using ListNode private class.
 */

public class DoublyLinkedList {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	/*
	 * Doubly linked list constructor
	 * 
	 */
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
		
		
	}
	
	/*
	 * List Node constructor.
	 * 
	 */
	
	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
			
		}
		
		
		
	}
	
	/*
	 * Check if linked list if empty and head is null
	 * 
	 */
	public boolean isEmpty() {
		return length==0; // head==null
		
	}
	
	/*
	 * Get the length of linked list.
	 */
	public int length() {
		
		return length;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			head= newNode;
		}else {
			
			tail.next = newNode;   // assign next of tail to new node
			newNode.previous = tail; // assign prevoius to tail
		}
		
		
		tail = newNode; // change tail to last node 
		length++;
		
		
	}
	
	/*
	 * Display Linked list in forward
	 */
	
	public void displayForward() {
		ListNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data +"-->");
			temp = temp.next;
		}
		System.out.print("Null");
		System.out.println();
		
	}
	
	/*
	 * 
	 * Display Linked list in backward.
	 */
	
	public void displayBackward() {
		ListNode temp = tail;
		
		while(temp!=null) {
			System.out.print(temp.data +"-->");
			temp = temp.previous;
		}
		System.out.print("Null");
		System.out.println();
		
	}
	
	
	/*
	 * Insert new node in the begin
	 */
	public void inserAtBegin(int value) {
		
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			
		 tail = newNode;
			
		}else {
			
			head.previous = newNode;
			
		}
		
		newNode.next = head;
		head = newNode;
		
		
	}
	
	/*
	 * Delete First node from the linked list
	 */
	public ListNode deleteFirstNode() {
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode temp = head;
		if(head==tail) {
			tail = null;
		} else {
			
			head.next.previous = null;
		}
		
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	/*
	 * Delete the last node from the linked list.
	 */
	public ListNode deleteLastNode() {
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		
		if(head==tail) {
			head=null;
			
		}else {
			
			tail.previous.next = null;
		}
		
		tail = tail.previous;
		temp.previous = null;
		return temp;
		
		
	}
	
	
	/*
	 * Driver method to run the java class.
	 * 
	 */

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertLast(2);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		dll.inserAtBegin(1);
		dll.deleteFirstNode();
		dll.deleteLastNode();
		dll.displayForward();
		//dll.displayBackward();
				
		
		
		

	}

}
