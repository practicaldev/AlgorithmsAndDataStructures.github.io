package com.rameshify.algorithms;

/**
 * @author Ramesh Sakibanda
 */
public interface Sortable<T extends Comparable<T>> {

	T[] sort(T[] items);

	default void swap(T[] items, int thisIndex, int thatIndex) {
		T temp = items[thatIndex];
		items[thatIndex] = items[thisIndex];
		items[thisIndex] = temp;
	}
}
