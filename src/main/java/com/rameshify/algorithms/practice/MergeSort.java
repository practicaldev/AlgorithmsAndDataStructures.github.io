package com.rameshify.algorithms.practice;

public class MergeSort {
	public int[] sort(int[] items) {
		return mergeSort(items, new int[items.length], 0, items.length - 1);
	}

	private int[] mergeSort(int[] items, int[] sorted, int left, int right) {
		if (left >= right) {
			return items;
		}
		int mid = (left + right) / 2;
		mergeSort(items, sorted, left, mid);
		mergeSort(items, sorted, mid + 1, right);
		return merge(items, sorted, left, mid, right);
	}

	private int[] merge(int[] items, int[] sorted, int leftStart, int leftEnd, int rightEnd) {
		int rightStart = leftEnd + 1;
		int left = leftStart;
		int right = rightStart;
		int index = left;
		while (left <= leftEnd && right <= rightEnd) {
			if (items[left] <= items[right]) {
				sorted[index++] = items[left++];
			} else {
				sorted[index++] = items[right++];
			}
		}
		System.arraycopy(items, left, sorted, index, leftEnd - left + 1);
		System.arraycopy(items, right, sorted, index, rightEnd - right + 1);
		System.arraycopy(sorted, leftStart, items, leftStart, rightEnd - leftStart + 1);
		return items;
	}

	public static void main(String[] args) {
		int[] items = new int[] { 10, 9, 7, 8, 6, 5, 3, 4, 2, 0, 1 };
		new MergeSort().sort(items);
		for (int index = 0; index < items.length; index++) {
			int j = items[index];
			System.out.print(j + " ");
		}
	}

}
