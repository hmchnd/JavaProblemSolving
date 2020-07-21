package dataStructure;

import java.util.EmptyStackException;

public class StackUsingLinkedList {

	private int length;
	private NodeClass top;
	
	public StackUsingLinkedList() {
		length=0;
		top=null;
		
	}
	
	public void push(int data) {
	NodeClass ns = new NodeClass(data);
	
	ns.setNext(top);   //  ns.next=top
	top = ns;
	length++;
		
	}
	
	public boolean isEmpty() {
		return (length==0);
		
		
	}
	
	
	public int pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
			
		}
		
		int res = top.getData();
		top = top.getNext();
		length--;
		return res;
		
		
	}
	
	public int size() {
		
		return length;
	}
	
	public String toString() {
		String str="";
		NodeClass ns=top;
		while(ns!=null) {
			System.out.print(ns.getData()+"-->");
			ns=ns.getNext();
		}
		return str;
		
	}
	
	
	
	public class NodeClass {
		public int data;
		public NodeClass next;
		
		public NodeClass(int data) {
			this.data=data;
			this.next=null;
			
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public NodeClass getNext() {
			return next;
		}

		public void setNext(NodeClass next) {
			this.next = next;
		}
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	var oStack = new StackUsingLinkedList();

	System.out.println(oStack.isEmpty());
	
	System.out.println(oStack.size());
	
	oStack.push(10);
	oStack.push(20);
	oStack.push(30);
	oStack.push(40);
	oStack.push(50);
	
	System.out.println(oStack.toString());
	System.out.println(oStack.size());
	oStack.pop();
	System.out.println(oStack.toString());
	System.out.println(oStack.size());
	}

}
