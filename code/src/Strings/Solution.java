package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {

//		int ans = romanToInt("");
		
//		int ans = isPalindrome("A man, a plan, a canal: Panama\"");
//		System.out.println(ans);
		
//		String ans = solve("the sky is blue");
//		System.out.println(ans);
		
//		char[] s = {'h','e','l','l','o'};
//		reverseString(s);
			
		
//		reverseWords("Let's take LeetCode contest");
		
		ArrayList<Integer> ans = solve1("interviewbit");
		System.out.println(ans);
	}
	
public static ArrayList<Integer> solve1(String A) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
         for(int i=0;i<A.length();i++){
                if(!map.containsKey(A.charAt(i))){
                	map.put(A.charAt(i),1);                	
                }else {
                	map.put(A.charAt(i),map.getOrDefault(A.charAt(i), 0)+1 );
                }
         }
         
         ArrayList<Integer> ans = new ArrayList<>();
         
         for(Entry<Character, Integer> e : map.entrySet())
         {
             ans.add(e.getValue());
         }
         
         return ans;
         
//         for(int i=0;i<A.length();i++) {
////        	 if(map.containsKey(A.charAt(i)))
//        	 ans.add(map.get(A.charAt(i)));
//         }
////         System.out.println(map.containsKey('i'));
////         System.out.println(map);
//         return ans;
    }
	
	private static void reverseWords(String s) {
		String[] splited = s.split("\\s+");
		for(int i=0;i<splited.length;i++) {
			splited[i]=reverseString_one(splited[i]);
		}
	}

	private static String reverseString_one(String string) {
			
		for(int i=string.length()-1;i>=0;i--) {
		
		}
		
		
			
		return null;
	}

	public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j) {
        char temp =s[i];
 		   s[i]=s[j];
 		   s[j]=temp;
        	i++;
        	j--;
        }
        
        System.out.println(Arrays.toString(s));
        
    }
	
	public static String solve(String A) {
	   
		   String ans = "";
		   int i=A.length()-1;
		   while(i>=0) {
			   while(i>=0 && A.charAt(i)==' ') i--;
			   int j=i;
			   if(i<0) break;
			   while( i>=0 && A.charAt(i)!=' ') i--;

			   if(ans.isEmpty()) {
				   ans=ans.concat(A.substring(i+1, j+1));
			   }else {
				   ans=ans.concat(" "+ A.substring(i+1,j+1));
			   }
			   
		   }
			   
		   return ans;
		   
	   }

	public static int isPalindrome(String s) {
//		st = st.replaceAll("[, : \" \\s+]","");
//		String rev = ""; 
//		for(int i=st.length()-1;i>=0;i--) {
//			rev=rev+st.charAt(i);
//		}
////		System.out.println(rev);
//		if(!st.equalsIgnoreCase(rev)) return 0;
//		return 1;
	
//	Another method ===================================
		 if(s==" ") return 1;
		    s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			int start=0;
			int end=s.length()-1;
			while(start<end)
			{
				if(s.charAt(start++)!=s.charAt(end--))
						return 0;
			}
		        return 1;
	}
	
	public static int romanToInt(String s) {
		 int n=s.length();
	        int sum=0;

	            for(int i=0;i<n;i++){
	                if(s.charAt(i)=='I'){sum=sum+1;}
	                else if(s.charAt(i)=='V'){sum=sum+5;}
	                else if(s.charAt(i)=='X'){sum=sum+10;}
	                else if(s.charAt(i)=='L'){sum=sum+50;}
	                else if(s.charAt(i)=='C'){sum=sum+100;}
	                else if(s.charAt(i)=='D'){sum=sum+500;}
	                else {sum=sum+1000;}             
	           }
	             if (s.contains("IV") || s.contains("IX")) { sum -= 2; }
	    if (s.contains("XL") || s.contains("XC")) { sum -= 20; }
	    if (s.contains("CM") || s.contains("CD")) { sum -= 200; }
	    
	        
	        return sum;
	}
}
