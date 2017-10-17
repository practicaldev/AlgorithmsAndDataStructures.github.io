package com.rameshify.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

public class ArrayListTest {

	List<Integer> list;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
		list = new ArrayList<>();
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
		assertEquals(0, list.size());
		list.add(1);
		assertEquals(1, list.size());
		list.add(2);
		assertEquals(2, list.size());
		list.remove();
		assertEquals(1, list.size());
		list.remove();
		assertEquals(0, list.size());
	}

	@Test
	public void testGet() {
		assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
			list.get(0);
		});
		list.add(1);
		assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
			list.get(1);
		});
		assertEquals((Integer) 1, list.get(0));
		list.add(2);
		assertEquals((Integer) 2, list.get(1));
		list.add(3);
		assertEquals((Integer) 3, list.get(2));
		list.add(4);
		assertEquals((Integer) 4, list.get(3));
		list.add(5);
		assertEquals((Integer) 5, list.get(4));
		list.add(6);
		assertEquals((Integer) 6, list.get(5));
		list.add(7);
		assertEquals((Integer) 7, list.get(6));
		list.add(8);
		assertEquals((Integer) 8, list.get(7));
		list.add(9);
		assertEquals((Integer) 9, list.get(8));
		list.add(10);
		assertEquals((Integer) 10, list.get(9));
	}

	@Test
	public void testAdd() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
	}

	@Test
	public void testRemove() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);

		assertEquals((Integer) 12, list.remove());
		assertEquals((Integer) 11, list.remove());
		assertEquals((Integer) 10, list.remove());
		assertEquals((Integer) 9, list.remove());
		assertEquals((Integer) 8, list.remove());
		assertEquals((Integer) 7, list.remove());
		assertEquals((Integer) 6, list.remove());
		assertEquals((Integer) 5, list.remove());
		assertEquals((Integer) 4, list.remove());
		assertEquals((Integer) 3, list.remove());
		assertEquals((Integer) 2, list.remove());
		assertEquals((Integer) 1, list.remove());
		assertThrows(IllegalStateException.class, ()->{
			list.remove();
		});
	}

}
