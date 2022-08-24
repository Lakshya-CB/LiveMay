package Lec_31_BT;

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

	public BinaryTree(int[] Pre, int[] In) {
		// TODO Auto-generated constructor stub
		root = createPreIn(Pre, 0, Pre.length - 1, In, 0, Pre.length - 1);
	}

	public void Disp() {
		Disp(root);
	}

	private void Disp(Node nn) {
		if (nn == null) {
			return;
		}
		System.out.println(nn.data);
		Disp(nn.left);
		Disp(nn.right);
	}

	private Node createPreIn(int[] Pre, int Pre_s, int Pre_e, int[] In, int In_s, int In_e) {
		if (Pre_s > Pre_e || In_s > In_e) {
			return null;
		}
		Node nn = new Node(Pre[Pre_s]);
		int ali = Pre[Pre_s];
		int found = In_s;
		int L_Size = 0;
		for (int i = In_s; i <= In_e; i++) {
			if (In[i] == ali) {
				found = i;
				break;
			}
			L_Size++;
		}
		nn.left = createPreIn(Pre, Pre_s + 1, Pre_s + L_Size, In, In_s, found - 1);
		nn.right = createPreIn(Pre, Pre_s + L_Size + 1, Pre_e, In, found + 1, In_e);
		return nn;
	}

	public boolean find(int ali) {
		return find(root, ali);
	}

	private boolean find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;
		}
		boolean sp1 = find(nn.left, ali);
		boolean sp2 = find(nn.right, ali);

		return sp1 || sp2;
	}

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int sp1 = Ht(nn.left);
		int sp2 = Ht(nn.right);
		int self = sp1 + sp2 + 2;
		return Math.max(sp1, sp2) + 1;
	}

	public int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}

		int sp1 = Dia(nn.left);
		int sp2 = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;

		return Math.max(sp2, Math.max(sp1, self));
	}

	class pair {
		int Ht = -1;
		int dia = 0;
	}

	public pair Dia2(Node nn) {
		if (nn == null) {
			return new pair();
		}

		pair sp1 = Dia2(nn.left);
		pair sp2 = Dia2(nn.right);

		pair ans = new pair();
		int self_dia = sp1.Ht + sp2.Ht + 2;
		ans.dia = Math.max(Math.max(self_dia, sp1.dia), sp2.dia);
		ans.Ht = Math.max(sp1.Ht, sp2.Ht) + 1;
		return ans;
	}

	public boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean sp1 = isBal(nn.left);
		boolean sp2 = isBal(nn.right);
		if (sp1 && sp2) {
			int L = Ht(nn.left);
			int R = Ht(nn.right);
			return Math.abs(L - R) <= 1;
		}
		return false;
	}

	public void lvl() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (Q.isEmpty()) {
			Node curr = Q.poll();
			System.out.println(curr.data);
			if (curr.left != null) {
				Q.add(curr.left);
			}
			if (curr.right != null) {
				Q.add(curr.right);
			}
		}
	}

	public BinaryTree(int[] pre, int o) {

		int pidx =0;
	}
	int pidx =0;
	private Node createPre(int[] pre) {
		if(pre[pidx]==-1) {
			pidx++;
			return null;
		}
		Node nn = new Node(pre[pidx]);
		pidx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	public BinaryTree(int[] lvl) {
		// TODO Auto-generated constructor stub
		int idx = 0;
		root = new Node(lvl[idx]);
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);

		idx++;
		while (idx < lvl.length && !Q.isEmpty()) {
			Node curr = Q.poll();
			if (lvl[idx] != -1) {
				curr.left = new Node(lvl[idx]);
				Q.add(curr.left);
			}
			idx++;
			if (lvl[idx] != -1) {
				curr.right = new Node(lvl[idx]);
				Q.add(curr.left);
			}
			idx++;

		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {

		public boolean flipEquiv(TreeNode root1, TreeNode root2) {
			if (root1 == null || root2 == null) {
				return root1 == root2;
			}
			if (root1.val != root2.val) {
				return false;
			}
			boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
			boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
			return noflip || flip;

		}
	}
}
