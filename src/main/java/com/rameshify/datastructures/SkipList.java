package com.rameshify.datastructures;

public class SkipList<T extends Comparable<T>> extends LinkedList<T>{

	public void add(T item) {
		if(last.value != null && item.compareTo(last.value)<0){
			throw new IllegalArgumentException("Element cannot be less than last element ("+last.value+")");
		}
		super.add(item);
	}
}
