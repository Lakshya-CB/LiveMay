package Lec_Doubt_1;

import java.util.Scanner;

public class Odd_even_Back {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			int num = scn.nextInt();

//			is num allowed on Sunday!!
			if (num % 2 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
			T--;
		}
	}
}
