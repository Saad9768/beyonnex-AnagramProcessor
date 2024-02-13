package com.AnagramProcessor.Anagram.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class AnagramGeneratorTests {

	@Test
	public void testGenerateAnagrams() {
		Set<String> anagrams = AnagramGenerator.generateAnagrams("abc");
		assertEquals(6, anagrams.size()); // For a string of length 3, there should be 3! = 6 permutations
		assertTrue(anagrams.contains("abc"));
		assertTrue(anagrams.contains("acb"));
		assertTrue(anagrams.contains("bac"));
		assertTrue(anagrams.contains("bca"));
		assertTrue(anagrams.contains("cab"));
		assertTrue(anagrams.contains("cba"));
	}

	@Test
	public void testGenerateAnagramsEmptyString() {
		Set<String> anagrams = AnagramGenerator.generateAnagrams("");
		assertEquals(1, anagrams.size());
		assertTrue(anagrams.contains(""));
	}

	@Test
	public void testGenerateAnagramsWithNull() {
		Set<String> anagrams = AnagramGenerator.generateAnagrams(null);
		assertTrue(anagrams.isEmpty());
	}
}
