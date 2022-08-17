package Recursion;

public class Subset_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {3,34,4,12,5,2};

		int sum = 6;
		
		System.out.println(subset_sum(sum,arr,arr.length-1));
	}

	private static boolean subset_sum(int sum, int[] arr, int length) {
		
		if(sum<0) return false;
		if(length<0) return false;
		
		if(sum==0) return true;
		
		
		return subset_sum(sum-arr[length], arr, length-1) || subset_sum(sum, arr, length-1);
	}

}
