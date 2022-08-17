package Binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary_search_problem {

	public static void main(String[] args) {

//		int[] a = {6,5,10,9,2,4,9,5};
//		int k = 13;	
//		woodCutting(a,k);

//		int[] a = { 31, 14, 19, 75 };
//		int stu = 12;
//		bookAllocation(a, stu);

//		int[] a = { 1, 2, 4, 8, 9 };
//		int ans = aggressiveCow(a, 3);
//		System.out.println(ans);

//		int[] nums = {1,3,5,6};
//		int target =7;
//		int ans= searchInsert(nums,target);
//		System.out.println(ans);

//		[-2,0,10,-19,4,6,-8]
//		int[] arr = {-2,0,10,-19,4,6,-8};
//		boolean ans = checkIfExist(arr);
//		System.out.println(ans);

//		Painter partition problem
//		int[] C= {1000000,1000000};
//		int A=1;
//		int B=1000000;
//		int ans = paint(A,B,C);
//		System.out.println(ans);

		final List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(4);
		a.add(5);
		
		final List<Integer> b = new ArrayList<>();

		b.add(2);
		b.add(3);
		
		double ans = findMedianSortedArrays(a, b);
		System.out.println(ans);
	}

	private static double findMedianSortedArrays(List<Integer> a, List<Integer> b) {

		int n1 = a.size();
		int n2 = b.size();

		if (n1 > n2)
			return findMedianSortedArrays(b, a);

		int l = 0;
		int r = n1;
		while (l <= r) {
			int m1 = l + (r - l) / 2;
			int m2 = (n1 + n2 + 1) / 2 - m1;
//			[0.....m1-1] left of a1 , [m1.....n1-1] right of a2
//			[0.....m2-1] left of b1 , [m2.....n2-1] right of b2

			int max1 = m1==0 ? Integer.MIN_VALUE: a.get(m1 - 1);
			int min1 = m1==n1 ? Integer.MAX_VALUE: a.get(m1);

			int max2 = m2==0 ? Integer.MIN_VALUE: b.get(m2 - 1);
			int min2 = m2==n2 ? Integer.MAX_VALUE: b.get(m2);

			if (max1 <= min2 && max2 <= min1 ) {
				if((n1+n2)%2 == 0) {
					return (double)(((Math.max(max2, max1))+(Math.min(min1, min2)))/2.0);
				}else {
					return Math.max(max2, max1);
				}
			}else if(max2>min1){
				l=m1+1;
			}else {
				r=m1-1;
			}
		}
		return 0.0;
	}

	static int M = 10000003;

	private static int paint(int a, int b, int[] c) {
		long s = 0, e = (long) Long.MAX_VALUE;
		int ans = 0;
		while (s <= e) {
			long m = s + (e - s) / 2;
			if (issafe((long) a, (long) b, c, m)) {
				ans = (int) m;
				e = m - 1;
			} else
				s = m + 1;
		}

		return ans % M;
	}

	private static boolean issafe(long a, long b, int[] c, long m) {
		int k = 1;
		long cur = 0;
		for (int e : c) {
			if (b * (long) e > m)
				return false;
			cur = cur + (b * (long) e);
			if (cur > m) {
				k++;
				cur = (b * (long) e);
			}
		}
		if (cur <= m && k <= a)
			return true;
		return false;
	}

	private static boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i] * 2;
			System.out.println(temp);
			if (find_ele_in_arr(arr, temp)) {
				return true;
			}
		}
		return false;
	}

	private static boolean find_ele_in_arr(int[] arr, int k) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
//			System.out.println(l+" "+r+" "+mid);
			if (arr[mid] == k)
				return true;
			else if (arr[mid] < k)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return false;
	}

	private static int searchInsert(int[] nums, int target) {
		if (target > nums[nums.length - 1])
			return nums.length;
		int l = 0;
		int r = nums.length - 1;
		int ans = 0;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] < target) {
				l = mid + 1;
			} else {
				ans = mid;
				r = mid - 1;
			}
		}

		return ans;
	}

	private static int aggressiveCow(int[] a, int k) {
		if (a.length < k)
			return -1;
		int ans = 0;
		int l = 1;
		int r = a[a.length - 1];
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (canAccomadate(a, k, mid)) {
				ans = mid;
				l = mid + 1;
			} else
				r = mid - 1;
		}

		return ans;
	}

	private static boolean canAccomadate(int[] a, int k, int mid) {
		int count = 1;
		int prev = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] - prev >= mid) {
				count++;
				prev = a[i];
			}
		}
		return count >= k;
	}

	private static void bookAllocation(int[] a, int stu) {
		if (stu > a.length - 1)
			System.out.println(-1);

		int l = maxof(a);
		int r = 0;
		for (int e : a) {
			r += e;
		}
		int ans = -1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (iscorrect(a, stu, mid)) {
				System.out.println(l + " " + r + " " + mid);
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(ans);
	}

	private static int maxof(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	private static boolean iscorrect(int[] a, int stu, int mid) {

		int count = 1;
		int valid = 0;

		for (int i = 0; i < a.length; i++) {

			if (valid + a[i] > mid) {
				count += 1;
				valid = a[i];
				if (valid > mid)
					return false;
			} else {
				valid += a[i];
			}
		}

		return count <= stu;
	}

	private static void woodCutting(int[] a, int k) {

		int l = 0;
		int r = -1;
		for (int e : a) {
			if (e >= r)
				r = e;
		}
		int ans = 0;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			System.out.println(l + " " + r + " " + mid);
			if (isenogh(a, k, mid)) {
				ans = mid;
				l = mid + 1;
			} else
				r = mid - 1;
		}
		System.out.println(ans);
	}

	private static boolean isenogh(int[] a, int k, int mid) {

		int total = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > mid) {
				int temp = a[i] - mid;
				total += temp;
			}
		}

		return total >= k;
	}

}
