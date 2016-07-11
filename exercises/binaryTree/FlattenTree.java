package binaryTree;

import java.util.Stack;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class FlattenTree {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree2();
		BinaryTreeUtils.inorder(root);
		root = flatten(root);
		BinaryTreeUtils.inorder(root);
	}
	
	public static TreeNode flatten(TreeNode root) {
		if (root.left == null && root.right == null) {
			return root;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode p = root;
		TreeNode root1 = null;
		
		while(p != null) {
			p = p.left;
			stack.add(p);
		}
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			
			root1 = addNode(root1, node.data);
			
			if (node.right != null) {
				stack.push(node.right);
				p = node.right;
				
				while (p != null) {
					p = p.left;
					stack.add(p);
				}
			}
		}
		
		return root;
	}
	
	public static TreeNode addNode(TreeNode root, int val) {
		TreeNode node = new TreeNode(val);
		TreeNode p = root;
		
		while (p.right != null) {
			p = p.right;
		}
		
		if (root == null) {
			p = node;
		} else {
			p.right = node;
		}
		
		return root;
	}

}
