package Lec_06;

public class Rotation_2 {
	public static void main(String[] args) {
		int num = 123456;
		int rot = 12341;
		int nod = 0;
		int backup = num;
		
//		System.out.println(Math.log10(backup));
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		rot = rot % nod;
		num = backup;
		int div = (int) Math.pow(10, rot);
		int part1 = num / div;
		int part2 = num % div;
		System.out.println(part1 + "-" + part2);
		int mult = (int) Math.pow(10, nod - rot);
		System.out.println(mult * part2 + part1);
	}
}
