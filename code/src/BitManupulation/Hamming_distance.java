package BitManupulation;

public class Hamming_distance {

	public static void main(String[] args) {

			int nums[] = {4,14,4};
			int ans=totalHammingDistance(nums);
			System.out.println(ans);
	}

	private static int totalHammingDistance(int[] nums) {
		int ans =0;
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
//				System.out.println(nums[i]+" "+nums[j]);
				ans = ans + count_hamming_distance(nums[i],nums[j]);
			}
		}
		return ans;
	}

	private static int count_hamming_distance(int i, int j) {
		int xor = i^j;
		int count=0;
		while(xor>0) {
			if((xor&1)==1) count++;
			xor=xor>>1;
		}
		return count;
	}

}
