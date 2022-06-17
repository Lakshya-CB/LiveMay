package Lec_12;

import java.util.Scanner;

public class Strings_demo {
	public static void main(String[] args) {
		String str = "hello";
//		
		System.out.println(str.length());
//	char at an index?!
		char ch = str.charAt(2);
		System.out.println(ch);
//		last char ?!
		System.out.println(str.charAt(str.length() - 1));
//		
//		System.out.println(str.charAt(999));
		Scanner scn = new Scanner(System.in);
//		String input = scn.next();
//		char ch22 = input.charAt(0);
//		System.out.println(input);
		str = "Hallu Babblu";
		System.out.println(str.indexOf("l"));// left to right
		System.out.println(str.lastIndexOf("l"));// right to left

		str = "abcd";
		for (int s = 0; s < str.length() ; s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				System.out.println(str.substring(s, e));
			}
		}

	}
}
