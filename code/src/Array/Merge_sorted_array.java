package Array;

import java.util.Arrays;

public class Merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,3,0,0,0};
		int m=3;
		int[] nums2= {2,5,6};
		int n=3;
		merge(nums1, m, nums2, n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
		int j=n-1;
		int k=nums1.length-1;
		
		while(i>=0 && j>=0) {
			
			if(nums1[i]>nums2[j] )
				nums1[k]=nums1[i--];
			else if(nums1[i]!=0)
				nums1[k]=nums2[j--];
			
			k--;
		}
		
		while(j>=0) {
			nums1[k--]=nums2[j--];
		}
		
		System.out.println(Arrays.toString(nums1));
    }

}
