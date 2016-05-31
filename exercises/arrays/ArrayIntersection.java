package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] a = {1,2,4,8};
		int[] b = {2,4};
		intersection(a, b);
	}
	
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return null;
        }   
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!list.contains(nums1[i])) {
                        list.add(nums1[i]);    
                    }
                }
            }
        }
        
        int[] resultedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	resultedArray[i] = list.get(i);
        }
        return resultedArray;
    }
}
