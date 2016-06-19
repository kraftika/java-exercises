package binaryTree;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class ValidBST {

	public static void main(String[] args) {
		TreeNode root = buildTree();
		BinaryTreeUtils.inorder(root);
		System.out.println(isValidBST(root));
	}
	
	public static boolean isValidBST(TreeNode root) {
		return isValid(root, Double.MIN_VALUE, Double.MAX_VALUE);		
	}
	
	public static boolean isValid(TreeNode root, double min, double max) {
		if (root == null) {
			return true;
		}

		if (root.data <= min || root.data >= max) {
			return false;
		}
		
		return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
	}

	public static TreeNode buildTree() {
		TreeNode root = new TreeNode(4);
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(9);
		
		root.left = t1;
		root.right = t2;
		
		t1.right = t3;
		t2.right = t4;

		return root;
	}
}
