package com.rameshify.algorithms;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ramesh Sakibanda
 */
public class SelectionSortTest {
	Comparable[] items;
	Comparable[] expects;

	@org.junit.Before
	public void setUp() throws Exception {
		Integer[] ab = {10, 9, 8, 7, 1, 2, 3};
		Integer[] expected = {1, 2, 3, 7, 8, 9, 10};
		expects = expected;
		items = ab;
	}

	@org.junit.After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void sort() throws Exception {
		assertArrayEquals(expects, new SelectionSort().sort(items));
	}

}