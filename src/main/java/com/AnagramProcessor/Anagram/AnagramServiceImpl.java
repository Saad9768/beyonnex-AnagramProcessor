package com.AnagramProcessor.Anagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnagramServiceImpl {

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

	public static Set<String> generateAnagrams(String input) {
		Set<String> result = new HashSet<>();
		if (input == null) {
			return result;
		}
		generateAnagramsHelper("", input, result);
		return result;
	}

	private static void generateAnagramsHelper(String prefix, String remaining, Set<String> result) {
		if (remaining.length() == 0) {
			result.add(prefix);
			return;
		}
		for (int i = 0; i < remaining.length(); i++) {
			generateAnagramsHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1),
					result);
		}
	}
}
