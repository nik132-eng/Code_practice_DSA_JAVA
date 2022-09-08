package Contest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int nums[] = { 3, 5, 6, 2, 4, 7, 8 };
//		int k = 3;
//		int ans = maxKSubarraySum(nums, k);
//		System.out.println(ans);

//		boolean ans= ispalindrom("abccba");
//		System.out.println(ans);

//		String ans = count_vowel_consonants("HellO");
//		System.out.println(ans);

//		boolean ans = checkBrackets("{}helloworld<kem()");
//		System.out.println(ans);

//		String testString = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//		findMostRepeatedWord(testString);
//
//		System.out.println();
//		String testString2 = "Penguins are aquatic, flightless birds that are highly adapted to life in the water. Their distinct tuxedo-like appearance is called countershading, a form of camouflage that helps keep them safe in the water. Penguins do have wing-bones, though they are flipper-like and extremely suited to swimming. Penguins are found almost exclusively in the southern hemisphere, where they catch their food underwater and raise their young on land.";
//		findMostRepeatedWord(testString2);
//
//		System.out.println();
//		String testString3 = "Students seek relief from rising prices through the purchase of used copies of textbooks, which tend to be less expensive. Most college bookstores offer used copies of textbooks at lower prices. Most bookstores will also buy used copies back from students at the end of a term if the book is going to be re-used at the school. Books that are not being re-used at the school are often purchased by an off-campus wholesaler for 0-30% of the new cost, for distribution to other bookstores where the books will be sold. Textbook companies have countered this by encouraging faculty to assign homework that must be done on the publisher's website. If a student has a new textbook, then he or she can use the pass code in the book to register on the site. If the student has purchased a used textbook, then he or she must pay money directly to the publisher in order to access the website and complete assigned homework. ";
//		findMostRepeatedWord(testString3);

//		int[][] grid = {{20,8,20,6,16,16,7,16,8,10},{12,15,13,10,20,9,6,18,17,6},{12,4,10,13,20,11,15,5,17,1},{7,10,14,14,16,5,1,7,3,11},{16,2,9,15,9,8,6,1,7,15},{18,15,18,8,12,17,19,7,7,8},{19,11,15,16,1,3,7,4,7,11},{11,6,5,14,12,18,3,20,14,6},{4,4,19,6,17,12,8,8,18,8},{19,15,14,11,11,13,12,6,16,19}};
//		int[][] ans = largestLocal(grid);
//		System.out.println(Arrays.deepToString(ans));

//		TCS MOCK
//		int ans = count_sec(3,4,1);
//		System.out.println(ans);

//		String ans = contains_all_english_alphabet("The four boxing wizard jumps over the Quickly");
//		System.out.println(ans); 
		
//		int[] energy= {1,1,1,1};
//		int[] experince= {1,1,1,50};
//		int initialEnergy=1;
//		int initialExperince=1;
//		
//		int ans = minNumberOfHours(initialEnergy, initialExperince, energy, experince);
//		System.out.println(ans);
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}

//		Scanner sc = new Scanner(System.in);
//		int G = sc.nextInt();
//		int S = sc.nextInt();
//		int A= sc.nextInt();
//		int B = sc.nextInt();
//		
//		long gold_price = G * A;
//		long silver_price = S * B;
//		
//		if(gold_price>=silver_price) {
//			System.out.println("Gold");
//		}else {
//			System.out.println("Silver");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		for(int i=0;i<T;i++) {
//			int N = sc.nextInt();
//			String s = sc.next();
//			System.out.println(rearrangement(N,s));
		
		String s = "zz";
		int[] distance= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		
		System.out.println(checkDistances(s,distance));
		
		}
		
	 	public static boolean checkDistances(String s, int[] distance) {
	     int n=s.length();
	     final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	     int[] temp = new int[26];
	 		for(int i=0;i<n;i++) {
	 			for(int j=i+1;j<n;j++) {
	 				if(s.charAt(i)==s.charAt(j)) {
	 					int k = alphabet.indexOf(s.charAt(i));
	 					temp[s.charAt(i)-'a']=j-i-1;
	 					if(temp[k]==distance[k]) {
	 						continue;
	 					}else return false; 
	 				}
	 			}
	 		}
	 		
//	 		System.out.println(Arrays.toString(temp));
		 return true;
	    }
	
	 private static int rearrangement(int n, String s) {
		 int count=0;
		 for(int i=0;i<n;i++) {
			 if(s.charAt(i)=='1') {
				 count++;
			 }
		 }
		 if(count<n/2) return 1;
		 return 0;
	}

	public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
	        int hours=0;
	        int senergy=0;
	        for(int i=0;i<energy.length;i++) {
	        	senergy+=energy[i];
	        }
//	        System.out.println(senergy);
	        hours=senergy-initialEnergy+1;
//	        System.out.println(hours);
	        int sexperince=initialExperience;
	        int count=0;
	        
	        if(experience.length==1 && sexperince>experience[0]) return hours;
	        
	        for(int i=0;i<experience.length;i++) {
	        	if(experience[i]>=sexperince) {
	        		count=experience[i]-sexperince;
	        	}
	        	sexperince+=experience[i];
//	        	System.out.println(sexperince);
	        }
	        hours=hours+count+1;
		 return hours;
	    }

	private static String contains_all_english_alphabet(String string) {
		Map<Character, Boolean> id = new HashMap<Character, Boolean>(); 
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i=0;i<alphabet.length;i++) {
			id.put(alphabet[i], false);
		}
//		System.out.println(id);
		String s = string.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(id.containsKey(s.charAt(i))) {
				id.remove(s.charAt(i));
//				id.put(s.charAt(i), true);
			}
		}
//		System.out.println(id);
		StringBuilder mapAsString = new StringBuilder("");
	    for (Character key : id.keySet()) {
	        mapAsString.append(key);
	    }
	    
	    if(mapAsString.toString()=="") return "0";
	    
		return mapAsString.toString();
	}

	private static int count_sec(int n1, int n2, int x) {
		if(n1>n2) return -1;		
		int tempn1=x+n1;
		int count=1;
		while(tempn1>n2) {
			count++;
			tempn1+=n1;
			n2+=n2;
		}
		return count;
	}

	public static int[][] largestLocal(int[][] grid) {
		int n = grid.length;
		int[][] ans = new int[n - 2][n - 2];

		for (int k = 0; k < n - 2; k++) {
			for (int l = 0; l < n - 2; l++) {
				int max = 0;
				for(int i=k;i<k+3;i++) {
					for(int j=l;j<l+3;j++) {
						if (grid[i][j] > max)
							max = grid[i][j];
					}
				}
				ans[k][l] = max;
			}
		}

		return ans;
	}
// expected ans : [[20,20,20,20,20,18,18,18],[15,15,20,20,20,18,18,18],[16,15,20,20,20,15,17,17],[18,18,18,17,19,19,19,15],[19,18,18,17,19,19,19,15],[19,18,18,18,19,20,20,20],[19,19,19,18,18,20,20,20],[19,19,19,18,18,20,20,20]]
	
//	[[20,8,20,6,16,16,7,16,8,10],[12,15,13,10,20,9,6,18,17,6],[12,4,10,13,20,11,15,5,17,1],[7,10,14,14,16,5,1,7,3,11],[16,2,9,15,9,8,6,1,7,15],[18,15,18,8,12,17,19,7,7,8],[19,11,15,16,1,3,7,4,7,11],[11,6,5,14,12,18,3,20,14,6],[4,4,19,6,17,12,8,8,18,8],[19,15,14,11,11,13,12,6,16,19]]
	
	
	public static String findMostRepeatedWord(String input) {

		List<String> uncommonWords = convertToUncommonWords(input);

		if (uncommonWords.size() == 0) {
			System.out.println("No unique words in input");
			return "";
		}

		HashMap<String, Integer> wordCountMap = new HashMap();
		for (String word : uncommonWords) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}

		int max = 0;
		String mostRepeatedWord = "";
		for (String key : wordCountMap.keySet()) {
			int currentValue = wordCountMap.get(key);
			if (currentValue > max) {
				mostRepeatedWord = key;
				max = currentValue;
			}
		}

		System.out.println("Most repeated word: " + mostRepeatedWord + "\nRepeated: " + max + " times");
		return mostRepeatedWord;
	}

	public static List<String> convertToUncommonWords(String input) {

		String lowercased = input.toLowerCase().trim();
		String[] words = lowercased.split("[ \\n\\t\\r.,;:!?(){]");

		List commonWords = List.of("the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", "was",
				"were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "they", "at", "be");

		return Arrays.stream(words).filter(word -> !commonWords.contains(word) && word.length() != 0)
				.collect(Collectors.toList());
	}

	private static boolean checkBrackets(String s) {

		Stack<Character> st = new Stack<>();
		Map<Character, Character> map = Map.of(')', '(', '}', '{', '>', '<', ']', '[');

		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);

			if (map.containsValue(curr)) {
				st.push(curr);
				continue;
			}

			if (map.containsKey(curr) && (st.isEmpty() || map.get(curr) != st.pop())) {
				return false;
			}
		}

		return st.isEmpty();

//		Stack<Character> st = new Stack<>();
//		char[] carr = s.toCharArray();
//		int i = 0;
//		while (i < carr.length) {
//			if (carr[i] == '{' || carr[i] == '[' || carr[i] == '(') {
//				st.add(carr[i]);
//			} else if (carr[i] == '}' || carr[i] == ']' || carr[i] == ')') {
//				if (!st.isEmpty()) {
//					if (st.peek() == '{' || st.peek() == '[' || st.peek() == '(') {
//						st.pop();
//					}
//				}
//			}
//			i++;
//		}
//
//		return st.isEmpty();
	}

	private static String count_vowel_consonants(String s) {

		String vowels = "aeiou";
		String normalized = s.toLowerCase().trim();

		List<Integer> letters = normalized.chars().filter(Character::isAlphabetic).boxed().collect(Collectors.toList());

		long vowellsCount = letters.stream().filter(c -> vowels.indexOf(c) != -1).count();

		long consonantCount = letters.stream().count() - vowellsCount;

		return "There are " + vowellsCount + " vowel count and " + consonantCount + " Consonant count";

//		int vowel=0;
//		int consonants=0;
//		String string = s.toLowerCase().trim();
//		for(int i=0;i<string.length();i++) {
//			if(string.charAt(i)=='a'||string.charAt(i)=='e' ||string.charAt(i)=='i'|| string.charAt(i)=='o'||string.charAt(i)=='u') vowel++;
//			else consonants++;
//		}
//		
//		return vowel+" vowels "+ ", "+consonants+" consonants";
	}

	private static boolean ispalindrom(String s) {

		String normalized = s.toLowerCase();
		return IntStream.range(0, normalized.length() / 2)
				.allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length() - i - 1));

//		int i=0;
//		int j=s.length()-1;
//		
//		while(i<=j) {
//			if(s.charAt(i)!=s.charAt(j)) {
//				return false;
//			}
//			i++;
//			j--;
//		}
//		return true;
	}

	static int maxKSubarraySum(int[] A, int k) {

		int ans = 0;

//		first window of array
		for (int i = 0; i < k; i++) {
			ans += A[i];
		}

		int temp = ans;
//		try to get other windows by adding the after k value and removing first element

		for (int i = k; i < A.length; i++) {
			temp += A[i] - A[i - k];
			ans = Math.max(ans, temp);
		}

		return ans;
	}

}
