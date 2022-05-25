package Lec_04;

public class Number_Pat {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
//		int ntp = 1;
		int srn = 1; // starting row number
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("\t");
				csp++;

			}
			int cst = 0;
			int ntp = srn;
			while (cst < nst) {
				System.out.print(ntp + "\t");
				if (cst < nst / 2) {
					ntp++;
				} else {
					ntp--;
				}

				cst++;
			}

			row++;
			nst = nst + 2;
			nsp--;
			srn++;

			System.out.println();

		}

	}
}
