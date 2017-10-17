package com.rameshify.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Trie {
	class TrieNode {
		private char c;
		List<String> words = new ArrayList<>();

		public TrieNode(char c) {
			this.c = c;
		}

		TrieNode[] children = new TrieNode[26];
		public int wordCount = 1;
		public boolean endOfWord;
	}

	TrieNode root;

	public Trie() {
		root = new TrieNode(' ');
	}

	public void insert(String word) {
		word = toLowerCase(word);
		TrieNode current = root;
		for (int index = 0; index < word.length(); index++) {
			char c = word.charAt(index);
			if (current.children[getIndex(c)] == null) {
				current.children[getIndex(c)] = new TrieNode(c);
			}
			current = current.children[getIndex(c)];
			current.words.add(word.substring(index + 1));
			current.wordCount++;
		}
		current.endOfWord = true;
	}

	private int getIndex(char c) {
		return c - 'a';
	}

	public List<String> search(String lookup) {
		lookup = toLowerCase(lookup);
		TrieNode current = root;
		List<String> results = new ArrayList<>();
		String prefix = "";
		for (int index = 0; index < lookup.length(); index++) {
			char c = lookup.charAt(index);
			if (current.children[getIndex(c)] == null) {
				return results;
			}
			prefix += current.children[getIndex(c)].c;
			current = current.children[getIndex(c)];
		}
		List<String> words = current.words;
		for (String word : words) {
			results.add(prefix + word);
		}
		return results;
	}

	private String toLowerCase(String something) {
		return something.toLowerCase();
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("app");
		trie.insert("application");
		trie.insert("appliance");
		trie.insert("apiary");
		trie.insert("king");
		trie.insert("kilometer");
		trie.insert("kingfisher");
		trie.insert("kingfisher");
		trie.insert("Kite");
		System.out.println(trie);
		System.out.println(trie.search("k"));
	}
}
