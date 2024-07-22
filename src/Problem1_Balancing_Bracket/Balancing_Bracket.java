package Problem1_Balancing_Bracket;

import java.util.Stack;

public class Balancing_Bracket {
	public static void main(String[] args) {
		//
		String input = "( [ [ { } ] ] )";
		//String input = "( [ [ { } ] ] ) )"; // For unbalanced brackets

		if (isBalanced(input)) {
			System.out.println(input +" The entered String has Balanced Brackets");
		} else {
			System.out.println(input+" The entered Strings do not contain Balanced Brackets");
		}
	}

	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();
		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
