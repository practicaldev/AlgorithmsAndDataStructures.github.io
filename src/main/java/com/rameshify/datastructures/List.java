package com.rameshify.datastructures;

public interface List<T extends Comparable<T>> {
	int size();

	T get(int index);

	void add(T item);

	void add(int i, T item);
	
	void set(int i, T item);

	T remove();
}
