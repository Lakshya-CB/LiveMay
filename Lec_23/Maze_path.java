package Lec_23;

public class Maze_path {
	public static void main(String[] args) {
		chal(0, 0, 2, 2, "");
	}

	public static void chal(int r, int c, int dest_r, int dest_c, String path) {
		if (r > dest_r || c > dest_c) {
			return;
		}
		if (r == dest_r && c == dest_c) {
			System.out.println(path);
			return;
		}

		chal(r + 1, c, dest_r, dest_c, path + "D");
		chal(r, c + 1, dest_r, dest_c, path + "R");

	}
}
