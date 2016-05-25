package binaryTree;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		Node r = buildTree();
		inorder(r);
		System.out.println();
		String resultMessage = getMax(r) - getMin(r) <= 1 ? "The tree is balanced" : "The is not balanced";
		System.out.println(resultMessage);
	}
	
	public static int getMax(Node r) {
		int maxl = 0, maxr = 0;
		if (r == null) {
			return 0;
		}
		
		maxl = getMax(r.left) + 1;
		maxr = getMax(r.right) + 1;
		
		return Math.max(maxl, maxr);
	}
	
	public static int getMin(Node r) {
		int maxl = 0, maxr = 0;
		if (r == null) {
			return 0;
		}
		
		maxl = getMin(r.left) + 1;
		maxr = getMin(r.right) + 1;
		
		return Math.min(maxl, maxr);
	}
	
	public static void inorder(Node r) {
		if (r == null) {
			return;
		}
		
		System.out.print(r.data + " ");
		inorder(r.left);
		inorder(r.right);
	}
	
	public static Node buildTree() {
		Node root = new Node(1);
		
		Node n1 = new Node(4);
		Node n3 = new Node(7);
			
		root.left = n1;
		n1.right = n3;
			
		return root;
	}
}
