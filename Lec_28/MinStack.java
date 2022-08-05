package Lec_28;

import Lec_27.DynamicStack;

public class MinStack extends DynamicStack {
	int min = Integer.MIN_VALUE;

	@Override
	public int peek() {
		if (super.peek() < min) {
//			mageeecal 
			return min;
		} else {
			return super.peek();
		}
	}

	public int Min() {
		return min;
	}

	@Override
	public void add(int ali) {
		if (isEmpty()) {
			min = ali;
			super.add(ali);
			return;
		}
		if(ali>=min) {
			super.add(ali);
		}else {
			int prev_min = min;
			min = ali;
			int x = 2*min-prev_min;
			super.add(x);
		}
	}
	@Override
	public int pop() {
		if(super.peek()>=min) {
			return super.pop();
		}else {
			int curr_min = min;
			int x = super.pop();
			int prev_min = 2*curr_min-x;
			min = prev_min;
			return curr_min;
		}
	}
}
