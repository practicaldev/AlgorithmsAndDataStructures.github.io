package com.rameshify.datastructures;

public class ArrayList<T extends Comparable<T>> implements List<T> {

	private static final int INITIAL_CAPACITY = 10;
	int capacity;
	int size;
	T[] items;

	@SuppressWarnings("unchecked")
	public ArrayList() {
		capacity = INITIAL_CAPACITY;
		items = (T[]) new Comparable[capacity];
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		this.capacity = capacity;
		items = (T[]) new Comparable[this.capacity];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public T get(int index) {
		int maxIndex = size-1;
		if (index > maxIndex) {
			throw new ArrayIndexOutOfBoundsException("Invalid index "+index+". Valid range (0, "+maxIndex+") inclusive.");
		}
		return items[index];
	}

	@Override
	public void add(T item) {
		ensureCapacity();
		items[size++] = item;
	}

	private void ensureCapacity() {
		float occupancy = (size * 100.0f) / capacity;
		if (occupancy >= 70.0f) {
			capacity = capacity * 2;
			@SuppressWarnings("unchecked")
			T[] copy = (T[]) new Comparable[capacity];
			System.arraycopy(items, 0, copy, 0, size);
			items = copy;
		}

	}

	@Override
	public T remove() {
		if (size <= 0) {
			throw new IllegalStateException("Cannot remove from empty list.");
		}
		T item = items[size - 1];
		items[--size] = null;
		return item;
	}

	@Override
	public void add(int i, T item) {
		ensureCapacity();
//		System.arraycopy(src, srcPos, dest, destPos, length);
	}

	@Override
	public void set(int index, T item) {
		items[index] = item;		
	}

}
