package Lec_05;

public class Pat_33 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		int rnum = n;
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int ntp = rnum;
			int cst = 0;
			while (cst < nst) {
				System.out.print(ntp % 10 + " ");
				if (cst < nst / 2) {
					ntp++;
				} else {
					ntp--;
				}
				cst++;
			}
			row++;
			nst = nst + 2;
			nsp = nsp - 1;
			rnum--;
			System.out.println();
		}
	}
}
