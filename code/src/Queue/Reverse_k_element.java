package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Reverse_k_element {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		Queue<Integer> ans = reverse(q,3);
		System.out.println(ans);
	}
	
	static Queue<Integer> reverse(Queue<Integer> q,int k){
		if(q.isEmpty() || k<=0 || k>q.size()) return q;
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		for(int i=0;i<k;i++) {
			stack.push(q.poll());
		}
		for(int i=0;i<k;i++) {
			q.add(stack.pop());
		}
		for(int i=0;i<q.size()-k;i++) {
			q.add(q.poll());
		}
		return q;
	}

}
