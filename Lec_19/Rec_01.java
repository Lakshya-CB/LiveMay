package Lec_19;

public class Rec_01 {
	public static void main(String[] args) {
		PD(4);
	}

	public static void PD(int n) {
		if (n == 0) { 
// smallest problem 
//			beyond, smaller beak na ho!!
			return;
		}
//	BP : PD(n)
//	SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}
}
