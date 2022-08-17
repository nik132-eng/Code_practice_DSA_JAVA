package maths;

public class Palindrom {

	public static void main(String[] args) {

		int num = 121321;
		
		System.out.println(ispalindrom(num));
	}

	private static boolean ispalindrom(int num) {
		int temp = num;
		int rev=0;
		while(temp>0) {
			int ld = temp%10;
			rev = rev * 10 + ld;
			temp/=10;
		}
		
		System.out.println(rev);
		if(num==rev) {
			return true;
		}
		
		return false;
	}
 
}
