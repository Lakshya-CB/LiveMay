package Lec_06;

public class Rotate_1 {
	public static void main(String[] args) {
		int num = 123456;
		int rot = 3000;

		int backup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}

		rot = rot % nod;
		num = backup;

		for (int r = 0; r < rot; r++) {
			int last = num % 10;
			int remain = num / 10;

			int mult = (int) Math.pow(10, nod - 1);
			num = last * mult + remain;
//			System.out.println(num);
		}
		System.out.println(num);
	}
}
