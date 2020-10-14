package advanceDataStructure;

import java.util.NoSuchElementException;

/*
 * Queue Data structure class implementation.
 * 
 */

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;

	/*
	 * Internal class ListNode
	 */
	public class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public int length() {

		return length;
	}

	public boolean isEmpty() {

		return length == 0;
	}

	public Queue() {

		this.front = null;
		this.rear = null;
		this.length = 0;
	}

	public void enqueue(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			front = newNode;

		} else {

			rear.next = newNode;

		}

		rear = newNode;
		length++;

	}

	public void dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else if (front == rear) {
			front = null;
			rear = null;
		}
		front = front.next;
		length--;

	}

	public void display() {

		if (isEmpty()) {
			return;
		}

		ListNode current = front;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;

		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		q.enqueue(40);
		q.dequeue();
		q.display();

	}

}
