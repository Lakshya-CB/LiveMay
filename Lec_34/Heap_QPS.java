package Lec_34;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_QPS {
	public static void main(String[] args) {
//		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();// min heap
//		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>(Collections.reverseOrder());// max heap
		int[] arr= {20,30,60,50,10,55,57,40};
		maxK(arr, 3);
	}
	public static void maxK(int[] arr,int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();// min heap
		for(int ali : arr) {
			PQ.add(ali);
			if(PQ.size()>k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}
}
