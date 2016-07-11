package binaryTree;

import utils.TreeNode;

public class SameTree {

	public static void main(String[] args) {
		TreeNode r1 = buildCustomTree();
		TreeNode r2 = buildCustomTree();
		
		System.out.println(isSameTree(r1, r2));
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		}
		
		if (p.data == q.data) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		} else {
			return false;
		}
	}
	
	public static TreeNode buildCustomTree() {
	    int limit = 100;
		
		TreeNode root = new TreeNode(13);
		
		TreeNode n1 = new TreeNode(25);
		TreeNode n2 = new TreeNode(41);
		TreeNode n3 = new TreeNode(66);
		TreeNode n4 = new TreeNode(14);
		TreeNode n5 = new TreeNode(9);
		
//		 root
//		/    \
//	   n1     n2
//	  /         \
//	 n3          n4
//	 			/
//	 		   n5
		root.left = n1;
		root.right = n2;
//		n1.left = n3;
//		n1.right = n4;
//		n3.left = n5;
		
		return root;
	}
}
