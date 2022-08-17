package Hashing;

import java.util.*;
import java.util.Map.Entry;

public class Hashing_basics {

	public static void main(String[] args) {

//		int[] a= {1,1,2,2,2,3,4,4,2,1,78,4};
//		count_Distict_ele(a);

//		frequency_of_ele_in_array(a);

//		int[] a= {5,2,3,1,2,-1};
//		int sum=8;
//		pair_with_given_sum(a,sum);

//		int[] a = {1,2,3,-2,-1,6};
//		
//		System.out.println(Zero_sum_subarray(a));

//		int[] a = {1,1,1};
//		int k=2;
//		int ans = subarraySum(a,k);
//		System.out.println(ans);

//		int[] nums = { 1, 0, 2, 1 };
//		int k = 3;
//		boolean ans = containsNearbyDuplicate(nums, k);
//		System.out.println(ans);
		
//		int[] nums = {0};
//		int[] ans = numberOfPairs(nums);
//		System.out.println(Arrays.toString(ans));

//		int[] nums = {1,1,1,2,2,2,3};
//		int[] ans = frequencySort(nums);
//		System.out.println(Arrays.toString(ans));
	}

	private static int[] frequencySort(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int cur = nums[i];
			if (map.containsKey(cur)) {
				map.put(cur, map.getOrDefault(cur, 0) + 1);
			}
			else
				map.put(cur, 1);
		}
//		System.out.println(map);
		
		List<Integer> list = new ArrayList<Integer>(map.keySet());
		
		Collections.sort(list,(a,b) -> {
			if(map.get(a)==map.get(b)) {
				return b-a;
			}else {
				return map.get(a) - map.get(b);
			}
		});
		
		int[] res = new int[nums.length];
		int i=0;
		for(int num:list) {
			for(int j=0;j<map.get(num);j++) {
				res[i++]=num;
			}
		}
		return res;
		
		
//      Set<Entry<Integer,Integer>> entryset = map.entrySet();
//      List<Entry<Integer,Integer>> list = new ArrayList<>(entryset);
//      Collections.sort(list,(o1,o2)-> o1.getValue().compareTo(o2.getValue()));
////      System.out.println(list);
//
////      System.out.println(list.get(0));
//      System.out.println(list.get(1).getValue().equals(list.get(2).getValue()));
////      System.out.println(list.get(2));
//      
//      int[] a = new int[nums.length];
//      for(int i=1;i<nums.length;i++) {
//    	  if(list.get(i).getValue()==list.get(i-1).getValue()) {
//    		  if(list.get(i).getKey() > list.get(i-1).getKey()) {
//    			  a[i]=list.get(i).getKey();
//    		  }
//    	  }else a[i]=list.get(i).getKey();
//      }
//		return a;
	}

	private static int[] numberOfPairs(int[] nums) {
		int count=0;
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				count++;
				set.remove(nums[i]);
			}else {
				set.add(nums[i]);
			}
		}
		int ans[] = new int[2];
		ans[0]=count;
		ans[1]=set.size();
		return ans;
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int cur = nums[i];
			if (map.containsKey(cur) && i - map.get(cur) <= k) {
				return true;
			} else
				map.put(cur, i);
		}
		return false;
	}

	private static int subarraySum(int[] a, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int temp = 0;
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			temp += a[i];
			if (map.containsKey(temp - k)) {
				ans += map.get(temp - k);
			}
			map.put(temp, map.getOrDefault(temp, 0) + 1);
		}
		return ans;
	}

	private static boolean Zero_sum_subarray(int[] a) {

		Set<Integer> set = new HashSet<>();
		int cs = 0;
		set.add(0);
		for (int e : a) {
			cs += e;
			if (set.contains(cs))
				return true;
			set.add(cs);
		}
		return false;
	}

	private static void pair_with_given_sum(int[] a, int sum) {

		Set<Integer> set = new HashSet<>();
		Set<Integer> ans = new HashSet<>();
		for (int e : a) {
			int com = sum - e;
			if (set.contains(com)) {
				ans.add(e);
				ans.add(com);
			}
			set.add(e);
		}
		System.out.println(ans);
	}

	private static void frequency_of_ele_in_array(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int e : a) {
			if (map.containsKey(e)) {
				int temp = map.get(e);
				map.put(e, temp + 1);
			} else {
				map.put(e, 1);
			}
			System.out.println(e + " " + map);
		}

		System.out.println(map);

	}

	private static void count_Distict_ele(int[] a) {

		Set<Integer> set = new HashSet<>();
		for (int e : a) {
			set.add(e);
		}
		System.out.println(set.size());
	}

}
