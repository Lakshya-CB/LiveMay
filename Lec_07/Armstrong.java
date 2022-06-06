package Lec_07;

public class Armstrong {
	public static void main(String[] args) {
		printTill(100000);
	}

	public static void printTill(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArmStrong(num)) {
				System.out.println(num);
			}
		}
	}

	private static boolean isArmStrong(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		int nod = NumOfDigits(num);
		int backup = num;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			sum = sum + (int) Math.pow(digit, nod);
		}

		return backup == sum;
	}

	private static int NumOfDigits(int num) {
		int ans = 0;
		while (num > 0) {
			ans++;
			num = num / 10;
		}
		return ans;
	}
}
