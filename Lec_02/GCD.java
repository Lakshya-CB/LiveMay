package Lec_02;

public class GCD {
	public static void main(String[] args) {
		int a = 18;
		int b = 34;

		
		int divisor = a;
		int dividend = b;

		while (divisor > 0) {
			int remainder = dividend % divisor;
//			System.out.println(remainder);
//			A
//			divisor = remainder;
//			dividend = divisor;
//			B
			dividend = divisor;
			divisor = remainder;
		}
		System.out.println(dividend);
	}
}
