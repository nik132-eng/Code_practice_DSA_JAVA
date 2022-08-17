package Array;

import java.util.Arrays;

public class Move_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0,1,0,3,12};
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
		int[] ans = new int[nums.length];
		int k = 0;
		int n = nums.length;
		int i = 0;
		while (i < n ) {
			if(nums[i]==0) {
				i++;
			}else {
				ans[k++]=nums[i];
				i++;
			}
		}
		
		while(k<=i && k<n) {
			ans[k++]=0;
		}
		
		for(int l=0;l<n;l++) {
			nums[l]=ans[l];
		}
			
		System.out.println(Arrays.toString(ans));
	}
}
