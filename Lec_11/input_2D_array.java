package Lec_11;

import java.util.Scanner;

public class input_2D_array {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int R = scn.nextInt();
		int C = scn.nextInt();
		int[][] mat = new int[R][C];
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				mat[r][c] = scn.nextInt();
			}
		}

		System.out.println("=================");
		for (int[] row : mat) {
			for (int ele : row) {
				System.out.print(ele + " ");

			}
			System.out.println();
		}
	}
}
