package Lec_30_31;

import java.util.Scanner;

public class Vivek_loves {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while(T>0) {
			T--;
			int s= scn.nextInt();
			int[] arr = new int[s];
			for(int i=0;i<s;i++) {
				arr[i]= scn.nextInt();
			}
			System.out.println(Score(arr, 0, arr.length-1));
		}
	}

	public static int Score(int[] arr, int s, int e) {
		int ans =0;
		for (int p2s = s + 1; p2s <= e; p2s++) {
			if (sum(arr,s, p2s - 1) == sum(arr,p2s, e)) {
				int sp1 = Score(arr, s, p2s - 1);
				int sp2 = Score(arr, p2s, e);
				int curr=  Math.max(sp1, sp2)+1;
				return curr;
//				ans = Math.max(ans, curr);
			}
		}
		return ans;
	}

	public static long sum(int[] arr, int s, int e) {
		long ans = 0;
		for (int i = s; i <= e; i++) {
			ans = ans + arr[i];
		}
		return ans;
	}
}
