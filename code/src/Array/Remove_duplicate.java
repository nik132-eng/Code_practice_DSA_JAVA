package Array;

import java.util.ArrayList;

public class Remove_duplicate {

	public static void main(String[] args) {

	ArrayList<Integer> a = new ArrayList<>();
	a.add(5000);
	a.add(5000);
	a.add(5000);
	int ans = removeDuplicates(a);
	System.out.println(ans);
	}
	
	public static int removeDuplicates(ArrayList<Integer> a) {
		 int count=1;
	       if(a.size()==1) return 1;
	       if(a.size()<1) return 0;
	       int k=1;
	       a.set(0,a.get(0));
	        for(int i=1;i<a.size();i++) {
	        	if(!a.get(i).equals(a.get(i-1))) {
	                a.set(k++,a.get(i));
	        	}
	        }
	        return k;

	}

}
