package Lec_27;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
//		case 1
//		P obj1 = new P();
//		case 2
		P obj2 = new C();
//		Data members collision LHS!!
		System.out.println(obj2.data);
		System.out.println(((C)obj2).data);
		System.out.println(((C)obj2).dataC);
		System.out.println(((C)obj2).dataP);
		
//		
		System.out.println("===========");
		obj2.fun();
		((C)obj2).fun();
//		case 3 :
		Object obj3 = new P();
		System.out.println(obj3);
//		Object x = new P();
//		case 4:
//		C obj4 = new P();
//		obj4.
		ArrayList<Integer> AL = new ArrayList<>();
		System.out.println(AL);
	}
}
