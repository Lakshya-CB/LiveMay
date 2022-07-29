package Lec_26;

public class Clionet_Q {
	public static void main(String[] args) {
		Queue Q = new Queue();
		Q.add(10);
		Q.disp();
		Q.add(20);
		Q.disp();
		Q.add(30);
		Q.disp();
		Q.add(40);
		Q.disp();
		
		System.out.println(Q.poll());
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
	}
}
