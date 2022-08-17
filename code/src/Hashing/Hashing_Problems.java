package Hashing;

import java.util.*;

public class Hashing_Problems {

	public static void main(String[] args) {
//		int[] arr = {1,1,5,-3,-4,3,4,1};
//		int ans = largestSubArray_with_zero_sum(arr);
//		System.out.println(ans);

//		int[] nums = { 5,0,0,0 };
//		int k = 3;
//		boolean ans = checkSubarraySum(nums, k);
//		System.out.println(ans);

//		int[] a = {1,2,1,2,3,4,5,6,7,8,9,10};
//		int ans = longest_Consutative_subsequence(a);
//		System.out.println(ans);

		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
		int ans = longest_Harmonious_Subsequence(nums);
		System.out.println(ans);
	}

	private static int longest_Harmonious_Subsequence(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();

		for (int i:nums)
			map.put(i,map.getOrDefault(i, 0)+1);
		
		int ans = 0;
		for(int i:map.keySet()) {
			if(map.containsKey(i+1)) {
				ans = Math.max(ans,map.get(i)+map.get(i+1));				
			}
		}		
		return ans;
	}

	private static int longest_Consutative_subsequence(int[] a) {
		int ans = 1;
		Set<Integer> set = new HashSet<>();

		for (int e : a)
			set.add(e);

		for (int e : set) {
			if (!set.contains(e - 1)) {
				int len = 1;
				while (set.contains(++e)) {
					len++;
				}
				ans = Math.max(ans, len);
			}
		}
		return ans;
	}

	private static boolean checkSubarraySum(int[] nums, int k) {
		if (nums == null || nums.length < 2) {
			return false;
		}

		int[] preSum = new int[nums.length];
		preSum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			preSum[i] = nums[i] + preSum[i - 1];
		}

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		for (int i = 0; i < preSum.length; i++) {

			int rem = preSum[i];

			if (k != 0) {
				rem = preSum[i] % k;
			}
			if (nums[i] % k == 0 && i > 0) {
				if (rem == 0 || nums[i - 1] == 0)
					return true;
			}
			if (map.containsKey(rem) && (i - map.get(rem)) > 1) {
				return true;
			} else
				map.put(rem, i);
		}
		return false;
	}

	private static int largestSubArray_with_zero_sum(int[] arr) {
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int cur = 0;
		for (int i = 0; i < arr.length; i++) {
			cur += arr[i];
//			System.out.println(cur);
//			System.out.println(map);
			if (map.containsKey(cur)) {
				int prev = map.get(cur);
				ans = Math.max(ans, i - prev);
			} else {
				map.put(cur, i);
			}
		}
		return ans;
	}

}
