package Lec_32;

public class Client {
	public static void main(String[] args) {
		int[] lvl = { 10, 5, 20, 2, 7, 20 };
		BinaryTree BT = new BinaryTree(lvl);
		BT.Disp();
		System.out.println(BT.isBST());
	}
}
