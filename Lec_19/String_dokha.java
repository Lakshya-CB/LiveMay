package Lec_19;

public class String_dokha {
	public static void main(String[] args) {
		String str = "";
		int n = 100;
		StringBuilder sb = new StringBuilder();
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
//			str = str + i; // O(n)
			sb.append(i);// O(1)
//			int lol = 2; //O(1)
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);
		String ans = sb.toString();
		System.out.println(ans);
	}
}
