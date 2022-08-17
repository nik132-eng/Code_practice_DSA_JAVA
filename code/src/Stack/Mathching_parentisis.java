package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Mathching_parentisis {

	public static void main(String[] args) {
//		boolean ans = matching_parenthisis("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())");
//		System.out.println(ans);
		
		int[] a = {5,1,2,3,9,6,1,4,3};
		System.out.println(Arrays.toString(previousSmaller(a)));
	}

	public static int[] previousSmaller(int a[]) {
		int ans[] = new int[a.length];
		ArrayDeque<Integer> st = new ArrayDeque<>();
		int i=0;
		for(int e:a) {
			while(!st.isEmpty() && st.peek()>=e) {
				st.pop();
			}
			
			if(st.isEmpty()) ans[i]=-1;
			else ans[i]=st.peek();
			st.push(e);
			i++;
		}
		return ans;
	}
	
	
	private static boolean matching_parenthisis(String s) {

		ArrayDeque<Character> st = new ArrayDeque<>();
		ArrayDeque<Character> st1 = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);

			if (curr == '(') {
				st.push(curr);
			}
			if (curr == '*') {
				st1.push(curr);
			}
			if (curr == ')' && st.size()==0 && st1.size()==0) return false;
			else if(curr==')' && st.size()>0) st.pop();
			else if(curr==')' && st1.size()>0) st1.pop();
			
		}
		if (!st.isEmpty() && st1.isEmpty()) {
			return false;
		}
		
		  while(!st.isEmpty()) { // we can have '*' leftover, but 'open' must run out 
	            if(st1.isEmpty()) {return false;} // '(' leftover
	            else if (st.peek()<st1.peek()){st.pop(); st1.pop();} // '*'index > '(' index, matched
	            else {return false;} // open>top, corner case
	        }

		return true;

//		
//		ArrayDeque<Character> st = new ArrayDeque<>();
//		
//		for(int i=0;i<s.length();i++) {
//			char curr = s.charAt(i);
//			
//			if(curr=='{' || curr=='[' || curr =='(') {
//				st.push(curr);
//				continue;
//			}
//			if(curr=='}' || curr==']' || curr ==')') {
//				if(st.isEmpty()) return false;
//			}
//			char top = 'a';
//			switch(curr) {
//			case '}' : 
//				top=st.pop();
//				if(top!='{') return false;
//				break;
//			case ']' : 
//				top=st.pop();
//				if(top!='[') return false;
//				break;
//			case ')' : 
//				top=st.pop();
//				if(top!='(') return false;
//				break;
//			}
//		}
//		return st.isEmpty();
	}

}
