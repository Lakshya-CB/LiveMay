package Lec_04;

public class Pat_7 {
	public static void main(String[] args) {
		int n = 11;

		int nst = n; // number of star in the row

		int row = 1;
		while (row <= n) {
			int cst = 0; // current star!!

			while (cst < nst) {
//				if (cst == 0||cst==n-1||row==1||row==n) {
				if (row - cst == 1||row+cst==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
				cst++;
			}
			row++;
			System.out.println();
		}

	}
}
