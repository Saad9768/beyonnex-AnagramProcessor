package com.AnagramProcessor.Anagram.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class AnagramServiceImplTest {

	@Test
	public void testAreAnagramsTrue() {
		assertTrue(AnagramServiceImpl.areAnagrams("listen", "silent"));
		assertTrue(AnagramServiceImpl.areAnagrams("triangle", "integral"));
	}

	@Test
	public void testAreAnagramsFalse() {
		assertFalse(AnagramServiceImpl.areAnagrams("hello", "world"));
		assertFalse(AnagramServiceImpl.areAnagrams("one", "two"));
	}

	@Test
	public void testAreAnagramsWithNull() {
		assertFalse(AnagramServiceImpl.areAnagrams(null, "abc"));
		assertFalse(AnagramServiceImpl.areAnagrams("abc", null));
		assertFalse(AnagramServiceImpl.areAnagrams(null, null));
	}

	@Test
	public void testGenerateAnagrams() {
		Set<String> anagrams = AnagramServiceImpl.generateAnagrams("abc");
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
		Set<String> anagrams = AnagramServiceImpl.generateAnagrams("");
		assertEquals(1, anagrams.size());
		assertTrue(anagrams.contains(""));
	}

	@Test
	public void testGenerateAnagramsWithNull() {
		Set<String> anagrams = AnagramServiceImpl.generateAnagrams(null);
		assertTrue(anagrams.isEmpty());
	}
}
