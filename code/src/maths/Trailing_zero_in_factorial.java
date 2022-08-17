package maths;

public class Trailing_zero_in_factorial {

	public static void main(String[] args) {
		int ans = trailing_zero_in_factorial(125);
		System.out.println(ans);
	}

	private static int trailing_zero_in_factorial(int i) {

		int res=0;
		while(i>0) {
			res +=i/5;
			i/=5;
		}
			
		return res;
	}

}
