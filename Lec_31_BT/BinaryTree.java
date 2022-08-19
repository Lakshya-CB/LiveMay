package Lec_31_BT;

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
		root = createPreIn(Pre, 0, Pre.length-1, In, 0, Pre.length-1);
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
}
