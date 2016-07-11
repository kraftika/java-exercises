package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class BalancedParenthesis {
	
	public static HashMap<Character, Character> parenthesis = new HashMap<Character, Character>();
	public static Stack<Character> stack= new Stack<Character>();
	
	public static class Node {
		private char data;
		
		public Node(char data) {
			this.data = data;
		}
	}
	
	public static boolean isBalancedParenthesis(String text) {
		char indexedChar;
		boolean isBalanced = true;
		
		if (text.length() == 0) {
			return true;
		}
		
		stack.removeAllElements();
		
		for (int i = 0; i < text.length(); i++) {
			indexedChar = text.charAt(i);
			if (parenthesis.containsKey(indexedChar)) {
				stack.push(parenthesis.get(indexedChar));
			} else if (parenthesis.containsValue(indexedChar)) {
				if (stack.peek() == indexedChar) {
					stack.pop();
				} else {	
					return false;
				}
			}
		}
		
		if (stack.size() > 0) {
			return false;
		}
		
		return isBalanced;
	}
	
    public static boolean isValid(String s) {
    	List<Character> openBrackets = new ArrayList<Character>();
    	openBrackets.add('(');
    	openBrackets.add('[');
    	openBrackets.add('{');
    	
    	List<Character> closedBrackets = new ArrayList<Character>();
    	closedBrackets.add(')');
    	closedBrackets.add(']');
    	closedBrackets.add('}');
    	
    	char indexedChar;
    	Stack<Character> stack = new Stack<Character>();
    	
		if (s.length() == 0) {
			return true;
		}
		
		for (int i = 0; i < s.length(); i++) {
			indexedChar = s.charAt(i);
			if (openBrackets.contains(indexedChar)) {
				int pos = openBrackets.indexOf(indexedChar);
				stack.push(closedBrackets.get(pos));
			} else if (closedBrackets.contains(indexedChar)) {
				if (stack.peek() == indexedChar) {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}
		
		if (stack.size() > 0) {
			return false;
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		parenthesis.put('(', ')');
		parenthesis.put('[', ']');
		parenthesis.put('{', '}');
		
		String text;
		ArrayList<String> testSuite = new ArrayList<String>();
		testSuite.add("");
		testSuite.add(")");
		testSuite.add("[]");
		testSuite.add("()");
		testSuite.add("(}");
		testSuite.add("(ssaas");
		testSuite.add("[({)}]");
		testSuite.add("[()]");
		testSuite.add("[]()[]");
		
		for (int i = 0; i < testSuite.size(); i++) {
			text = testSuite.get(i);
//			System.out.println(text + " -> " + isBalancedParenthesis(text));
			System.out.println(text + " -> " + isValid(text));
		}
	}
}
