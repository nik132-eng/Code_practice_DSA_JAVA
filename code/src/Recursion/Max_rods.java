package Recursion;

import java.util.Arrays;

public class Max_rods {

	public static void main(String[] args) {

		int N=25;
		int a=15;
		int b=6;
		int c=7;
		
		int dp[]=new int[N+1];
		Arrays.fill(dp, -2);
		
		
		int ans = max_rod(N,a,b,c,dp);
		
		System.out.println(ans);
	
		for(int i=0;i<=N;i++) {
			System.out.println(i+" "+dp[i]);
		}
	}

	private static int max_rod(int N, int a, int b, int c, int[] dp) {

		if(N==0) return dp[N]=0;
		if(N<0) return -1;
		
		if(dp[N]!=-2) return dp[N];

		int cutA = max_rod(N-a, a, b, c, dp);
		int cutB = max_rod(N-b, a, b, c, dp);
		int cutC = max_rod(N-c, a, b, c, dp);
		
		int res = Math.max(cutA, Math.max(cutB, cutC));
		
		if(res==-1) return dp[N]=-1;
		
		return dp[N]=res+1;
	}

}
