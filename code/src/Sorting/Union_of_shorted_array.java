package Sorting;

import java.util.*;

public class Union_of_shorted_array {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 2, 3, 4, 5, 5 };
		int[] arr2 = { 2, 3, 5, 6, 7 };

//		int ans[] = new int[arr1.length+arr2.length];

		union_of_sorted_array(arr1, arr2);

	}

	private static void union_of_sorted_array(int[] arr1, int[] arr2) {
//		ArrayList ans = new ArrayList(); 
		ArrayList<Integer> ans = new ArrayList<Integer>();

		int i = 0, j = 0;

//		remove duplicates from arry
		int[] a = remove_duplicate(arr1);
		int[] b = remove_duplicate(arr2);

//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));

		

//		if a[i] < b[j] print[i] i++

//		if a[i] > b[j] print[j] j++
		
//		if a[i] = b[j] i++ j++
		
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
//				System.out.print(a[i]+" ");
				ans.add(a[i]);
				i++;
			}
			else if (a[i] > b[j]) {
//				System.out.print(b[j]+" ");
				ans.add(b[j]);
				j++;
			}
			else {
//				System.out.print(a[i]+" ");
				ans.add(b[j]);
				j++;
				i++;
			}
		}
		
		while (i < a.length) {
			ans.add(a[i]);
//            System.out.print(a[i++] + " ");
			i++;
		}
		while (j < b.length) {
			ans.add(b[j]);
			j++;
//            System.out.print(b[j++] + " ");	
		}
		
		System.out.println(ans);
		
		
		for (int k = 0; k < ans.size(); k++) 
            System.out.print(ans.get(k) + " "); 
}

	private static int[] remove_duplicate(int[] arr) {
		int n = arr.length;

		int j = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[++j] = arr[i];
			}
		}
		return Arrays.copyOfRange(arr, 0, j);
	}

}
