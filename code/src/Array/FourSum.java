package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {

	}
	
	 public List<List<Integer>> fourSum(int[] nums, int target) {
		
		 ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		 
		if(nums==null || nums.length==0) return res;
		
		int n= nums.length;
		
		Arrays.sort(nums);
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				int remaining = target - nums[i] - nums[j];
				
				int front = j+1;
				int rear = n-1;
				
				while(front<rear) {
					int two_sum = nums[front] + nums[rear];
					
					if(two_sum>remaining) rear--;
					else if(two_sum<remaining) front++;
					else {
						List<Integer> quad = new ArrayList<>();
						quad.add(nums[i]);
						quad.add(nums[j]);
						quad.add(nums[front]);
						quad.add(nums[rear]);
						
						res.add(quad);
						
						while(front<rear && nums[front] == quad.get(2)) ++front;
						
						while(front<rear && nums[rear] == quad.get(3)) --rear;
					}
				}
				 // Processing the duplicates of number 2
                while(j + 1 < n && nums[j + 1] == nums[j]) ++j;
			}

            // Processing the duplicates of number 1
            while (i + 1 < n && nums[i + 1] == nums[i]) ++i;
		}

		return res;      
	  }

}
