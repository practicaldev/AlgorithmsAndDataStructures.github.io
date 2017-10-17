package com.rameshify.datastructures;

public abstract class Heap<T extends Comparable<T>> implements Heapify<T> {

	/** Current array length **/
    protected int capacity;
    /** Current number of elements in Heap **/
    protected int size;
    /** Array of Heap elements **/
    protected T[] items;

    @SuppressWarnings("unchecked")
	public Heap() {
        this.capacity = 10;
        this.size = 0;
        this.items = (T[]) new Comparable[capacity];
    }
	
}
