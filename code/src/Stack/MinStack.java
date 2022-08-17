package Stack;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minstack = new Stack<>();
	
	void push(int e) {
		stack.push(e);
		if(minstack.isEmpty()) {
			minstack.push(e);
			return;
		}
		if(e<=minstack.peek()) {
			minstack.push(e);
		}
	}
		
	int pop() throws Exception {
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		int ans = stack.pop();
		if(ans==minstack.peek()) {
			minstack.pop();
		}
		return ans;
	}
	
	int min() throws Exception{
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		int ans = minstack.peek();
		return ans;
	}
		
}
