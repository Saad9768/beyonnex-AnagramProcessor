package com.AnagramProcessor.Anagram.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.AnagramProcessor.Anagram.service.impl.AnagramChecker;
import com.AnagramProcessor.Anagram.service.impl.AnagramGenerator;

@RestController
public class AnagramController {

	@GetMapping("/anagram/{str1}/{str2}")
	public boolean checkAnagram(@PathVariable("str1") String str1, @PathVariable("str2") String str2) {
		return AnagramChecker.areAnagrams(str1, str2);
	}

	@GetMapping("/anagram/{input}")
	public Set<String> createAnagram(@PathVariable("input") String input) {
		Set<String> response = AnagramGenerator.generateAnagrams(input);
		response.remove(input);
		return response;
	}

}
