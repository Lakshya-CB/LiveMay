package Lec_22;

public class Rec_Basics_3 {

	public static void main(String[] args) {
//		CT(3,"");
//		SubSequence("abc","");
//		KLC("567","");
//		Stair(0, 4, "");
		Stair_comb(0, 0, 4, "");

	}

	public static void CT(int n, String path) {
		if (n == 0) { // +ve Bc
			System.out.println(path);
			return;
		}
		CT(n - 1, path + "H");
		CT(n - 1, path + "T");

	}

	public static void SubSequence(String word, String team) {
		if (word.isEmpty()) {
			System.out.println(team + "~~~");
			return;

		}
		char ch = word.charAt(0);// 1
		String remain = word.substring(1);// bc
		SubSequence(remain, team + ch);// Inc
		SubSequence(remain, team);// Inc
		SubSequence(remain, team + (int) (ch - 'a' + 1));// Inc

	}

	public static void KLC(String word, String path) {
		// word = 56
		if (word.isEmpty()) {
			System.out.println(path);
			return;
		}
		char ch = word.charAt(0);// 5
		String ops = options(ch);
		String remain = word.substring(1);// bc

		for (int i = 0; i < ops.length(); i++) {
			KLC(remain, path + ops.charAt(i));
		}

	}

	public static String options(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}

	// permutations!!
	public static void Stair(int curr, int dest, String path) {
		if (curr == dest) {
			System.out.println(path);
			return;
		}
		if (curr > dest) {
			return;

		}
		Stair(curr + 1, dest, path + 1);
		Stair(curr + 2, dest, path + 2);
		Stair(curr + 3, dest, path + 3);

	}

	public static void Stair_comb(int curr, int last_jump, int dest, String path) {
		if (curr == dest) {
			System.out.println(path);
			return;
		}
		if (curr > dest) {
			return;

		}
		if (last_jump <= 1) {
			Stair_comb(curr + 1, 1, dest, path + 1);
		}
		if (last_jump <= 2) {
			Stair_comb(curr + 2, 2, dest, path + 2);
		}
		if (last_jump <= 3) {
			Stair_comb(curr + 3, 3, dest, path + 3);
		}
	}
}
