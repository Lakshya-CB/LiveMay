package Lec_24;

import java.util.ArrayList;

public class Rec {
	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			jumping(i, 100);
//		}
//		ArrayList<String> AL = new ArrayList<>();
//		palin("nitin", "", AL);
//		perm(4, 2, "", new boolean[4]);
//		com(4, 0, 2, "");
		com2D(3, 3, 0, 0, 2, "", new boolean[3][3]);
	}

	public static void jumping(int curr, int limit) {
		if (curr > limit) {
			return;
		}

		System.out.println(curr);
		int digit = curr % 10;
		if (digit > 0) {
			jumping(curr * 10 + (digit - 1), limit);
		}
		if (digit < 9) {
			jumping(curr * 10 + (digit + 1), limit);
		}
	}

	public static void palin(String word, String path, ArrayList<String> AL) {
		if (word.length() == 0) {
			System.out.println(AL);
			System.out.println(path);
			System.out.println("===========");

		}
		for (int chakku = 1; chakku <= word.length(); chakku++) {
			String part = word.substring(0, chakku);
			if (isPalin(part)) {
				String remain = word.substring(chakku);
//			System.out.println(part+" -- "+remain);
				AL.add(part); // prep!! topy peheno!!
				palin(remain, path + "-" + part, AL);
				// undo the prep
				AL.remove(AL.size() - 1);
			}
		}
	}

	public static boolean isPalin(String part) {
		// TODO Auto-generated method stub
		int s = 0;
		int e = part.length() - 1;
		while (s < e) {
			if (part.charAt(s) != part.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void perm(int numBoxes, int toSelect, String path, boolean[] selected) {
		if (toSelect == 0) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < numBoxes; i++) {
//			select ith box
			if (selected[i] == false) {
				selected[i] = true;
				perm(numBoxes, toSelect - 1, path + "b" + i, selected);
				selected[i] = false;
			}
		}

	}

	public static void com(int nCol, int c, int toSelect, String path) {
		if (toSelect == 0) {
			System.out.println(path);
			return;
		}
		if (c == nCol) {
			return;
		}

		com(nCol, c + 1, toSelect - 1, path + "q" + c);
		com(nCol, c + 1, toSelect, path);

	}

	public static void com2D(int nRow, int nCol, int r, int c, int toSelect, String path, boolean[][] board) {
		if (toSelect == 0) {
			System.out.println(path);
			return;
		}
		if (c == nCol) {
			c = 0;
			r++;
		}
		if (r == nRow) {
			return;
		}
		if (isSafe(r, c, board)) {
			board[r][c] = true; // prep
			com2D(nRow, nCol, r, c + 1, toSelect - 1, path + "{" + r + "," + c + "}", board);
			board[r][c] = false; // prep
			
		}
		com2D(nRow, nCol, r, c + 1, toSelect, path, board);

	}
}
