package Lec_23;

public class TOH {
	public static void main(String[] args) {
		solve(3, 'A', 'C', 'B');
	}

	public static void solve(int n, char src, char dest, char help) {
		if (n == 0) {
			return;
		}
		// BP : n disks!!
//		SP : n-1 disks!!
		solve(n - 1, src, help, dest);
		System.out.println(n + " from " + src + " to " + dest);
		solve(n - 1, help, dest, src);
	}
}
