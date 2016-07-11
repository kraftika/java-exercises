package binaryTree;

import java.util.Stack;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree2();
		BinaryTreeUtils.inorder(root);
		root = invertTree(root);
		BinaryTreeUtils.inorder(root);
	}
	
	public static TreeNode invertTree(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		stack.add(root);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			
			TreeNode tmp = node.left;
			node.left = node.right;
			node.right = tmp;
			
			if (node.left != null) {
				stack.add(node.left);
			}
			
			if (node.right != null) {
				stack.add(node.right);
			}
		}
		
		return root;
	}
}
