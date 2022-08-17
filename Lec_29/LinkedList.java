package Lec_29;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void Disp() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public int Size() {
		int s = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			s++;
		}
		return s;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getLastNode() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public int getAt(int i) {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		if (i < 0 || i > Size()) {
			throw new IndexOutOfBoundsException();
		}
		Node temp = head;
		for (int count = 1; count <= i; count++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public Node getAtNode(int i) {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		if (i < 0 || i > Size()) {
			throw new IndexOutOfBoundsException();
		}
		Node temp = head;
		for (int count = 1; count <= i; count++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(int ali) {
		Node nn = new Node(ali);
		if (isEmpty()) {
			head = nn;
			return;
		}
		Node last = getLastNode();
		last.next = nn;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx == 0) {
			addFirst(ali);
			return;
		} else if (idx == Size()) {
			addLast(ali);
			return;
		}
		if (idx < 0 || idx > Size()) {
			throw new IndexOutOfBoundsException();
		}

		Node prev = getAtNode(idx - 1);
		Node after = prev.next;
		Node nn = new Node(ali);
		prev.next = nn;
		nn.next = after.next;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}

		if (Size() == 1) {
			int ans = head.data;
			head = null;
			return ans;
		}
		Node second_last = getAtNode(Size() - 2);
		Node last = second_last.next;
		second_last.next = null;
		return last.data;
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("gali hein");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();

		} else if (idx == Size()-1) {
			return removeLast();
		}
		if (idx < 0 || idx >= Size()) {
			throw new IndexOutOfBoundsException();
		}
		Node prev = getAtNode(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;
		
		prev.next = after;
		return curr.data;
	}
}
