package Array;

import java.util.Arrays;

public class first_Missing_Positive {

	public static void main(String[] args) {

		int[]A = {1,2,0};
		int ans = firstMissingPositive(A);
				
	}
	public static int firstMissingPositive(int[] arr) {
//		1. mark element which are out of range and manage presence of one
	 	boolean One = false;
	 	int n= arr.length;
	 	for(int i=0;i<n;i++) {
	 		if(arr[i]==1) 
	 			One=true;
	 		
	 		if(arr[i]<1 || n<arr[i]) {
	 			arr[i]=1;
	 		}
	 	}
		if(!One) return 1;
//		2. Map element with indexs
		for(int i=0;i<n;i++) {
			int index=Math.abs(arr[i]);
			arr[index-1] = -Math.abs(arr[index-1]);
		}
//		3. Find out Missing integer
		for(int i=0;i<n;i++) {
			if(arr[i]>0) return i+1;
			
		}
		return n+1;
    }

}
