package Lec_30_31;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.addLast(50);
		LL.addLast(60);
		LL.addLast(70);
		LL.addLast(80);
		LL.addLast(90);
		
//		LL.Disp();
//		LL.Rev();
//		LL.Disp();
//		LL.Rev2();
//		LL.Disp();
//		System.out.println(LL.getMid());
		LL.revK(3);;
		LL.Disp();
	}
}
