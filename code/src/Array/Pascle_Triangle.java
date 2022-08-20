package Array;

import java.util.ArrayList;
import java.util.List;

public class Pascle_Triangle {

	public static void main(String[] args) {

		List<List<Integer>> ans = generate(6);
		System.out.println(ans);
	}

	public static List<List<Integer>> generate(int numRows) {

		ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
		ArrayList<Integer> cur, prev = null;

		for (int i = 0; i < numRows; ++i) {
			cur = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j) {
				if (j == 0 || j == i) {
					cur.add(1);
				} else {
					cur.add(prev.get(j - 1) + prev.get(j));
				}
			}
			prev = cur;
			ans.add(cur);
		}
		return ans;
	}

	private static int prev(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
