package Lec_03;

public class Rev_num {
	public static void main(String[] args) {
		
		int n = 120000;
		int ans = 0;

		while (n > 0) {
			
			int Digit = n % 10; // digit!!
//			System.out.println(Digit);
			ans = ans * 10 + Digit;
			n = n / 10; // bacha part!!
		}
		System.out.println(ans);

	}
}
