package binaryTree;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		TreeNode r = buildTree();
		BinaryTreeUtils.inorder(r);
		System.out.println();
//		String resultMessage = getMax(r) - getMin(r) <= 1 ? "The tree is balanced" : "The is not balanced";
		String resultMessage = isBalanced(r) ? "The tree is balanced" : "The is not balanced";
		System.out.println(resultMessage);
	}
	
    public static boolean isBalanced(TreeNode root) {
    	System.out.println(getDepth(root.left));
    	System.out.println(getDepth(root.right));
        return getDepth(root.left) - getDepth(root.right) <= 1; 
    }
    
    public static int getDepth(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	
    	int maxLeft = getDepth(root.left);
    	int maxRight = getDepth(root.right);
    	
    	return 1 + Math.max(maxLeft, maxRight);
    }
	
	public static int getMax(TreeNode r) {
		int maxl = 0, maxr = 0;
		if (r == null) {
			return 0;
		}
		
		maxl = getMax(r.left) + 1;
		maxr = getMax(r.right) + 1;
		
		return Math.max(maxl, maxr);
	}
	
	public static int getMin(TreeNode r) {
		int maxl = 0, maxr = 0;
		if (r == null) {
			return 0;
		}
		
		maxl = getMin(r.left) + 1;
		maxr = getMin(r.right) + 1;
		
		return Math.min(maxl, maxr);
	}
	
	public static void inorder(TreeNode r) {
		if (r == null) {
			return;
		}
		
		System.out.print(r.data + " ");
		inorder(r.left);
		inorder(r.right);
	}
	
	public static TreeNode buildTree() {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.right = new TreeNode(10);
		root.right.right.right = new TreeNode(13);
		
		return root;
	}
}
