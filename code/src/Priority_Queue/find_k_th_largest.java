package Priority_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class find_k_th_largest {

	public static void main(String[] args) {
		int[] nums= {3,2,3,1,2,4,5,5,6};
		int k =4;
		int ans = findKthLargest(nums, k);
		System.out.println(ans);
	}

	public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<k;i++) {
        	pq.offer(nums[i]);
        }
        
        for(int i=k;i<nums.length;i++) {
        	if(nums[i]>pq.peek()) {
        		pq.poll();
        		pq.offer(nums[i]);
        	}
        }
        return pq.peek();
    }
}
