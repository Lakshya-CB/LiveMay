package Lec_07;

public class function_demo_2 {
	static int aalo = 10;

	public static void main(String[] args) {
		aalo = aalo + 1;
		int aalo = 99;
		System.out.println(aalo);
		swap();
		System.out.println(aalo);
		System.out.println(function_demo_2.aalo);
	}

	public static void swap() {
		aalo = aalo + 1;
	}
}
