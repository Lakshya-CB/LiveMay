package Lec_29;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Qs {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
//		System.out.println(Q);
//		RevPrint(Q, 0);
//		System.out.println();
//		System.out.println(Q);
		int[] arr = {-20,10,-5,4,6,-9,-80,60,50};
		FirstNegNumk(arr, 3);


	}

	public static void RevPrint(Queue<Integer> Q, int c) {
		if (c == Q.size()) {
			return;
		}
		int temp = Q.poll();
		Q.add(temp);
		RevPrint(Q, c + 1);
		System.out.print(temp + " ");

	}

	public static void RevQ(Queue<Integer> Q) {
		if (Q.isEmpty()) {
			return;
		}
		int temp = Q.poll();
		RevQ(Q);
		Q.add(temp);
	}

	public static void FirstNegNumk(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}

		System.out.println(arr[Q.peek()]);
		for (int s = 1; s <= arr.length - k; s++) {
			if (Q.peek() == s - 1) {
				Q.poll();
			}
			int e = s + k - 1;
			if (arr[e] < 0) {
				Q.add(e);
			}
			System.out.println(arr[Q.peek()]);
		}
	}
}
