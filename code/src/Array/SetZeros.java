package Array;

import java.util.Arrays;

public class SetZeros {

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		setZeroes(a);
	}

	public static void setZeroes(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;

		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = matrix[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int num = matrix[i][j];
				if (num == 0) {
					int row = i;
					int col = j;
					
					for (int a = 0; a < n; a++) {
						arr[a][col] = 0;
					}

					for (int a = 0; a < m; a++) {
						arr[row][a] = 0;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = arr[i][j];
			}
		}
		System.out.println(Arrays.deepToString(matrix));

//		
//		int m=a.length;
//		int n=a[0].length;
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				if(a[i][j]==0) {
//					rowzero(i,a);
//					colzero(j,a);
//				}
//			}
//		}
//		
//		System.out.println(Arrays.deepToString(a));
//	}
//
//	private static void colzero(int j, int[][] a) {
//		int m=a[0].length;
//		for(int i=0;i<m;i++) {
//			a[i][j]=0;
//		}
//	}
//
//	private static void rowzero(int i, int[][] a) {
//		int n=a.length;
//		for(int j=0;j<n;j++) {
//			a[i][j]=0;
//		}
	}

}
