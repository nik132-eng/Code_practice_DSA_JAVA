package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordBreak {

	public static void main(String[] args) {
		String s = "leetcode";
		List<String> wordDict = new ArrayList<>(); 
		wordDict.add("leet");
		wordDict.add("code");
		boolean ans = wordBreak(s,wordDict);
	}
	
	 public static boolean wordBreak(String s, List<String> wordDict) {
		 
		 Map<String,Boolean> map = new HashMap();
		 
		 if(wordDict.contains(s))
			 return true;
		 if(map.containsKey(s))
			 return map.get(s);
		 for(int i=1;i<=s.length();i++) {
			 String left = s.substring(0,i);
			 if(wordDict.contains(left) ){
				 map.put(s, true);
				 return true;
			 }
		 }
		 map.put(s, false);
		 return false;
//		 for(int i=0;i<wordDict.size();i++) {
//			 if(!s.contains(wordDict.get(i))) {
//				 return false;
//			 }else {
//				 
//			 }
//		 }
//		 return true;
	 }

}
