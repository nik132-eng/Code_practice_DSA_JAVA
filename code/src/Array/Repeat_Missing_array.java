package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Repeat_Missing_array {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 3, 4 };
		int[] ans = repeatedNumber(A);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] repeatedNumber(int[] A) {
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			x ^= A[i];
		}
		int xor = 0;
		for (int i = 1; i < A.length; i++) {
			xor = x ^ i;
		}
		int rsb = xor & -xor;

		int a = 0;
		int b = 0;
		for (int val : A) {
			if ((val & rsb) == 0) {
				a ^= val;
			} else {
				b ^= val;
			}
		}
		for (int i = 1; i <= A.length; i++) {
			if ((i & rsb) == 0) {
				a ^= i;
			} else {
				b ^= i;
			}
		}
		System.out.println(a);
		System.out.println(b);

		int[] ans = new int[2];
		for (int val : A) {
			if (val == a) {
				System.out.println("miss - " + b);
				System.out.println("reap - " + a);
				ans[0] = a;
				ans[1] = b;
				break;
			} else if (val == b) {
				ans[0] = b;
				ans[1] = a;
				System.out.println("miss - " + a);
				System.out.println("reap - " + b);
				break;
			}
		}
		return ans;
	}
}
