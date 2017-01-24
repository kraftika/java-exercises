package binaryTree;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class KthLargestElements {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree();
		BinaryTreeUtils.inorder(root);
		System.out.println();
		desc(root);
	}

	public static void desc(TreeNode root) {
		if (root == null) {
			return;
		}
		
		desc(root.right);
		System.out.format("%d ", root.data);
		desc(root.left);
	}
}
