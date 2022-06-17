package Lec_11;

public class Array_2D {
	public static void main(String[] args) {
		int[][] mat = new int[5][3];
//							 [R][C]
		System.out.println(mat);
		System.out.println(mat.length);// row number
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		System.out.println(mat[2]);
		System.out.println(mat[3]);
		System.out.println(mat[4]);
//		mat[0] = 10; // bhaoya kuch bhi ?!
//		System.out.println(mat[5]);		
		System.out.println(mat[0].length);// col
		mat[0][0] = 10;		
		mat[0][1] = 20;
		mat[0][2] = 20;
		
		for(int[] row : mat) {
			for(int ele : row) {
				System.out.print(ele + " ");
				
			}
			System.out.println();
		}
		System.out.println("==========");
		
		for(int r = 0;r<mat.length;r++) {
			for(int c =0;c<mat[0].length;c++) {
				System.out.print(mat[r][c]+" ");
			}
			System.out.println();
		}
		
	}
}
