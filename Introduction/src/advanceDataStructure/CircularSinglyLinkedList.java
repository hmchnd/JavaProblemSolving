package advanceDataStructure;

public class CircularSinglyLinkedList {
	
	private ListNode last;
	private int length;
	
	private class ListNode{
		
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public CircularSinglyLinkedList() {
		
		this.last = null;
		this.length = 0;
	}
	
	public int length() {
		
		return length;
	}
	
	public boolean isEmpty() {
		
		return length==0;
		
	}
	
	public void createInitialCircularList() {
		
		
		ListNode one = new ListNode(1);
		ListNode secnd = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(15);
		
		one.next = secnd;
		secnd.next = third;
		third.next = fourth;
		fourth.next = one;
		last = fourth;
				
		
	}
	
	
	public void display () {
		if(last==null) {
			
			return;
		}
		
		ListNode first = last.next;
		
		while(first!=last) {
			System.out.print(first.data +" ");
			first = first.next;
			
		}
		System.out.print(first.data +" ");
		
	}

	public static void main(String[] args) {
		CircularSinglyLinkedList cl = new CircularSinglyLinkedList();
       cl.createInitialCircularList();
       cl.display();
	}

}
