package com.rameshify.algorithms.practice;

public class QuickSort {
	public void sort(int[] items) {
		quickSort(items, 0, items.length - 1);
	}

	private void quickSort(int[] items, int i, int j) {
		if (i >= j) {
			return;
		}
		int p = partition(items, i, j);
		quickSort(items, i, p - 1);
		quickSort(items, p + 1, j);
	}

	private int partition(int[] items, int i, int j) {
		int pivot = items[j];
		int p = i;

		while (i < j) {
			if (items[i] < pivot) {
				swap(items, p, i);
				p++;
			}
			i++;
		}
		if (pivot < items[p]) {
			swap(items, p, j);
		}
		return p;
	}

	private void swap(int[] items, int thisIndex, int thatIndex) {
		int temp = items[thatIndex];
		items[thatIndex] = items[thisIndex];
		items[thisIndex] = temp;
	}

	public static void main(String[] args) {
		int[] items = { 10, 8, 6, 4, 2, 0, 1, 3, 5, 7, 9 };
		new QuickSort().sort(items);
		for (int i = 0; i < items.length; i++) {
			System.out.print(items[i] + " ");
		}
	}
}
