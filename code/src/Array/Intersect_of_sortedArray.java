package Array;

import java.util.Arrays;

public class Intersect_of_sortedArray {

	public static void main(String[] args) {

		int[] A = {1,3,4,5,6,7};
		int[] B = {1,4,7};
		
		int ans[] = intersect(A, B);
	
		System.out.println(Arrays.toString(ans));
	}
	
	 public static int[] intersect(final int[] A, final int[] B) {
		    
		    int n=A.length;
		    int m=B.length;
		    int[] ans = new int[Math.min(n, m)];
		    
		    int k=0;
		    int i=0,j=0;
		    while(i<=n-1 && j<=m-1) {
		    	if(A[i]<B[j]) {
		    		i++;
		    	}
		    	if(A[i]>B[j]) {
		    		j++;
		    	}
		    	if(A[i]==B[j]) {
		    		ans[k++]=A[i++];
		    		j++;
		    	}
		    }
		    
		 
		    return ans;
		    }

}
