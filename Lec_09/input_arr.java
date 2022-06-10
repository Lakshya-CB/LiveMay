package Lec_09;

import java.util.Scanner;

public class input_arr {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int len = scn.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scn.nextInt();
		}

		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}
}
