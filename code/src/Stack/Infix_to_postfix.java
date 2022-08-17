package Stack;

import java.util.ArrayDeque;

public class Infix_to_postfix {

	public static void main(String[] args) {
//		String s = "(a+b/c)*((g/e)-f)";
		String s = "(2*3)-(4/5-6+7)";
		String ans = Infix_to_postfix(s);
		System.out.println(ans);
		
		System.out.println(evaluationPostfix(ans));
	}

//Evaluation of postfix expression (logic)
//	travel left to right
	// 1. Operator
	// second = stack.pop()
	// First - stack.pop()
	// eval = first opratopr second
	// push back to stack

//	Operator
//	push back it to stack

	static int evaluationPostfix(String s) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (isoperator(curr)) {
				int second = stack.pop();
				int first = stack.pop();
				int eval = calculation(first, second, curr);
				
				stack.push(eval);
			}else {
				stack.push(curr-'0');
			}
		}
		return stack.pop();
	}

	private static int calculation(int first, int second, char curr) {
		switch(curr) {
		case '+': 
			return first+second;
		case '-':
			return first-second;
		case '*':
			return first*second;
		case '/':
			return first/second;
		}
		
		return 0;
	}

	static String Infix_to_postfix(String s) {
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == '(') {
				stack.push(cur);
			} else if (cur == ')') {
				while (stack.peek() != '(') {
					if (precedence(cur) <= precedence(stack.peek())) {
						sb.append(stack.pop());
					}
				}
				stack.pop();
			} else if (isoperator(cur)) {
				while (!stack.isEmpty() && precedence(cur) <= precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(cur);
			} else {
				sb.append(cur);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.toString();
	}

	private static boolean isoperator(char cur) {
		return cur == '+' || cur == '-' || cur == '/' || cur == '*';
	}

	private static int precedence(char cur) {
		if (cur == '+' || cur == '-')
			return 1;
		else if (cur == '*' || cur == '/')
			return 2;
		else
			return -1;
	}

}
