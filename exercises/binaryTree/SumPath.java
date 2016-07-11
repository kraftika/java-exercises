package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class SumPath {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtils.buildCustomTree();
		System.out.println(hasPathSum(root, 15));
	}
	
    public static boolean hasPathSum(TreeNode root, int sum) {
    	List<Integer> list = new ArrayList<Integer>();
    	if (root == null) {
    		return false;
    	}
 
        sumPath(root, 0, list);
        for(Integer item : list) {
        	if (item == sum) {
        		return true;
        	}
        }
        
        return false;
    }
    
    public static void sumPath(TreeNode root, int innerSum, List<Integer> list) {
    	innerSum += root.data;
    	
    	if (root.left == null && root.right == null) {
    		list.add(innerSum);
    		return;
    	}
    	
    	if (root.left != null) {
    		sumPath(root.left, innerSum, list);
    	}
    	
    	if (root.right != null) {
    		sumPath(root.right, innerSum, list);
    	}
    }
}
