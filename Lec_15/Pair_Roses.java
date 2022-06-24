package Lec_15;

import java.util.Arrays;

public class Pair_Roses {
	public static void main(String[] args) {
		int[] roses = { 1, 10, 2, 4, 5, 6, 8, 4 };
		int A = 10;
		ans2(roses, A);

	}

	public static void ans(int[] roses, int A) {
		int R1 = 0;
		int R2 = 0;
		int min_diff = Integer.MAX_VALUE;
		for (int i = 0; i < roses.length; i++) {
			for (int j = i + 1; j < roses.length; j++) {
				if (roses[i] + roses[j] == A) {
					int diff = Math.abs(roses[i] - roses[j]);
					System.out.println("pair" + roses[i] + roses[j]);

					if (diff < min_diff) {
						min_diff = diff;
						R1 = Math.min(roses[i], roses[j]);
						R2 = Math.max(roses[i], roses[j]);
					}
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + R1 + " and " + R2 + ".");
	}

	public static void ans2(int[] roses, int A) {
		Arrays.sort(roses); // array ko sort karta hein 
		int L = 0;
		int R = roses.length - 1;
		int R1 = 0;
		int R2 = 0;
		while (L < R) {
			if (roses[L] + roses[R] > A) {
				R--;
			} else if (roses[L] + roses[R] == A) {
				R1 = roses[L];
				R2 = roses[R];
				L++;
				R--;
			} else {
				L++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + R1 + " and " + R2 + ".");
	}

}
