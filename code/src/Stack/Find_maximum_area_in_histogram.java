package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Find_maximum_area_in_histogram {

	public static void main(String[] args) {
//		int[] a = { 4, 3, 9, 2, 5, 1, 8, 3 };

		int[][] a = {
				{1,1,1,0},
				{1,1,1,1},
				{1,1,1,0},
				{1,0,1,1}
		};
		
//		int ans = maximum_Area_Histogram(a);
//		System.out.println(ans);
		
//		int[] ps = previous_smaller(a);
//		System.out.println(Arrays.toString(ps));
		
//		int[] ns = next_smaller(a);
//		System.out.println(Arrays.toString(ns));

//		int ans = Optimized_maximum_area_Histogram(a);
//		System.out.println(ans);
		
		int ans = maximum_area_submatrix(a);
		System.out.println(ans);
		
	}
	
	private static int maximum_area_submatrix(int[][] a) {
		
		int[] b= new int[a.length];
		
		int max = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i][j]==0)
					b[j]=0;
				else
					b[j]++;
			}
			int cur = Optimized_maximum_area_Histogram(b);
			max=Math.max(max, cur);
		}
		return max;
	}

	private static int[] previous_smaller(int[] a) {
		int[] ans = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {

			while(!stack.isEmpty() && a[stack.peek()]>=a[i]) {
				stack.pop();
			}
			
			if (stack.isEmpty())
				ans[i] = -1;
			else 
				ans[i] = stack.peek();
			
			stack.push(i);
		}
		return ans;
	}


	private static int[] next_smaller(int[] a) {
		int[] ans = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i = a.length-1; i >=0; i--) {
			int e=a[i];
			while(!stack.isEmpty() && a[stack.peek()]>=e) {
				stack.pop();
			}
			
			if (stack.isEmpty())
				ans[i] = a.length;
			else 
				ans[i] = stack.peek();

			
			stack.push(i);
		}
		return ans;
	}

	private static int Optimized_maximum_area_Histogram(int[] a) {
		int[] ns = next_smaller(a);
		int[] ps = previous_smaller(a);
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			int width = ns[i] - ps[i] -1;
			int curArea = width * a[i];
			max = Math.max(max, curArea);
		}
 		return max;
	}
	
	private static int maximum_Area_Histogram(int[] a) {
		int n = a.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int l = i, r = i;
			while (l >= 0 && a[l] >= a[i])
				l--;
			while (r < n && a[r] >= a[i])
				r++;

			int width = r - l - 1;
			int currArea = width * a[i];
			max = Math.max(max, currArea);
		}

		return max;
	}

}
