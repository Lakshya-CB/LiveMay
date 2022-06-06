package Lec_06;

public class function_demo {
	public static void main(String[] args) {
		fun1();
		int sum = Add(10, 20);
		System.out.println(sum);
//		Add3(10, 20, 30);

	}

	public static void fun1() {
		System.out.println("ALAAAAN");
	}

	public static int Add(int a, int b) {
//		System.out.println(a + b);
		int sum = a + b;
		return sum;
	}

	public static void Add3(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static boolean compare(int a, int b) {
		return a > b;
	}

}
