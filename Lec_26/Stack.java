package Lec_26;


public class Stack {
	private int[] arr;
	private int tos;

	public Stack() {
		// TODO Auto-generated constructor stub
		tos = -1;
		arr = new int[5];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("Kaha add kar rha hein ?");
		}
		tos++;
		arr[tos] = ali;
	}

	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Haan , kya deekh rha hein ?");
		}
		return arr[tos];
	}

	public int pop() {
		int ans = peek();
		tos--;
		return ans;
	}

	public void disp() {
		int idx = tos;
		while(idx>=0) {
			System.out.print(arr[idx]+ " ");
			idx--;
		}
		System.out.println();
	}
}
