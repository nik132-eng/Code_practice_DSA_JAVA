package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Largest_subarray_with_0_sum {

	public static void main(String[] args) {
		
		
		
	}

	int maxLen(ArrayList<Integer> arr)
    {
		 int n =arr.size();
		  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        int max = 0;
	        int sum = 0; 

	        for(int i = 0;i<n;i++) {

	            sum += arr.get(i); 
	            if(sum == 0) {
	                max = i + 1; 
	            }
	            else {
	                if(map.get(sum) != null) {

	                    max = Math.max(max, i - map.get(sum)); 
	                }
	                else {
	                    map.put(sum, i); 
	                }
	            }
	        }
	        return max; 
    }
}
