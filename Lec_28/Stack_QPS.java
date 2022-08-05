package Lec_28;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<Integer>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
//		System.out.println(S);
//		Rev(S);
//		System.out.println(S);

//		RevPrint(S);

		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		Nextgr8er2(arr);
//		FormMinSeq("DDIIDDIID");
	}

	public static void RevPrint(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int temp = S.pop(); // 40
		RevPrint(S);// 10 20 30
		System.out.println(temp);
		S.push(temp);
	}

	public static void Rev(Stack<Integer> S) {
		Stack<Integer> copium = new Stack<>();
		Copy(S, copium);
//		System.out.println(copium+" "+S);

		while (!copium.isEmpty()) {
			S.add(copium.pop());
		}
	}

	public static void Copy(Stack<Integer> S, Stack<Integer> copium) {
		if (S.isEmpty()) {
			return;
		}
		int temp = S.pop(); // 40
		Copy(S, copium);// 10 20 30
		copium.add(temp);
//		S.push(temp);
	}

	public static void Nextgr8er(int[] arr) {
		Stack<Integer> S = new Stack<>();
//		potential A's
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				System.out.println(S.pop() + "=>" + B);
			}
			S.push(B);
		}
		while (!S.isEmpty()) {
			System.out.println(S.pop() + "=>" + -1);
		}

	}
	public static void Nextgr8er2(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> S = new Stack<>();
//		potential A's
		int idx =0;
		for (int B : arr) {
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] =B;
				System.out.println(arr[A_idx] + "=>" + B);
			}
			S.push(idx);
			idx++;
		}
		while (!S.isEmpty()) {
			int A_idx = S.pop();
			ans[A_idx] =-1;
			System.out.println(arr[A_idx] + "=>" + -1);
		}
		System.out.println(Arrays.toString(ans));

	}

	public static void FormMinSeq(String str) {
		int digit =1;
		int countD =0;
		int[] arr= new int[str.length()+1];
		for(int i=0;i<=str.length();i++) {
			if(i==str.length()||str.charAt(i)=='I') {
				int curr_idx = i;
				for(int c = 1;c<=countD+1;c++) {
					arr[curr_idx]=digit;
					digit++;
					curr_idx--;
				}
				countD=0;
			}
			else if(str.charAt(i)=='D') {
				countD++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
