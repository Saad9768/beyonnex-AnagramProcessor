package com.AnagramProcessor.Anagram.service.impl;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
	public static boolean areAnagrams(String text1, String text2) {
		if (text1 == null || text2 == null) {
			return false;
		}
		if (text1.length() != text2.length()) {
			return false;
		}

		Map<Character, Integer> countMap = new HashMap<>();
		for (char ch : text2.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}
		for (char ch : text1.toCharArray()) {
			int count = countMap.getOrDefault(ch, 0);
			if (count == 0) {
				return false;
			}
			countMap.put(ch, count - 1);
		}
		return true;
	}
}
