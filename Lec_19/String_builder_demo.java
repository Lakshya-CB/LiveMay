package Lec_19;

public class String_builder_demo {
	public static void main(String[] args) {
		String str = "LOL";
		StringBuilder sb = new StringBuilder(str);
//		print
		System.out.println(str);
		System.out.println(sb);

//		len
		System.out.println(sb.length());
		System.out.println(str.length());

//		charAt
		System.out.println(sb.charAt(0));
		System.out.println(str.charAt(0));

//		subString!!
		System.out.println(sb.substring(1));
//		indexof
		System.out.println(sb.indexOf("LO"));
//	str[i] = ch?!
//		set char!!
		sb.setCharAt(0, 'P');// O(1)
		System.out.println(sb);
//		Concatenation at last index
		sb.append("POPOPOP");
		System.out.println(sb);
//		adding at index!!
		sb.insert(1, "iii"); // O(n)
		System.out.println(sb);
//		deletion
		sb.deleteCharAt(3);// O(n)
		System.out.println(sb);

		String ans = sb.toString();
		System.out.println(ans);
	}
}
