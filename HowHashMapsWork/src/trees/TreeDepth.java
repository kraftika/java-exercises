package trees;

public class TreeDepth {
	public static void main(String[] args) {
		Node root = new Node(13);
		Node left = new Node(24);
		Node right = new Node(16);
		
		root.setLeft(left);
//		left.setLeft(right);
		root.setRight(right);
		
		//inorder(root);
		System.out.println(findDepth(root));
	}
	
	public static int findDepth(Node root) {
		if (root == null) {
			return 0;
		}
		
		int left = 0;
		int right = 0;
		
		if (root.left() != null){
			left = findDepth(root.left());
		}
		
		if (root.right() != null){
			right = findDepth(root.right());
		}
		
		return ((left > right ? left : right) + 1);
		
		//return Math.max(left, right);
	}
	
	public static void inorder(Node root){
		if (root == null){
			return;
		}
		
		inorder(root.left());
		System.out.println(root.getData());
		inorder(root.right());
	}
}
