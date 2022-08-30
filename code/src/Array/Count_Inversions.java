package Array;

public class Count_Inversions {

	public static void main(String[] args) {
		long[] arr = { 2, 5, 1, 3, 4 };
		long ans = getInversions(arr, 5);
		System.out.println(ans);
	}

	public static long getInversions(long arr[], int n) {

		long count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)
				if (arr[i] > arr[j]) {
					count++;
				}
		}
		return count;
	}
}
