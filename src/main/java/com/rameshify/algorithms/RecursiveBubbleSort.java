package com.rameshify.algorithms;

/**
 * @author Ramesh Sakibanda
 */
public class RecursiveBubbleSort<T extends Comparable<T>> implements Sortable<T> {
	@Override
	public T[] sort(T[] items) {
		return recursiveSort(items, items.length);
	}

	public T[] recursiveSort(T[] items, int max) {
		if (max <= 1) {
			return items;
		}
		for (int index = 0; index < max - 1; index++) {
			if (items[index].compareTo(items[index + 1]) > 0) {
				swap(items, index, index + 1);
			}
		}
		return recursiveSort(items, --max);
	}
}
