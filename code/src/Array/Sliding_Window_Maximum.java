package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {

		int[] nums = {1,2,3,5,2,12,5,78,5,3};
		int[] ans = maxSlidingWindow(nums, 3);
		ArrayList<Integer> ans_1 = maxslidingWindow(nums, 3);
		
		System.out.println(Arrays.toString(ans));
		System.out.println(ans_1);
		
	}
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
        
		int max=0;
		int l=0;
		int[] ans = new int[nums.length-k];
		
		for(int i=0;i<nums.length-k;i++) {
			max=nums[i];
			for(int j=1;j<k;j++) {
				if(nums[i+j]>max) {
					max=nums[i+j];
				}
			}
			ans[l++]=max;
		}
		
		return ans;
    }
	
	public static ArrayList<Integer> maxslidingWindow(int[] nums,int k){
		
		PriorityQueue<Integer> q = new PriorityQueue<>(
				Collections.reverseOrder());
		
		ArrayList<Integer> res = new ArrayList<>();
		int i=0;
		for(;i<k;i++) 
			q.add(nums[i]);
			
			res.add(q.peek());
			
			q.remove(nums[0]);
			
		for(;i<nums.length-1;i++) {
			q.add(nums[i]);
			
			res.add(q.peek());
			
			q.remove(nums[i-k+1]);
		}
//		int[] arr = res.stream().mapToInt(i -> i).toArray();
		  
		return res;
	}

}
