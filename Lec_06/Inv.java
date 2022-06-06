package Lec_06;

public class Inv {
	public static void main(String[] args) {
		int num = 23145;
		int pos = 0;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			pos++;
			System.out.println(digit + " , " + pos);
			num = num / 10;
			sum = sum + (int) (pos * Math.pow(10, digit - 1));

		}
		System.out.println(sum);
	}
}
