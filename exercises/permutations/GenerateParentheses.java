package permutations;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		List<String> list = generateParenthesis(3);
		for(String item : list) {
			System.out.format("%s ", item);
		}
	}
	
	public static List<String> generateParenthesis(int n) {
		ArrayList<String> result = new ArrayList<String>();
		dfs(result, "", n, n);
		return result;
	}
	
	public static void dfs(ArrayList<String> result, String s, int left, int right){
		if(left > right)
	        return;
	 
	    if(left == 0 && right == 0){
	        result.add(s);
	        return;
	    }
	 
	    if(left > 0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right > 0){
	        dfs(result, s+")", left, right-1);
	    }
	}
}
