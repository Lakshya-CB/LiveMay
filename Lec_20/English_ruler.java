package Lec_20;

public class English_ruler {
	public static void main(String[] args) {
		
		createruleer(5, 4);
	}
	public static void createruleer(int len, int Mtic) {
		for(int l=0;l<len;l++) {
			for(int t=0;t<Mtic;t++) {
				System.out.print("-");
			}
			System.out.println(l);
			pat(Mtic-1);
		}
		for(int t=0;t<Mtic;t++) {
			System.out.print("-");
		}
		System.out.println(len);

		
	}
	public static void pat(int n) {
		if (n == 0) {
			return ;
		}
//		BP : pat(n)
//		SP : pat(n-1)
		pat(n - 1);
//		
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
//		
		pat(n - 1);

	}
}
