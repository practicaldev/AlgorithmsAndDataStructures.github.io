package com.rameshify.algorithms;

public class SelectionSort<T extends Comparable<T>> implements Sortable<T> {

	public T[] sort(T[] items) {
		for (int location = 0; location < items.length; location++) {
			T minElement = items[location];
			int minIndex = location;
			for (int index = location + 1; index < items.length; index++) {
				T currentElement = items[index];
				if (currentElement.compareTo(minElement) < 0) {
					minElement = currentElement;
					minIndex = index;
				}
			}
			swap(items, location, minIndex);
		}
		return items;
	}

}
