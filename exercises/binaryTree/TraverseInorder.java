package binaryTree;

import java.util.Stack;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class TraverseInorder {

	public static void main(String[] args) {
		TreeNode root = buildCustomTree();
		BinaryTreeUtils.inorder(root);
		System.out.println();
		printInorder(root);
	}
	
	public static void printInorder(TreeNode root) {
		TreeNode p = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		if (p.left == null && p.right == null) {
			System.out.format("%d ", p.data);
			return;
		}
		
		while (p != null) {
			stack.push(p);
			p = p.left;
		}
		
		while(!stack.isEmpty()) {
			p = stack.pop();
			System.out.format("%d ", p.data);
			
			if (p.right != null) {
				p = p.right;
				while(p != null) {
					stack.push(p);
					p = p.left;
				}
			}
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
