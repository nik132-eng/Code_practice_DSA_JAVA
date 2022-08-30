package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_element {

	public static void main(String[] args) {
		int nums[] = {1,2};
//		int ans = majorityElement(nums);
//		System.out.println(ans);
		
		List<Integer> ans = majorityElement(nums);
		System.out.println(ans);
	}

//	public static int majorityElement(int[] nums) {
//		int ans = 0;
//		HashMap<Integer,Integer> map = new HashMap<>();
//		for(int i=0;i<nums.length;i++) {
//			if(map.containsKey(nums[i])) {
//				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//			}else {
//				map.put(nums[i], 1);
//			}
//		}
//		
////		System.out.println(map);
//		for(int i=0;i<nums.length;i++) {
//			if(map.get(nums[i])>nums.length/2) {
//				System.out.println(map.get(nums[i]));
//				ans = nums[i];
//				break;
//			}
//		}
//
//		return ans;
//	}
	
	public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			}else {
				map.put(nums[i], 1);
			}
		}
//		System.out.println(map);
		for(int i=0;i<nums.length;i++) {
			if(map.get(nums[i])>nums.length/3) {
                if(!ans.contains(nums[i]))
				ans.add(nums[i]);
			}
		}
		return ans;
	}
	

}
