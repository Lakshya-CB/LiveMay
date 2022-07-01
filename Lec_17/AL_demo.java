package Lec_17;

import java.util.ArrayList;

public class AL_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		ArrayList<Integer> AL = new ArrayList<Integer>();
		System.out.println(AL);
		AL.add(10);
		AL.add(20);
		AL.add(30);
		System.out.println(AL);
		AL.add(40);
		AL.add(50);
		AL.add(60);
		System.out.println(AL);
//		size?!
		System.out.println(arr.length);
		System.out.println(AL.size());
//		indexing!!
		arr[0] = 10;
		AL.set(0,99);// place 99 at index 0!!
		System.out.println(AL);
//		what is the value at index 3?!
		System.out.println(AL.get(3));
		System.out.println(AL.get(AL.size()-1));
		AL.add(2,70);
		System.out.println(AL);
		AL.add(AL.size(),80);

		System.out.println(AL);
		
		int alio = AL.remove(2);
		System.out.println(alio);
		System.out.println(AL);
		int i =5;
		System.out.println(5>>1);
	}
}
