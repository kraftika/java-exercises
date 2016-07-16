package binaryTree;

import java.util.Stack;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class FlattenTree {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree2();
		BinaryTreeUtils.inorder(root);
		flatten(root);
	}
	
	public static void flatten(TreeNode root) {
		// Solution from Program creek
		
		if (root == null) {
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		
		while (p != null && !stack.isEmpty()) {
			if (p.right != null) {
				stack.add(p.right);
			}
			
			if (p.left != null) {
				p.right = p.left;
				p.left = null;
			} else if (!stack.isEmpty()) {
				TreeNode tmp = stack.pop();
				p.right = tmp;
			}
			
			p = p.right;
		}
	}
	
	public static TreeNode flatten2(TreeNode root) {
		// My solution
		return computeTree(root, null, new Stack<TreeNode>());
	}
	
	public static TreeNode computeTree(TreeNode root, TreeNode rootTmp, Stack<TreeNode> stack) {
		// My solution
		rootTmp = new TreeNode(root.data);
		
		if (root.left == null && root.right == null) {
			stack.add(rootTmp);
			return rootTmp;
		}
		
		if (root.left != null) {
			rootTmp.right = computeTree(root.left, rootTmp, stack);
		}
		
		if (root.right != null) {
			TreeNode last = null;
			if (!stack.isEmpty()) {
				last = stack.pop();	
			} else {
				last = rootTmp;
			}
			
			last.right = computeTree(root.right, rootTmp, stack);
		}
		
		return rootTmp;
	}
	
	public static TreeNode flatten1(TreeNode root) {
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
