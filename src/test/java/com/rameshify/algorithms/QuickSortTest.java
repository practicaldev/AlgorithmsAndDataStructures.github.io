package com.rameshify.algorithms;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ramesh Sakibanda
 */
public class QuickSortTest {
	Comparable[] items;
	Comparable[] expects;

	@org.junit.Before
	public void setUp() throws Exception {
		Integer[] ab = { 25, 10, 8, 6, 7, 4, 5, 2, 3, 1, 9 };
		Integer[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25 };
		expects = expected;
		items = ab;
	}

	@org.junit.After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void sort() throws Exception {
		assertArrayEquals(expects, new QuickSort().sort(items));
	}
}