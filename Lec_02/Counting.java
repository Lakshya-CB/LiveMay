package Lec_02;

import java.util.Scanner;

public class Counting {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		int slaps = 1;
		while (slaps <= n) {
			slaps = slaps + 1;
			System.out.println(slaps);
		}
	}
}
