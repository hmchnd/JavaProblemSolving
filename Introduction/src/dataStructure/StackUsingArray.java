package dataStructure;

public class StackUsingArray {
	static final int MAX = 10;
	int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
	
    StackUsingArray(){
    	
    	top=-1;
    }
    
    void push(int x) {
    	if(top>=(MAX-1)) {
    		
    		System.out.println("Stack overflow");
    	}else {
    		a[++top]=x;
    		System.out.println(x +"Pushed to Stack");
    		
    	}
    	
    }
    
    int pop() {
    	if(top<0) {
    		System.out.println("Stack underflow");
    		return -1;
    		
    	}else {
    		int x = a[top--];
    		return x;
    	}
    	
    }
    
    void printStack() {
    	
    	for (int i : a) {
			System.out.println(i);
		}
    	
    }
	
	
	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(40);
		s.push(40);
		s.push(40);
		s.push(40);
		s.push(40);
		s.push(40);
		s.push(40);
        s.printStack();
	}

}
