package Lec_33;

import java.util.Comparator;

public class Generics_1 {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("A", 11);
		arr[1] = new Student("B222", 1);
		arr[2] = new Student("1C", 161);
		arr[3] = new Student("2D", 111);
		arr[4] = new Student("0E", 112);
		sort(arr, new LL());
//		System.out.println(s1);
		Disp(arr);
	}

	static class LL implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
//			return o1.Name.compareTo(o2.Name);
			return o1.Age - o2.Age;
		}

	}

	public static Object Disp(Object[] arr) {
		for (Object obj : arr) {
			System.out.print(obj + " ");
		}
		System.out.println();
		return null;
	}

//	public static <TTT> TTT Disp(TTT[] arr) {
//		for (TTT obj : arr) {
////			obj
//			System.out.print(obj + " ");
//		}
//		System.out.println();
//		return null;
//	}
	public static <OOO extends Comparable<OOO>> void sort(OOO[] arr) {
		for (int count = 1; count <= arr.length; count++) {
			for (int i = 0; i <= arr.length - 2; i++) {
//				arr[i].
//				if (arr[i + 1] < arr[i]) {
//				if(arr[i]-arr[i+1]>0) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					OOO temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	public static <OOO> void sort(OOO[] arr, Comparator<OOO> cc) {
		for (int count = 1; count <= arr.length; count++) {
			for (int i = 0; i <= arr.length - 2; i++) {
//				arr[i].
//				if (arr[i + 1] < arr[i]) {
//				if(arr[i]-arr[i+1]>0) {

				if (cc.compare(arr[i], arr[i + 1]) > 0) {
					OOO temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
