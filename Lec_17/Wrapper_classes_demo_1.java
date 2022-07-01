package Lec_17;

public class Wrapper_classes_demo_1 {
	public static void main(String[] args) {
		int i = 10;
		Integer I = 10;

		System.out.println(I);
//		i = null;
		I = null;
		System.out.println(I);
		I = 99;
		
		I = i; // auto boxing
		
		i = I; // unboxing
		
	}
}
