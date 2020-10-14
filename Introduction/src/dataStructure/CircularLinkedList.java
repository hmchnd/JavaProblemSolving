package dataStructure;

public class CircularLinkedList {
	private Node head = null;
    private Node tail = null;
	
	
    class Node {
    	 
        int value;
        Node nextNode;
     
        public Node(int value) {
            this.value = value;
        }
    }
	
    
    public void addNode(int value) {
        Node newNode = new Node(value);
     
        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }
     
        tail = newNode;
        tail.nextNode = head;
    }
    
    
    public void display() {
    	Node currentNode = head;
    	 
        if (head != null) {
            do {
               // LOGGER.info(currentNode.value + " ");
            	System.out.println(currentNode.value + " ");
                currentNode = currentNode.nextNode;
            } while (currentNode != head);
        }
    	
    	
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cll = new CircularLinkedList();
		cll.addNode(13);
	    cll.addNode(7);
	    cll.addNode(24);
	    cll.addNode(1);
	    cll.display();

	}

}
