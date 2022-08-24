package Array;

import java.util.ArrayList;

public class Maximun_profit {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(17);
		a.add(20);
		a.add(17);
		a.add(17);
			int ans = maximumProfit(a);
		System.out.println(ans);
		
	}
	
	 public static int maximumProfit(ArrayList<Integer> prices){
	        // Write your code here.
	        int min=prices.get(0);
	        int cur_profit=0;
	        int overall =0;
	        int n=prices.size();
	        for(int i=1;i<n;i++){
	         if(min>prices.get(i)){
	             min=prices.get(i);
	         }
	         cur_profit=prices.get(i)-min;
	         if(overall<cur_profit) {
	        	 overall=cur_profit;
	         }
	        }
	       return overall;
	 }

}
