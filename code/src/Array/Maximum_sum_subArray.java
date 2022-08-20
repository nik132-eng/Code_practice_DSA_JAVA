package Array;

public class Maximum_sum_subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		long ans = maxSubarraySum(arr, 9);
		System.out.println(ans);
	}

	public static long maxSubarraySum(int[] arr, int n) {
		long cursum=0;
		long maxsum=0;
		
		for(int i=0;i<n;i++) {
			cursum+=arr[i];
			if(cursum>=maxsum) {
				maxsum=cursum;
			}
			if(cursum<0) {
				cursum=0;
				continue;
			}
		}
		return maxsum;
	}
}
