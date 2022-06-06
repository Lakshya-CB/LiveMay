package Lec_07;

public class Arr_demo_1 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n];
		System.out.println(arr);

//		array ka size ?
		int size = arr.length;
		System.out.println(size);
//		arr ka ith index ?!
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[arr.length - 1]);

//		System.out.println(arr[arr.length]);

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[arr.length - 1]);
		System.out.println("===============");
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = 2 * idx;
		}
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
//		Enhanced loop ya for each loop!
		System.out.println("===============");
		for(int val : arr) {
			System.out.print(val+ " ");
			val = 99;
		}
		System.out.println();
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
		

	}
}
