package Lec_15;

public class String_Q {
	public static void main(String[] args) {
		String str = "the sky is blue";

		while (true) {
			int last_sp = str.lastIndexOf(" ");
			String word = str.substring(last_sp + 1);
			System.out.println(word);
			if (last_sp == -1) {
				break;
			}
			str = str.substring(0, last_sp);
		}
	}
}
