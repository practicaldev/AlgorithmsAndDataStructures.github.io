package com.rameshify.algorithms;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ramesh Sakibanda
 */
public class MergeSortTest {
	Comparable[] items;
	Comparable[] expects;

	@org.junit.Before
	public void setUp() throws Exception {
		Integer[] ab = { 10, 8, 6, 7, 4, 5, 2, 3, 1, 9, 45, 12, 45, 78, 12, 812, 781, 891, 8913, 12, 56791, 8798, 1,
				879 };
		Integer[] expected = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12, 12, 45, 45, 78, 781, 812, 879, 891, 8798, 8913,
				56791 };
		expects = expected;
		items = ab;
	}

	@org.junit.After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void sort() throws Exception {
		assertArrayEquals(expects, new MergeSort().sort(items));
	}
}