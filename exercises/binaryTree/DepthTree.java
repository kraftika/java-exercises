package binaryTree;

public class DepthTree {

	public static void main(String[] args) {
		Node root = buildTree();
		System.out.println(calcDepth(root));
//		printTree(root);
	}
	
	public static int calcDepth(Node root) {
		if (root == null) {
			return 0;
		} 
		
		int leftDepth = calcDepth(root.left);
		int rightDepth = calcDepth(root.right);
					
		return Math.max(leftDepth, rightDepth) + 1;
	}
	
	 public static Node buildTree() {
	    Node root = new Node(2);

	    Node n1 = new Node(3);
	    Node n2 = new Node(8);

	    Node n3 = new Node(6);
	    Node n4 = new Node(9);
	    Node n5 = new Node(6);

	    root.left = n1;
	    root.right = n2;

	    n1.left = n3;
	    n1.right = n4;

	    n2.right = n5;
	    
	    return root;
	  }
	 
	 	public static void printTree(Node root) {
	 		if (root == null) {
	 			System.out.println("The tree is empty");
	 		}
	 		
	 		System.out.print(root.data + " ");
	 		
	 		if (root.left != null) {
	 			printTree(root.left);
	 		}
	 		
	 		if (root.right != null) {
	 			printTree(root.right);
	 		}
	 	}
}
