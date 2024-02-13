package com.AnagramProcessor.Anagram.service.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramCheckerTests {
	@Test
	public void testAreAnagramsTrue() {
		assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
		assertTrue(AnagramChecker.areAnagrams("triangle", "integral"));
	}

	@Test
	public void testAreAnagramsFalse() {
		assertFalse(AnagramChecker.areAnagrams("hello", "world"));
		assertFalse(AnagramChecker.areAnagrams("one", "two"));
	}

	@Test
	public void testAreAnagramsWithNull() {
		assertFalse(AnagramChecker.areAnagrams(null, "abc"));
		assertFalse(AnagramChecker.areAnagrams("abc", null));
		assertFalse(AnagramChecker.areAnagrams(null, null));
	}

}
