/**
 * 
 */
package com.rameshify.datastructures;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.*;

/**
 * @author u121433
 *
 */

//@FixMethodOrder(MethodSorters.JVM)
public class TrieTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	private Trie trie;

	@BeforeEach
	public void setUp() throws Exception {
		trie = new Trie();
	}

	@AfterEach
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
		List<String> find = trie.search("a");
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
