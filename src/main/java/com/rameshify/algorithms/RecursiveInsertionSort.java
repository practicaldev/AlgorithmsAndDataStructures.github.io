package com.rameshify.algorithms;

/**
 * Created by Tanishq on 8/27/17.
 */
public class RecursiveInsertionSort<T extends Comparable<T>> implements Sortable<T> {
	@Override
	public T[] sort(T[] items) {
		return recursiveSort(items, 0);
	}

	private T[] recursiveSort(T[] items, int n) {
		if (n == items.length) {
			return items;
		}
		T currentElement = items[n];
		// assume current element is at the right location per sorted order.
		int location = n;
		// check our assumption by comparing with previous element and swap if out of order
		// keep doing until we find right location
		while (location > 0 && currentElement.compareTo(items[location - 1]) < 0) {
			swap(items, location, location - 1);
			location--;
		}
		// we found correct placed in sorted order
		if (location != n) {
			items[location] = currentElement;
		}
		return recursiveSort(items, n + 1);
	}
}
