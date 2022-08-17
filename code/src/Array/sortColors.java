package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class sortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0);a.add(1);a.add(2);a.add(0);a.add(1);a.add(2);
		sortColors(a);
	}

	public static void sortColors(ArrayList<Integer> a) {

		HashMap<Integer,Integer> map = new HashMap<>();
		int l=1,j=1,k=1;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==0) {
				map.put(0, l++);
			}else if(a.get(i)==1) {
				map.put(1, j++);
			}else {
				map.put(2,k++);
			}
		}
		
		int temp=0;
		for(int i=0;i<map.get(0);i++) {
			a.set(i, 0);
			temp=i;
		}
		for(int i=temp+1;i<map.get(1);i++) {
			a.set(i, 1);
			temp=i;
		}
		for(int i=temp+1;i<map.get(2);i++) {
			a.set(i, 2);
		}
		
		System.out.println(a);
//		int k=0;
//        for(int i=0;i<a.size();i++){
//            for(int j=i+1;j<a.size();j++){
//                if(a.get(i)>a.get(j)){
//                	int temp=a.get(i);
//                	a.set(i,a.get(j));
//                	a.set(j,temp);
//                    
//                }               
//            }
//        }
//        
//        int ans[] = new int[a.size()];
//        for(int i=0;i<a.size();i++) {
//        	ans[i]=a.get(i);
//        	
//        	System.out.print("[ ");
//        	System.out.print(a.get(i)+" ");
//        	System.out.print(" ]");
//        	
//        }
//        System.out.println(Arrays.toString(ans));
	}

	private static void swap(Integer integer, Integer integer2) {
		int temp = integer;
		integer=integer2;
		integer2=temp;
	}
}
