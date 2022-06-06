package Lec_05;

import java.util.Scanner;

public class Upper_Lower {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);

		System.out.println(ch + " == ");
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("LOWER");
			
		}else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("UPPER");
			
		}
	}
}
