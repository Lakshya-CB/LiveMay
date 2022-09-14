package Lec_35;

import java.util.HashMap;

public class HashMap_QPs {
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		intersection(arr1, arr2);
		int[] arr ={2,12,9,16,10,5,3,20,25,11,1,8,6};
		longestSeqCons(arr);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int ali : arr2) {
			if (map.containsKey(ali)) {
				int prev = map.get(ali);
				map.put(ali, prev + 1);
			} else {
				map.put(ali, 1);
			}
		}
		System.out.println(map);

		for (int ali : arr1) {
			if (map.containsKey(ali) && map.get(ali) > 0) {
//			if(map.get(ali)>0&&map.containsKey(ali)) {
				System.out.println(ali);
				int prev = map.get(ali);
				map.put(ali, prev - 1);
			}
		}
		System.out.println(map);
	}

	public static void longestSeqCons(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int ali : arr) {
			if (map.containsKey(ali - 1)) {
				map.put(ali, false);
			} else {
				map.put(ali, true);
			}
			if (map.containsKey(ali + 1)) {
				map.put(ali + 1, false);
			}
		}
		for (int key : map.keySet()) {
			if (map.get(key)) {
//				System.out.println(key);
				int temp = key;
				while(map.containsKey(temp)) {
					System.out.print(temp+" ");
					temp++;
				}
				System.out.println();
			}
		}
	}
}
