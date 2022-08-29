package Lec_33;

import java.util.Stack;

public class LinkedList <P> {
	class Node {
		P data;
		Node next;

		Node(P d) {
			data = d;
		}
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
//			System.out.print(temp.data+" ");
			temp = temp.next;
			count++;
		}
//		System.out.println();
		return count;
	}

	public P getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		return head.data;
	}

	public P getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public P getAt(int idx) {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	public void addLast(P data) {
		Node nn = new Node(data);

		if (isEmpty()) {
			head = nn;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
//		now temp.next is null!! so temp is the last Node!!
		temp.next = nn;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(P data) {
		Node nn = new Node(data);
		nn.next = head;

		head = nn;
	}

	public void addAt(P data, int idx) {
		if (idx == 0) {
			addFirst(data);
		} else if (idx == size()) {
			addLast(data);
		} else {

			Node prev = getNode(idx - 1);
			Node Next = prev.next;

			Node nn = new Node(data);

			prev.next = nn;
			nn.next = Next;
		}
	}

	public P removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public P removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		} else if (size() == 1) {
			P ans = head.data;
			head = null;
			return ans;

		}
		Node nn = getNode(size() - 2);
		P ans = nn.next.data;
		nn.next = null;
		return ans;
	}

	public P removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else {
			Node nn = getNode(idx - 1);
			P ans = nn.next.data;
			nn.next = nn.next.next;
			return ans;
		}

	}

	private Node getNode(int idx) {
		if (isEmpty() || idx >= size()) {
			throw new RuntimeException("Kaha deekh rha hein!?");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}	
}
