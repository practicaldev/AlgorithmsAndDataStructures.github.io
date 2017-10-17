package com.rameshify.algorithms;

/**
 * @author Ramesh Sakibanda
 */
public class BubbleSort<T extends Comparable<T>> implements Sortable<T> {
	@Override
	public T[] sort(T[] items) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int index = 0; index < items.length - 1; index++) {
				if (items[index].compareTo(items[index + 1]) > 0) {
					swap(items, index, index + 1);
					sorted = false;
				}
			}
		}
		return items;
	}
}
