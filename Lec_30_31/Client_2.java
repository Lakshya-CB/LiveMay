package Lec_30_31;

import java.util.LinkedList;

public class Client_2 {
	public static void main(String[] args) {
		LinkedList<Integer> LL = new LinkedList<>();
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		System.out.println(LL);
		for(int ali : LL) {
			System.out.println(ali);
		}
	}
}
