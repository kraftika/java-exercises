package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class BinaryTreePaths {
	
	public static void main(String[] args) {
		TreeNode root = buildCustomTree();
		BinaryTreeUtils.inorder(root);
		System.out.println();
		List<String> list = treePaths2(root);
	}
	
	public static List<String> treePaths2(TreeNode root) {
		List<String> list = new ArrayList<String>();
		List<String> path = new ArrayList<String>();
		List<List<String>> results = new ArrayList<List<String>>();
		
		if (root == null) {
			return list;
		}
		
		dfs(root, results, path);
		
	    for(List<String> al : results){
	        StringBuilder sb = new StringBuilder();
	        sb.append(al.get(0));
	        for(int i=1; i<al.size();i++){
	            sb.append("->"+al.get(i));
	        }
	 
	        list.add(sb.toString());
	    }
	    
	    return list;
	}
	
	public static void dfs(TreeNode root, List<List<String>> results, List<String> path) {
		path.add(String.valueOf(root.data));
		
		if(root.left == null && root.right == null) {
			results.add(path);
			return;
		}
		
		if (root.left != null) {
			List<String> path1 = new ArrayList<String>(path);
			dfs(root.left, results, path1);
		}

		if (root.right != null) {
			List<String> path2 = new ArrayList<String>(path);
			dfs(root.right, results, path2);
		}
	}
	
	public static TreeNode buildCustomTree() {
	    int limit = 100;
		
		TreeNode root = new TreeNode(BinaryTreeUtils.randomNumber(limit));
		
		TreeNode n1 = new TreeNode(BinaryTreeUtils.randomNumber(limit));
		TreeNode n2 = new TreeNode(BinaryTreeUtils.randomNumber(limit));
		TreeNode n3 = new TreeNode(BinaryTreeUtils.randomNumber(limit));
		TreeNode n4 = new TreeNode(BinaryTreeUtils.randomNumber(limit));
		TreeNode n5 = new TreeNode(BinaryTreeUtils.randomNumber(limit));
		
//		 root
//		/    \
//	   n1     n2
//	  /         \
//	 n3          n4
//	 			/
//	 		   n5
		root.left = n1;
		root.right = n2;
		n1.left = n3;
//		n2.right = n4;
//		n4.left = n5;
		
		return root;
	}
}
