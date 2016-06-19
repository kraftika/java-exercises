package binaryTree;

import utils.TreeNode;

public class CommonAncestor {

	public static void main(String[] args) {
		TreeNode root = buildTree();
		TreeNode findNode = new TreeNode(7);
		System.out.println(covers(root.left, findNode));
		System.out.println(covers(root.right, findNode));
	}
	
	public static boolean covers(TreeNode root, TreeNode p) {
		if (root == null) {
			return false;
		}
		
		if (root == p) {
			return true;
		}
		
		return covers(root.left, p) || covers(root.right, p);
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
		t2.left = t4;

		return root;
	}
}
