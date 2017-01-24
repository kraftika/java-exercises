package utils;

import java.util.Random;

public class BinaryTreeUtils {

	private static int maxLimit = 100; 
	
	public static TreeNode buildTree(int capacity) {
		if (capacity == 0) {
			return null;
		}
		
		TreeNode root = new TreeNode(randomNumber(maxLimit));
		TreeNode node = null;
		
		for (int i = 0; i < capacity - 1; i++) {
			node = new TreeNode(randomNumber(maxLimit));
			
		}
		
		return root;
	}
	
	public static int randomNumber(int n) {
		Random random = new Random();
		return 1 + random.nextInt(100) % n;
	}
	
	public static void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.format(root.data + " ");
		inorder(root.right);
	}
	
	public static void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	
	public static TreeNode buildCustomTree() {
		TreeNode root = new TreeNode(13);
		root.left = new TreeNode(5);
		root.right = new TreeNode(16);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(7);
		
		return root;
	}
	
	public static TreeNode buildCustomTree2() {
		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
		
//		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);

		
		return root;
	}
}
