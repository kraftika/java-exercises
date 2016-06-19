package binaryTree;

import java.util.LinkedList;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class MinimumDepth {

	public static void main(String[] args) {
		TreeNode root = buildTree();
		BinaryTreeUtils.inorder(root);
		
		System.out.format("\n%d", Math.max(getDepth(root.left), getDepth(root.right)));
	}
	
	public static int minimumDepth(TreeNode root) {
		LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
		LinkedList<Integer> counts = new LinkedList<Integer>();
		
		nodes.add(root);
		counts.add(1);
		TreeNode p = null;
		int count = 0; 
		
		while(!nodes.isEmpty()) {
			p = nodes.remove();
//			count = counts.remove();
			
			if (p.left == null && p.right == null) {
				return count;
			}
			
			if (p.left != null) {
				nodes.add(p.left);
				count++;
			}
			
			if (p.right != null) {
				nodes.add(p.right);
				counts.add(count + 1);
			}
		}
		
		return count;
	}
	
	public static int getDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int maxl = getDepth(root.left);
		int maxr = getDepth(root.right);
		
		return 1 + Math.max(maxl, maxr);
	}
	
	public static TreeNode buildTree() {
		TreeNode root = new TreeNode(4);
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(9);
		
		root.left = t1;
//		root.right = t2;
		
		t1.right = t3;
//		t2.right = t4;

		return root;
	}
}
