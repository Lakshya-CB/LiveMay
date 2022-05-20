package Lec_01;

import java.util.Scanner;

public class Report_Card {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int marks = scn.nextInt();
		if (marks >= 90) {
			System.out.println("A");
		} else if (50<=marks && marks<60) {
			System.out.println("E");
		} else if (70<=marks && marks<80) {
			System.out.println("C");
		} else if (60<=marks && marks<70) {
			System.out.println("D");
		} else if (80<=marks && marks<90) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}
	}
}
