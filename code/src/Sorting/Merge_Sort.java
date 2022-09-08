package Sorting;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int mergeSort(int arr[],int temp[], int left,int right) {
		int mid,inv_count =0;
		if(right>left) {
			mid = (right+left)/2;
			
			inv_count += mergeSort(arr, temp, left, mid);
			inv_count += mergeSort(arr, temp, mid+1, right);
			
			inv_count += merge(arr, temp, left, mid+1, right);		
		}
		return inv_count;
	}

	private int merge(int[] arr, int[] temp, int left, int mid, int right) {
		int inv_count = 0;
		int i=left;
		int j=mid;
		int k= left;
		
		while((i <= mid-1 ) && (j<=right)) {
			if(arr[i] <= arr[j]) {
				
			}else {
				temp[k++] = arr[j++];
				inv_count = inv_count +(mid-i);
			}
		}
		 while(i <= mid - 1)
		        temp[k++] = arr[i++];

		    while(j <= right)
		        temp[k++] = arr[j++];

		    for(i = left ; i <= right ; i++)
		        arr[i] = temp[i];
		    
		    return inv_count;
	}

}
