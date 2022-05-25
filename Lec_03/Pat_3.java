package Lec_03;

public class Pat_3 {
	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int nst = 1;
		while (row <= n) {

//			fill karna ka logic!!
//			Step 2:
			int cst =0; // current star
			while(cst<nst) { // num of star in each row
				System.out.print("* ");
				cst++;
			}
			

			System.out.println();
			row++;
			nst++;
		}
	}
}
