package advanceDataStructure;

import java.util.EmptyStackException;

/*
 * Stack class implementation using linked list
 */
public class Stack {

	private ListNode top;
	private int length;
	
	
	public  Stack() {
		
		top = null;
		length= 0;
		
	}
	
	
	/*
	 * Internal class List Node.
	 */
	private class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			
		}
		
		
	}
	
	/*
	 * Return Length of stack
	 */
	public int length() {
		return length;
	}
	
	/*
	 * Check if Stack is empty or not.
	 */
	public boolean isEmpty() {
		return length==0;
		
	}

	/*
	 * 
	 * Push operation of stack to insert the data on top of stack.
	 */
	public void push(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = top;
		top = newNode;
		length++;
	}
	
	/*
	 * Remove top element . Pop operation.
	 */
	public int pop() {
		
		if(isEmpty()) {
			
			throw new EmptyStackException();
		}
		
		int result = top.data;
		top = top.next;
		length--;
		return result;
		
	}
	
	/*
	 * Peek operation of stack to display the top element in stack.
	 */
	public int peek() {
		if(isEmpty()) {
			
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	public static void main(String[] args) {
		
		Stack stk = new Stack();
		stk.push(10);
		stk.push(30);
		stk.pop();
		System.out.println(stk.peek());
		
	}

}
