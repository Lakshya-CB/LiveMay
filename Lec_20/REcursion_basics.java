package Lec_20;

public class REcursion_basics {
	public static void main(String[] args) {
//		PI(4);
//		PDI(4);
		PID(1, 4);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)

		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {
		if (n == 1) {
			System.out.println(1);
			System.out.println(1);
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
		// if(s==e) {
//			System.out.println(s);
//			System.out.println(s);
//			return;
//		}
//		BP : PID(1,4); (s,4)
//		SP : PID(1+1,4);(s+1,4);

		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}
}
