package BitManupulation;

import java.util.Arrays;

public class Bit_flipping {

	public static void main(String[] args) {

//		int ans = bit_fliping(7);
		
		int[] a= {1,2,3};
		int[] ans = decode(a,1);
		System.out.println(Arrays.toString(ans));
	}

	private static int bit_fliping(int A) {
		 String a = Integer.toBinaryString(A);
		 System.out.println(a);
		return 0;
	}
	
	 public static int[] decode(int[] encoded, int first) {
	        int[] ans = new int[encoded.length+1];
	        ans[0]=first;
	        for(int i=1;i<encoded.length+1;i++){
	            int temp=encoded[i-1];
	            ans[i]=ans[i-1]^temp;
	        }
	        return ans;
	    }

}
