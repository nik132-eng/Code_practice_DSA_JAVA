package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Permutation_in_string {

	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidbaooo"));
	}

	public static boolean checkInclusion(String s1, String s2) {
		int s1len= s1.length();
		int s2len= s2.length();
		
		if(s1len>s2len) return false;
		
		int[] arr1= new int[26];
		int[] arr2= new int[26];
		
		for(int i=0;i<s1len;i++) {
			arr1[s1.charAt(i)-'0']++;
			arr2[s2.charAt(i)-'0']++;
		}
		
		for(int i=s1len;i<s2len;i++) {
			if(Arrays.equals(arr1, arr2)) { return true; }
			
			arr2[s2.charAt(i-s1len)-'a']--;
			arr2[s2.charAt(i)-'a']++;
		}
		if(Arrays.equals(arr1, arr2)) return true;
		else return false;
	}

}
