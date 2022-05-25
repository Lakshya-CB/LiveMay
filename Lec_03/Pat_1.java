package Lec_03;

public class Pat_1 {
	public static void main(String[] args) {
		int n = 5;

		int nst = n; // number of star in the row

		int row = 1;
		while (row <= n) {
			int cst = 0; // current star!!

			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
		}
		
		System.out.println("ASDfasdfas");
	}
}
