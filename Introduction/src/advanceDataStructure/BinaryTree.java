package advanceDataStructure;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
/*
 * Binary tree class implementation
 */
public class BinaryTree {
	private TreeNode root;
	
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		
	}
	
	/*
	 * Create a smaple binary tree for testing it
	 */
	public void createBinaryTree() {
		TreeNode first = new TreeNode(10);
        TreeNode second = new TreeNode(20);
        TreeNode third = new TreeNode(30);
        TreeNode fourth = new TreeNode(40);
        TreeNode fifth = new TreeNode(50);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
        
		
	}
	
	
	/*
	 * 
	 * Traverse Binary tree in pre-order sequence using recursive method.
	 */
	public void preOrder(TreeNode root) {
		if(root==null) {
			
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
		
	}
	
	/*
	 * Pre-order traversal of tree using stack - iterative method.
	 * 
	 */
	public void iterativePreOrder() {
		if(root==null) {
			return;
		}
		
		Stack<TreeNode> stk = new Stack<>();
		stk.push(root);
		
		while(!stk.isEmpty()) {
			TreeNode temp = stk.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null) {
				stk.push(temp.right);
			}
			
			if(temp.left!=null) {
				stk.push(temp.left);
			}
			
		}
		
		
	}
	
	
	public void levelOrderTraversal() {
		if(root==null) {
			
			return;
		}
		
		Queue <TreeNode> Q = new LinkedList();
		Q.offer(root);
		while(!Q.isEmpty()) {
			TreeNode temp = Q.poll();
			System.out.println(temp.data);
			if(temp.left!=null) {
				Q.offer(temp.left);
			}
			
			if(temp.right!=null) {
				Q.offer(temp.right);
			}
			
		}
		
		
	}
	
	/*
	 * Recursive In-Order traversal of binary tree.
	 */
	public void recusiveInorderTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		
		recusiveInorderTraversal(root.left);
		System.out.println(root.data);
		recusiveInorderTraversal(root.right);
		
		
	}

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
	
	
		//bt.iterativePreOrder();
		//bt.recusiveInorderTraversal(bt.root);
		 bt.levelOrderTraversal();
		

	}

}
