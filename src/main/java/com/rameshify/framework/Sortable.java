package com.rameshify.framework;

/**
 * @author Ramesh Sakibanda
 */
public interface Sortable<T extends Comparable<T>> extends Swappable<T> {

	T[] sort(T[] items);

}
