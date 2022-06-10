package Lec_10;

public class subarray_sum {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, -40, 50, -71, 40, 20, 25 };
//		SubArr2(arr);
		Kadence(arr);
	}

	public static void Kadence(int[] arr) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}

	public static void SubArr2(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			int ans = 0;
			for (int e = s; e < arr.length; e++) {
				ans = ans + arr[e];
				System.out.println(ans);
			}
		}
	}

	public static void SubArr(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				disp(arr, s, e);
				int ans = 0;
				for (int i = s; i <= e; i++) {
//					System.out.print(arr[i] + " ");
					ans = ans + arr[i];
				}
				System.out.println(" == > " + ans);
			}
		}
	}

	public static void disp(int[] arr, int s, int e) {
		for (int i = s; i <= e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int sum(int[] arr, int s, int e) {
		int ans = 0;
		for (int i = s; i <= e; i++) {
			ans = ans + arr[i];
		}
		return ans;
	}
}
