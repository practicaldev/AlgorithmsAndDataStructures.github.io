package com.rameshify.algorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Ramesh Sakibanda
 */
public class SelectionSortTest {
	Comparable[] items;
	Comparable[] expects;

	@BeforeEach
	public void setUp() throws Exception {
		Integer[] ab = {10, 9, 8, 7, 1, 2, 3};
		Integer[] expected = {1, 2, 3, 7, 8, 9, 10};
		expects = expected;
		items = ab;
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void sort() throws Exception {
		assertArrayEquals(expects, new SelectionSort().sort(items));
	}

}