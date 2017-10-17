/**
 * 
 */
package com.rameshify.datastructures;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author u121433
 *
 */

@FixMethodOrder(MethodSorters.JVM)
public class TrieTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Trie trie;

	@Before
	public void setUp() throws Exception {
		trie = new Trie();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
		trie.insert("a");
		trie.insert("aa");
		trie.insert("aaa");
		trie.insert("aaaa");
		trie.insert("aaaaa");
		assertNotNull(trie);
	}

	@Test
	public void testLookup() {
		trie.insert("a");
		trie.insert("aa");
		trie.insert("aaa");
		trie.insert("aaaa");
		trie.insert("aaaaa");
		List<String> find = trie.lookup("a");
		System.out.println(find);
		assertNotNull(find);
	}

	@Test
	public void testPrefixCount() {
		trie.insert("a");
		trie.insert("aa");
		trie.insert("aaa");
		trie.insert("aaaa");
		trie.insert("aaaaa");
		int prefixCount = trie.getPrefixCount("aaaaa");
		System.out.println(prefixCount);
	}

}
