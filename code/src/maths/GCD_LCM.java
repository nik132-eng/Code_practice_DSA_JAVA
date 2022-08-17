package maths;

public class GCD_LCM {

	public static void main(String[] args) {

//		int ans = gcd(35,25);
//		System.out.println(ans);
		
		int ans  = lcm(24,36);
		System.out.println(ans);
		
	}

	private static int lcm(int i, int j) {
			
		return i*j/gcd(i,j);
	}

	private static int gcd(int i, int j) {
		
		if(j==0) {
			return i;
		}
		
		if(i<j) return gcd(j,i);
		
		return gcd(j,i%j);
	}

}
