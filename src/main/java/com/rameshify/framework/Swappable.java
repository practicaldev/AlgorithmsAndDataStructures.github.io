package com.rameshify.framework;

import java.util.List;

/**
 * Swaps elements at given indices.
 * @author Ramesh Sakibanda
 *
 * @param <T> any Type
 */
public interface Swappable<T> {
	/**
	 * Swaps array items at indices provided.
	 * @param items
	 * @param thisIndex
	 * @param thatIndex
	 */
	default void swap(T[] items, int thisIndex, int thatIndex) {
		T temp = items[thatIndex];
		items[thatIndex] = items[thisIndex];
		items[thisIndex] = temp;
	}

	/**
	 * Swaps list items at indices provided.
	 * @param items list of items
	 * @param thisIndex
	 * @param thatIndex
	 */
	default void swap(List<T> items, int thisIndex, int thatIndex) {
		T thatElement = items.get(thatIndex);
		items.set(thatIndex, items.get(thisIndex));
		items.set(thisIndex, thatElement);
	}
}
