package binaryTree;

import java.util.LinkedList;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class MaximumDepth {

	public static void main(String[] args) {
		TreeNode root = buildTree();
		BinaryTreeUtils.inorder(root);
		
		System.out.format("\n%d", maximumDepth(root));
	}
	
	public static int maximumDepth(TreeNode root) {
		LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
		LinkedList<Integer> counts = new LinkedList<Integer>();
		
		nodes.add(root);
		counts.add(1);
		TreeNode p = null;
		int count = 0; 
		
		while(!nodes.isEmpty()) {
			p = nodes.remove();
			count = counts.remove();
			
			if (p.left == null && p.right == null) {
				return count;
			}
			
			if (p.left != null) {
				nodes.add(p.left);
				counts.add(count + 1);
			}
			
			if (p.right != null) {
				nodes.add(p.right);
				counts.add(count + 1);
			}
		}
		
		return count;
	}
	
	public static TreeNode buildTree() {
		TreeNode root = new TreeNode(4);
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(9);
		
		root.left = t1;
//		root.right = t2;
		
//		t1.right = t3;
//		t2.right = t4;

		return root;
	}

}
