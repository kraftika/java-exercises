package binaryTree;

import java.util.Stack;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class KSmallestElement {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree();
		System.out.println(printKSmallest(root, 4));
	}
	
	public static int printKSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		
		while(p != null) {
			stack.push(p);
			p = p.left;
		}
		
		while(!stack.isEmpty()) {
			p = stack.pop();
			k--;
			if (k == 0) {
				break;
			}
			
			if (p.right != null) {
				p = p.right;
				
				while(p != null) {
					stack.push(p);
					p = p.left;
				}
			}
		}
		
		if (k > 0) {
			return 0;
		}
		else {
			return p.data;
		}
	}
}
