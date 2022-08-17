package Array;

import java.util.Arrays;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5,6,7};
		rotate(nums,3);
	}

public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
		reverse(nums,0,n-k-1);
		reverse(nums,n-k,n-1);
		reverse(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }

private static void reverse(int[] nums, int i, int j) {
		while(i<j) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
}

}
