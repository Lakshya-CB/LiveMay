package Lec_10;

public class binary_search {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };
		System.out.println(find(arr, 6));
	}

	public static int find(int[] arr, int ele) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
//			int mid = (s + e) / 2;
			int mid = s + (e - s) / 2;
			if (arr[mid] == ele) {
				return mid;
			} else if (arr[mid] > ele) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return -1;
	}

	public int firstBadVersion(int total_version) {
		int ans = total_version;
		int s = 1;
		int e = total_version;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (isBadVersion(mid)) {
				e = mid - 1;
				ans = mid;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

}
