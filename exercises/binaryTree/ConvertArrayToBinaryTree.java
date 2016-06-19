package binaryTree;

import utils.BinaryTreeUtils;
import utils.TreeNode;

public class ConvertArrayToBinaryTree {

	public static void main(String[] args) {
		int[] nums = {1, 3, 7, 8};
		TreeNode root = sortedArrayToBST(nums);
		BinaryTreeUtils.inorder(root);
	}

    public static TreeNode sortedArrayToBST(int[] nums) {
    	return sortedArray(nums, 0, nums.length - 1);
    }
    
    public static TreeNode sortedArray(int[] nums, int start, int end) {
    	int mid = start + (end - start)/2;
    	
    	if (start > end) {
    		return null;
    	}
    	
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = sortedArray(nums, start, mid - 1);
    	root.right = sortedArray(nums, mid + 1, end);
    	
        return root;
    }
}
