package com.rameshify.datastructures;

import com.rameshify.framework.Swappable;

public interface Heapify<T extends Comparable<T>> extends Swappable<T> {

	int size = 0;

	/**
	 * Find parent's index
	 * 
	 * @param childIndex
	 * @return parentIndex
	 */
	default int getParentIndex(int childIndex) {
		return (childIndex - 1) >>> 1;
	}
	
	/**
	 * Find left child's index
	 * 
	 * @param parentIndex
	 * @return leftChildIndex
	 */
	default int getLeftChildIndex(int parentIndex) {
		return parentIndex * 2 + 1;
	}

	/**
	 * Find right child's index
	 * 
	 * @param parentIndex
	 * @return rightChildIndex
	 */
	default int getRightChildIndex(int parentIndex) {
		return parentIndex * 2 + 2;
	}

	/**
	 * Has parent.
	 * 
	 * @param childIndex
	 * @return parentIndex
	 */
	default boolean hasParent(int childIndex) {
		return getParentIndex(childIndex) >= 0;
	}

	/**
	 * Has left child.
	 * 
	 * @param childIndex
	 * @return parentIndex
	 */
	default boolean hasLeftChild(int parentIndex) {
		return getLeftChildIndex(parentIndex) <= size;
	}

	/**
	 * Has right child.
	 * 
	 * @param childIndex
	 * @return parentIndex
	 */
	default boolean hasRightChild(int parentIndex) {
		return getRightChildIndex(parentIndex) <= size;
	}

	void heapifyUp();
	void heapifyDown();
	
}
