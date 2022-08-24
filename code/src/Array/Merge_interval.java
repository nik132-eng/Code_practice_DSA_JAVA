package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_interval {

	public static void main(String[] args) {
		int[][] intervals = {{1,3},
								{2,6},
								{8,10},
								{15,18}};
		int[][] ans = merge(intervals);
	}

	public static int[][] merge(int[][] a) {
		List<int[]> res = new ArrayList<>();
		
		if(a.length==0 || a == null) {
			return res.toArray(new int[0][]);
		}
		
		Arrays.sort(a,(c,b)->c[0]-b[0]);
		
		int start = a[0][0];
		int end = a[0][1];
		
		for(int[] i: a) {
			if(i[0]<=end) {
				end=Math.max(end, i[1]);
			}else {
				res.add(new int[] {start,end});
				start=i[0];
				end=i[1];
			}
		}
		res.add(new int[] {start,end});
		return res.toArray(new int[0][]);
    }

}
