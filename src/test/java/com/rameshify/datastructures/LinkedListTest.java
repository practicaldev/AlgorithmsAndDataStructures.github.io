package com.rameshify.datastructures;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	
	private LinkedList<Integer> linkedList;


	@Before
	public void setUp(){
		linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(10);
		linkedList.add(2);
		linkedList.add(20);
		linkedList.add(3);
		linkedList.add(30);
	}
	
	
	@Test
	public void testAdd() {
		System.out.println(linkedList);
	}

}
