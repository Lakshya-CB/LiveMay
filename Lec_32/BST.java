package Lec_32;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public BST(int[] lvl) {
		// TODO Auto-generated constructor stub
		int idx = 0;
		root = new Node(lvl[idx]);
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);

		idx++;
		while (idx < lvl.length && !Q.isEmpty()) {
			Node curr = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				curr.left = new Node(lvl[idx]);
				Q.add(curr.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				curr.right = new Node(lvl[idx]);
				Q.add(curr.right);
			}
			idx++;

		}
	}

	public void Disp() {
		Disp(root);
	}

	private void Disp(Node nn) {
		if (nn == null) {
			return;
		}
		String ans = "";
		if (nn.left != null) {
			ans = ans + nn.left.data;
		}

		ans = ans + " => " + nn.data + " <= ";
		if (nn.right != null) {
			ans = ans + nn.right.data;
		}
		System.out.println(ans);
		Disp(nn.left);
		Disp(nn.right);
	}

	public boolean find(int ali) {
		return find(root, ali);
	}

	private boolean find(Node nn, int ali) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;
		} else if (nn.data > ali) {
			return find(nn.left, ali);
		} else {
			return find(nn.right, ali);

		}
	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data >= ali) {
			nn.left = add(nn.left, ali);
		} else {
			nn.right = add(nn.right, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		}
		if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
			return nn;
		} else if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
			return nn;
		} else {
//		delete nn !!
//			case 1 : leaf node
			if (nn.left == null && nn.right == null) {
				return null;
			}
//			case 2 : only single child!!
			else if (nn.left == null && nn.right != null) {
				return nn.right;
			} else if (nn.left != null && nn.right == null) {
				return nn.left;
			}
//			case 3 :both children 
			else {
				int Min = Min(nn.right);
				nn.data = Min;
				nn.right = remove(nn.right, Min);
				return nn;
			}
		}
	}

	private int Min(Node nn) {
		if (nn.left == null) {
			return nn.data;
		}
		return Min(nn.left);
	}

}
