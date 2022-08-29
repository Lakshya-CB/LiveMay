package Lec_34;

import java.util.ArrayList;

public class minHeap<III extends Comparable<III>> {
	ArrayList<III> Al;

	public minHeap() {
		// TODO Auto-generated constructor stub
		Al = new ArrayList<III>();
	}

	public int size() {
		return Al.size();
	}

	public boolean isEmpty() {
		return Al.isEmpty();
	}

	public void disp() {
		System.out.println(Al);
	}

	public III peek() {
		return Al.get(0);
	}

	public void add(III ali) {
		Al.add(ali); // CBT!!
		Upheapify(Al.size() - 1);
	}

	private void Upheapify(int child) {
		int parent = (child - 1) / 2;
//		if (Al.get(parent) > Al.get(child)) {
		if (Al.get(parent).compareTo(Al.get(child)) > 0) {
//		if(C-P>0) {
			swap(child, parent);
			Upheapify(parent);
		}
	}

	private void swap(int i, int j) {
		III temp = Al.get(i);
		Al.set(i, Al.get(j));
		Al.set(j, temp);
	}

	public III poll() {
		III ans = Al.get(0);
		Al.set(0, Al.get(Al.size() - 1));
		Al.remove(Al.size() - 1);
		Downheapify(0);
		return ans;
	}

	private void Downheapify(int paren) {
		int L = paren * 2 + 1;
		int R = paren * 2 + 2;
		int min = paren;
//		if (L<Al.size() && Al.get(L) < Al.get(min)) {
		if (L < Al.size() && Al.get(min).compareTo(Al.get(L)) > 0) {
			min = L;
		}
//		if (R < Al.size() && Al.get(R) < Al.get(min)) {
		if (R < Al.size() && Al.get(min).compareTo(Al.get(R)) > 0) {

			min = R;
		}
		if (min != paren) {
			swap(min, paren);
			Downheapify(min);
		}
	}
}
