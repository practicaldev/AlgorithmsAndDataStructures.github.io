package com.rameshify.algorithms;

/**
 * Created by Tanishq on 8/27/17.
 */
public class InsertionSort<T extends Comparable<T>> implements Sortable<T> {
	@Override
	public T[] sort(T[] items) {

		for (int index = 0; index < items.length; index++) {
			T currentElement = items[index];
			// assume current element is at the right location per sorted order.
			int location = index;
			// check our assumption by comparing with previous element and swap if out of order
			// keep doing until we find right location
			while (location > 0 && currentElement.compareTo(items[location - 1]) < 0) {
				swap(items, location, location - 1);
				location--;
			}
			// we found correct placed in sorted order
			if (location != index) {
				items[location] = currentElement;
			}
		}
		return items;
	}
}
