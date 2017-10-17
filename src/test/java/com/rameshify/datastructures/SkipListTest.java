package com.rameshify.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SkipListTest {

	
	private SkipList<Integer> linkedList;


	@BeforeEach
	public void setUp(){
		linkedList = new SkipList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
	}
	
	
	@Test
	public void testAdd() {
		System.out.println(linkedList);
	}

}
