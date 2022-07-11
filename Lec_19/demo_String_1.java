package Lec_19;

public class demo_String_1 {
	public static void main(String[] args) {
		String str1 = "LOOLO";// Literally!!
		String str11 = "LOOLO";// Literally!!
		String str12 = "LOOLO";// Literally!!
		String str13 = "LOOLO";// Literally!!

		String str2 = new String("LOOLO");
		String str21 = new String("LOOLO");
		String str22 = new String("LOOLO");
		String str23 = new String("LOOLO");

//		System.out.println(str1 == str2); // == compares address!!
//		System.out.println(str1.equals(str2)); // to compare content
 
		System.out.println(str21 == str22);

		System.out.println(str11 == str13);
		System.out.println(str11.substring(0));
	}
}
