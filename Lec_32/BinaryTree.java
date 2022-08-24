package Lec_32;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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

	public BinaryTree(int[] lvl) {
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

	public boolean isBST() {
		return isBST2(root).isBST;
	}

	private boolean isBST(Node nn) {
		if(nn==null) {
			return true;
		}
		// TODO Auto-generated method stub
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);
		if (L && R) {
			boolean self = Max(nn.left)<=nn.data;
			self = self && (nn.data<Min(nn.right));
			return self;
		}
		return false;
	}
	
	class BSTpair{
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		boolean isBST= true;
	}
	private BSTpair isBST2(Node nn) {
		if(nn==null) {
			return new BSTpair();
		}
		// TODO Auto-generated method stub
		BSTpair L = isBST2(nn.left);
		BSTpair R = isBST2(nn.right);
		
		BSTpair ans = new BSTpair();
		ans.Max = Math.max(Math.max(L.Max, R.Max), nn.data);
		ans.Min = Math.min(Math.min(L.Min, R.Min), nn.data);
		
		
		ans.isBST = L.isBST && R.isBST;
		if (L.isBST && R.isBST) {
			boolean self = L.Max<=nn.data;
			self = self && (nn.data<R.Min);
			ans.isBST = self;
		}
		return ans;
	}
	private int Min(Node right) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int Max(Node left) {
		// TODO Auto-generated method stub
		return 0;
	}
}