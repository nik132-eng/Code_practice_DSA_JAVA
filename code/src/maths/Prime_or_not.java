package maths;

import java.util.Arrays;

public class Prime_or_not {

	public static void main(String[] args) {
//		System.out.println(isprime(10));
//		
//		System.out.println(isPrime_efficiant(90));
		
//		divisor(25);
		
//		divisor_in_ordered(25);
		
//		printUntillNprime(30);
		
		sieve_of_erathosthenes(30);
		
	}


	private static void sieve_of_erathosthenes(int n) {
		boolean[] prime=new boolean[n+1];
		Arrays.fill(prime, true);
		
		for(int i=2;i*i<=n;i++) {
			if(prime[i]) {
				for(int j=2*i;j<=n;j+=i) {
					prime[j]=false;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(prime[i]) System.out.println(i);
		}
		
	}

	private static void printUntillNprime(int n) {
		for(int i=1;i<n;i++) {
			if(isPrime_efficiant(i)) System.out.println(i);
		}
	}

	private static void divisor_in_ordered(int n) {
		int i=1;
		for(;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			} 
		}
		i--;
		for(;i>=1;i--) {
			if(n%i==0) {
				if(n/i!=i) System.out.println(n/i);				
			}
		}
		
		
	}

	private static void divisor(int n) {
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				if(n/i!=i) System.out.println(n/i);
			} 
		}
		
	}

	private static boolean isPrime_efficiant(int n) {
		if(n==1) return false;
		if(n==2 || n==3) return true;
		if(n%2==0 || n%3==0) return false;
		
		for(int i=5;i*i<n;i+=6) {
			if(n%i==0 || n%(i+2)==0) return false;
		}
		return true;
	}

	private static boolean isprime(int n) {
		if(n==1) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
