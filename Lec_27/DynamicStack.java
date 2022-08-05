package Lec_27;

public class DynamicStack extends Stack {
	@Override
	public void add(int ali) {
		if(isFull()) {
			int[] big = new int[this.arr.length*2];
			for(int i=0;i<=tos;i++) {
				big[i] = this.arr[i];
			}
			this.arr = big;
		}
		super.add(ali);
	}

}
