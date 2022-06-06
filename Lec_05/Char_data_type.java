package Lec_05;

public class Char_data_type {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);
		System.out.println((int) 'b');
		System.out.println((int) 'z');
		System.out.println(ch + 10);
		int i = ch; // implicit!!

		System.out.println((char) 69);

		char ch2 = (char)(ch + 30);
		System.out.println(ch2);
	}
}
