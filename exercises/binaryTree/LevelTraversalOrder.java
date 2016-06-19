package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import utils.TreeNode;

public class LevelTraversalOrder {

	public static void main(String[] args) {
		TreeNode root = buildTree();
		List<List<Integer>> lists = levelOrder(root);
		for(List list : lists) {
			for (int i = 0; i < list.size(); i++) {
				System.out.format("%d ", list.get(i));
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		List<Integer> nodes = new LinkedList<Integer>();
		
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		LinkedList<TreeNode> next = new LinkedList<TreeNode>();
		current.add(root);
		
		while(!current.isEmpty()) {
			TreeNode node = current.remove();
			
			if (node.left != null) {
				next.add(node.left);
			}
			
			if (node.right != null) {
				next.add(node.right);
			}
			
			nodes.add(node.data);
			if (current.isEmpty()) {
				current = next;
				next = new LinkedList<TreeNode>();
				stack.push(nodes);
				nodes = new LinkedList<Integer>();
			}
		}
		
		while(!stack.isEmpty()) {
			lists.add(stack.pop());
		}
		
		return lists;
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
