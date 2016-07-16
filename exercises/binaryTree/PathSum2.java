package binaryTree;

import java.util.LinkedList;
import java.util.List;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class PathSum2 {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree();
		List<List<Integer>> list = pathSum(root, 12);
	}
	
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> lists = new LinkedList<List<Integer>>();
    	List<Integer> list = new LinkedList<Integer>();
    	computeSum(root, lists, list, 11);
    	return lists;
    }
    
    public static void computeSum(TreeNode root, List<List<Integer>> lists, List<Integer> list, int s) {
		list.add(root.data);
    	
    	if (root.left == null && root.right == null && s == root.data) {
    		lists.add(list);
    		return;
    	}

    	if (root.left != null) {
    		LinkedList<Integer> list1 = new LinkedList<Integer>();
    		list1.addAll(list);
//    		for (Integer item : list) {
//    			list1.add(item);
//    		}
    		computeSum(root.left, lists, list1, s - root.data);
    	}
    	
    	if (root.right != null) {
    		LinkedList<Integer> list2 = new LinkedList<Integer>();
    		for (Integer item : list) {
    			list2.add(item);
    		}
    		computeSum(root.right, lists, list2, s - root.data);
    	}
    }
}
