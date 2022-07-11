package Lec_19;

public class String_demo {
	public static void main(String[] args) {
		String str1 = "LULU"; //10k
		String str21 = str1;//10k
		String str22 = str1;//10k
		
		str1 = "dulu"; // immutable 20k
		
		System.out.println(str22);
		System.out.println(str1);
	}
}
