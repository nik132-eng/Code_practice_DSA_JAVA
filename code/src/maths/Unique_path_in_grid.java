package maths;

public class Unique_path_in_grid {

	public static void main(String[] args) {

		int ans = unique_path_in_grid(3,4);
		System.out.println(ans);
	}

	private static int unique_path_in_grid(int row, int col) {

		int res=1;
		for(int i=1;i<row;i++) {
			res = (res * (col+i))/i;
		}
		return res;
	}

}
