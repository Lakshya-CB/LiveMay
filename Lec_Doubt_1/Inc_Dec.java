package Lec_Doubt_1;

import java.util.Scanner;

public class Inc_Dec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
//		int prev = 1000000000;
		int prev = Integer.MAX_VALUE;
		int state = 0;
		// state =0; dec
		// state =1; inc

		int ans = 0; // ans nahi aaya

		while (n > 0) {
			int num = scn.nextInt();

			if (state == 0 && num > prev) {
				state = 1;
			}

			if (state == 1 && num < prev) {
				System.out.println("false");
				ans = 1;
				break;
			}

			if (prev == num) {
				System.out.println("false");
				ans = 1;
				break;

			}
			prev = num;
			n--;
		}
		if (ans == 0) {
			System.out.println("true");
		}
	}
}
