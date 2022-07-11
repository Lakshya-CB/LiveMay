package Lec_20;

public class Rec_T2 {
	public static void main(String[] args) {
//		System.out.println(Fac(4));
		System.out.println(Pow(2, 10));
	}

	public static int Fac(int n) {
		if (n == 0) { // smallest problem fac(0)
			return 1;
		}
//		BP : Fac(n)
//		SP : Fac(n-1)
		int sp = Fac(n - 1);
		return sp * n;
	}

	public static int Pow(int a, int x) {
		if (x == 0) {
			return 1;
		}
//		BP : Pow(a,x);
//		SP : Pow(a,x-1);

		int sp = Pow(a, x - 1);
		return sp * a;
	}
	
		public static int fib(int n) {
			if (n <= 1) {
				return n;
			}
	//		BP : fib(n)
	//		SP : fib(n-1) fib(n-2)
			int sp1 = fib(n - 1);
			int sp2 = fib(n - 2);
			return sp1 + sp2;
		}
}
