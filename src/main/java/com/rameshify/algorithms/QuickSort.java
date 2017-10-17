package com.rameshify.algorithms;

public class QuickSort<T extends Comparable<T>> implements Sortable<T> {

	@Override
	public T[] sort(T[] items) {
		quickSort(items, 0, items.length - 1);
		return items;
	}

	private void quickSort(T[] items, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		int p = partition(items, lo, hi);
		quickSort(items, lo, p - 1);
		quickSort(items, p + 1, hi);
	}

	private int partition(T[] items, int i, int j) {
		T pivot = items[j];
		int p = i - 1;

		while (i < j) {
			if (items[i].compareTo(pivot) < 0) {
				p++;
				swap(items, i, p);
			}
			i++;
		}
		if (pivot.compareTo(items[p + 1]) < 0) {
			swap(items, p + 1, i);
		}
		return p + 1;
	}

}
