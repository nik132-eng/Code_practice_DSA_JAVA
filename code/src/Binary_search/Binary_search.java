package Binary_search;

public class Binary_search {

	public static void main(String[] args) {

//		int[] a= {1,2,2,2,3,3,3,3,3,4,5,6,7,8};

//		int[] a = { 4, 5, 6, 7, 8, 1, 2, 3 };
		
		int[] a= {1,2,3,4,9};
		int key = 9;
		
//		boolean ans = binary_search(a,key);

//		int ans_left_occ = left_occurance(a,key);

//		int ans_right_occ = right_occurance(a,key);

//		int ans_len = total_length_of_occuring_number(a,key);

//		int ans = sorted_and_rotated_array(a, key);
		
//		boolean ans = array_is_sorted_rotated(a);
		
//		int ans = sorted_array_search_infinite(a,key);
		
//		int ans = sqrt_of_num_binary_search(37);
//		System.out.println(ans);
		
		int ans = upper_bound(a,key);

//		String[] a= {"apple","app","apply","ape"};
//	
//		String ans = commonPrefix(a,0,a.length-1);
//		System.out.println(ans);
		
//		int ans = pow(-1,1,20);
		System.out.println(ans);
	}
	
	public static int pow(int x, int n, int d) {
		double ans=1.0;
		long nn=n;
		long temp = x % d;
		if(nn<0) nn=-1*nn;
		while(nn!=0) {
			if(nn%2==1) {
				ans=(ans*temp)%d;
				nn=nn-1;
			}else {
				x*=temp;
				nn/=2;
			}
		}
		if(n<0) ans = (double)(1.0)/(double)(ans);
		return (int)ans;
	}

	private static String commonPrefix(String[] a, int l, int r) {
		if(l>r) return "";
		if(l+1==r) return commonUtil(a[l],a[r]);
		
		if(l<=r) {
			int mid=(l+r)/2;
			String left = commonPrefix(a, l, mid);
			String right = commonPrefix(a, mid+1, r);
			return commonUtil(left, right);
		}
		return null;
	}

	private static String commonUtil(String str1, String str2) {
		String result = "";
        int n1 = str1.length(), n2 = str2.length();
 
        for (int i = 0, j = 0; i <= n1 - 1 &&
                j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
        return (result);
	}

	private static int upper_bound(int[] a, int key) {
		int l=0;
		int r=a.length-1;
		int ans=-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(a[mid]<=key) {
				l=mid+1;
			}else {
				ans=mid;
				r=mid-1;
			}
		}
		return ans;
	}

	private static int sqrt_of_num_binary_search(int n) {
		
		int l =1;
		int r=n;
		int ans=1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			int midsq = mid*mid;
			if(n==midsq) return mid;
			if(midsq>n) {
				r=mid-1;
			}
			else {
				ans=mid;
				l=mid+1;				
			}
		}
		return ans;
		
		
		
		
//		int i=0;
//		for(;i*i<n;i++) {
//		}
//		return i-1;
	}

	private static int sorted_array_search_infinite(int[] a, int key) {
		int range=1;
		if(a.length==0) return -1;
		if(a[0]==key) return 0;
		
		while(a[range]<=key) {
			range*=2;
		}
		
		return binary_search(a,key,range/2,range);
	}

	private static int binary_search(int[] a, int key, int l, int r) {
		
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(a[mid]==key) return mid;
			if(a[mid]<key) l=mid+1;
			else r=mid-1;
		}
		return -1	;
	}

	private static boolean array_is_sorted_rotated(int[] a) {
		int n=a.length-1;
		int rotate =0;
		for(int i=0;i<n;i++) {
			if(a[i]>a[(i+1)%n]) rotate++;
		}
		if(rotate>1) return false;
		return true;
	}

	private static int sorted_and_rotated_array(int[] a, int key) {
		int l = 0;
		int r = a.length - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == key)
				return mid;

			if (a[l] <= a[mid]) {// left side sorted
				if (key >= a[l] && key < a[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			} else {// right side sorted
				if (key > a[mid] && key <= a[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}

		}

		return -1;
	}

	private static int total_length_of_occuring_number(int[] a, int key) {
		int l = left_occurance(a, key);
		int r = right_occurance(a, key);

		return r - l + 1;
	}

	private static int right_occurance(int[] a, int key) {
		int l = 0;
		int r = a.length - 1;
		int ans = -1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == key) {
				ans = mid;
				l = mid + 1;
			} else if (key > a[mid])
				l = mid + 1;
			else
				r = mid - 1;
		}

		return ans;
	}

	private static int left_occurance(int[] a, int key) {
		int l = 0;
		int r = a.length - 1;
		int ans = -1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == key) {
				ans = mid;
				r = mid - 1;
			} else if (key > a[mid])
				l = mid + 1;
			else
				r = mid - 1;
		}

		return ans;
	}

	private static boolean binary_search(int[] a, int key) {

		int l = 0;
		int r = a.length - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == key)
				return true;
			else if (key > a[mid])
				l = mid + 1;
			else
				r = mid - 1;

		}
		return false;
	}

}
