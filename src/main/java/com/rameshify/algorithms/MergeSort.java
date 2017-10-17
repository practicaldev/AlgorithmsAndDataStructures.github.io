package com.rameshify.algorithms;

/**
 * @author Ramesh Sakibanda
 */
public class MergeSort<T extends Comparable<T>> implements Sortable<T> {

	public T[] sort(T[] items) {
		@SuppressWarnings("unchecked")
		T[] sorted = (T[]) new Comparable[items.length];
		return mergeSort(items, sorted, 0, items.length - 1);
	}

	private T[] mergeSort(T[] items, T[] sorted, int start, int end) {
		if (start >= end) {
			return items;
		}
		int mid = (start + end) / 2;

		mergeSort(items, sorted, start, mid);
		mergeSort(items, sorted, mid + 1, end);
		merge(items, sorted, start, mid, end);

		return items;
	}

	private T[] merge(T[] items, T[] sorted, int leftStart, int leftEnd, int rightEnd) {
		prettyPrint(items, leftStart, leftEnd, leftEnd + 1, rightEnd);
		int left = leftStart;
		int right = leftEnd + 1;
		int index = leftStart;
		while (left <= leftEnd && right <= rightEnd) {
			if (items[left].compareTo(items[right]) <= 0) {
				sorted[index++] = items[left++];
			} else if (items[right].compareTo(items[left]) < 0) {
				sorted[index++] = items[right++];
			}
		}
		System.arraycopy(items, left, sorted, index, leftEnd - left + 1);
		System.arraycopy(items, right, sorted, index, rightEnd - right + 1);
		System.arraycopy(sorted, leftStart, items, leftStart, rightEnd - leftStart + 1);
		prettyPrint(items, leftStart, leftEnd, leftEnd + 1, rightEnd);
		return items;
	}

	private void prettyPrint(T[] items, int left, int leftEnd, int right, int rightEnd) {
		System.out.print("| ");
		while (left <= leftEnd) {
			System.out.print(String.format("%2d | ", items[left]));
			left++;
		}
		System.out.print(" | ");
		while (right <= rightEnd) {
			System.out.print(String.format("%2d | ", items[right]));
			right++;
		}
		System.out.println("\n------------------------------------------------------------------");
	}
}
