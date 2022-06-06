package Lec_07;

public class Function_demo_3 {
	static int val = 100;
	public static void main(String[] args) {
		System.out.println(Function_demo_3.val);
		fun(20);
	}
	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(Function_demo_3.val);
		val = val + 60;
		Function_demo_3.val = val + 10;
		System.out.println(val);
		System.out.println(Function_demo_3.val);
	}
}
