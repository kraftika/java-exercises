package binaryTree;

import java.util.LinkedList;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class SumRootToLeafNumbers {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree2();
		LinkedList<String> list = new LinkedList<String>();
		computeSum(root, "", list);
		
		int s = 0;
		for(String item : list) {
			s += Integer.parseInt(item);
		}
		System.out.println(s);
	}
	
	public static void computeSum(TreeNode root, String s, LinkedList<String> list) {
		if (root.left == null && root.right == null) {
			list.add(s + Integer.toString(root.data));
			return;
		}
		
		if (root.left != null) {
			computeSum(root.left, s + Integer.toString(root.data), list);
		}
		
		if (root.right != null) {
			computeSum(root.right, s + Integer.toString(root.data), list);
		}
	}
}
