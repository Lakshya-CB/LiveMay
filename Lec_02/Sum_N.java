package Lec_02;

import java.util.Scanner;

public class Sum_N {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int count = 0;
		int sum = 0;
		while (count < n) {
//			System.out.println(count);
			count = count + 1;
			sum = sum + count;
		}
		System.out.println(sum);
	}
}
