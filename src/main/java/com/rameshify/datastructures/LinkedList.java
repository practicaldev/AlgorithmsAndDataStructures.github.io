package com.rameshify.datastructures;

public class LinkedList<T extends Comparable<T>> {
	class Node {
		public Node(T item) {
			value = item;
		}
		T value;
		Node next;
	}
	Node head;
	Node last;

	public LinkedList() {
		head = new Node(null);
		last = head;
	}
	public void add(T item) {
		last.next = new Node(item);
		last = last.next;
	}
}
