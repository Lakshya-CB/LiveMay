package Lec_03;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 0;

		int a = 0;
		int b = 1;

		int count = 0;
		while (count < n-1 ) {
			int c = a + b;
//			System.out.println(c);
			a = b;
			b = c;

			count++;
		}
//		System.out.println(a);
		System.out.println(b);

	}

}
