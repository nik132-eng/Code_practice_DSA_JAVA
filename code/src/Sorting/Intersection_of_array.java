package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 4,9,5};
		int[] arr2 = { 9,4,9,8,4};

		int[] ans =intersection(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] intersection(int[] arr1, int[] arr2) {

		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0, j = 0;
		int[] a = remove_duplicate(arr1);
		int[] b = remove_duplicate(arr2);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			}
			else if (a[i] > b[j]) {
				j++;
			}
			else {
				ans.add(b[j]);
				j++;
				i++;
			}
		}
		return convertIntegers(ans);
//		System.out.println(ans);
		
		
	}

	public static int[] convertIntegers(List<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    for (int i=0; i < ret.length; i++)
	    {
	        ret[i] = integers.get(i).intValue();
	    }
	    return ret;
	}
	
	private static int[] remove_duplicate(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);  
	    int[] temp = new int[n];
	    int i = 1, j = 1;
	    temp[0] = arr[0];
	    for ( ; i < n ; i++) {
	        if (arr[i] != arr[i-1]) {
	            temp[j++] = arr[i];
	        }
	    }
	    for (i = 0; i < j; i++) {
	        arr[i] = temp[i];
	    }
		return Arrays.copyOfRange(arr, 0, j);
	}

}
