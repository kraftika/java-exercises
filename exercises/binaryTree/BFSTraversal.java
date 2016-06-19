package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class BFSTraversal {

	public static void main(String[] args) {
		TreeNode root = buildTree();
		bfs(root);
	}
	
	public static void bfs(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		if (root == null) {
			return;
		}
		
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode node = q.remove();
			if (node.left != null) {
				q.add(node.left);	
			}
			
			if (node.right != null) {
				q.add(node.right);	
			}
			
			System.out.format("%d ", node.data);
		}
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
