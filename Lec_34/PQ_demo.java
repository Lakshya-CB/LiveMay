package Lec_34;

import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();// min heap!!
		PQ.add(100); //log(n)
		PQ.add(25);
		PQ.add(20);
		PQ.add(3);
		PQ.add(50);
		
		System.out.println(PQ);
		
		System.out.println(PQ.poll()); //log(n)
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println("=============");
		
		minHeap<Integer> minH= new minHeap<Integer>();// min heap!!
		minH.add(100); //log(n)
		minH.add(25);
		minH.add(20);
		minH.add(3);
		minH.add(50);
		
		System.out.println(minH.Al);
		
		System.out.println(minH.poll()); //log(n)
		System.out.println(minH.poll());
		System.out.println(minH.poll());
		System.out.println(minH.poll());
		System.out.println(minH.poll());
		
		
		
	}
}
