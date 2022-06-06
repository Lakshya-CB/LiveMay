package Lec_05;

public class Primitive_DT_demo {
	public static void main(String[] args) {
		byte b = (byte) 1024;// byte(8) <= int(32)
		System.out.println(b);
		System.out.println("========");
		short s = 128;// short(16) <= int(32)
		System.out.println(s);
		System.out.println("========");
		int i = Integer.MAX_VALUE;
		System.out.println(i);// int(32) <= int(32)
		System.out.println(Integer.MIN_VALUE);
		System.out.println("========");
		long l = 12345670877l;// long(64) <= int(32)
		System.out.println(l);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		float f = 10.4f;
		System.out.println(f);
		double d = 10.4;
		System.out.println(f);
		 
		f = i; //B

		i = (int)f; // A

	}
}
