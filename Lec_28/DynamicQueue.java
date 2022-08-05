package Lec_28;

public class DynamicQueue extends Queue {
	@Override
	public void add(int ali) {
		if(isFull()) {
			int[] biggy = new int[super.arr.length*2];
			for(int i =0;i<this.size;i++) {
				biggy[i] = arr[(s+i)%arr.length];
			}
			this.arr = biggy;
			s=0;
		}
		super.add(ali);
	}
}
