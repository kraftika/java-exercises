package permutations;

import java.util.LinkedList;
import java.util.List;

public class ArrayPermutations {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		getPermutations(arr);
	}
	
    public static List<List<Integer>> getPermutations(int[] nums) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
        List<Integer> list = permuteRest(nums, 0, nums.length);
        lists.add(list);
        return lists;
    }
    
    public static List<Integer> permuteRest(int[] nums, int start, int end) {
    	List<Integer> list = new LinkedList<Integer>();
    	
    	if (nums.length == 1) {
    		list.add(nums[0]);
    		return list;
    	}
    	
    	for(int i = 0; i < nums.length; i++) {
    		list.add(nums[i]); 
    	}
    	
    	return list;
    }
    
    public static int[] copyArrayExcept(int[] nums, int pos) {
    	int[] arr = new int[nums.length - 1];
    	int i = 0;
    	int k = 0;
    	while(k < nums.length) {
    		if(k == pos) {
    			k++;
    			continue;
    		} else {
        		arr[i] = nums[k];
        		i++;
        		k++;
    		}
    	}
    	
    	return arr;
    }
}
