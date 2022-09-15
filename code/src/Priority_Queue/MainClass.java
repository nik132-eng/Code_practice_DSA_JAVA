package Priority_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(5);
		pq.offer(10);
		pq.offer(12);
		pq.offer(8);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}

}
