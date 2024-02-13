package com.AnagramProcessor.Anagram.service.impl;

import java.util.HashSet;
import java.util.Set;

public class AnagramGenerator {
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
