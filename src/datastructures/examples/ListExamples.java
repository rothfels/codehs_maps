package datastructures.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	/**
	 * Counts the number of words in a list which begin with the provided letter.
	 * You may assume that each word in the list has at least one letter.
	 * The first char of a String can be accessed like this:
	 * 
	 *		String s = "hello, world";
	 *		char firstLetter = s.charAt(0);
	 */
	int countBeginningWithLetter(char letter, List<String> words) {
		int count = 0;
		for (String word : words) {
			if (word.charAt(0) == letter) {
				++count;
			}
		}
		return count;
	}
	
	/**
	 * Creates a new list of strings whose order is reversed.
	 */
	List<String> reverse(List<String> list) {
		List<String> newList = new ArrayList<String>();
		for (int i = list.size(); i >= 0; --i) {
			String curr = list.get(i);
			newList.add(curr);
		}
		return newList;
	}
	
	/**
	 * Counts the number of words which are duplicated in a list.
	 */
	int countDuplicates(List<String> words) {
		List<String> duplicates = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			if (duplicates.contains(word)) continue; // We've already counted this duplicate.
			// Find words at all *other* indices and look for a duplicate.
			for (int j = 0; j < words.size(); j++) {
				if (i == j) continue; // Skip what's next when we're looking at the same index.
				String otherWord = words.get(j);
				if (word.equals(otherWord)) {
					duplicates.add(word);
					break;
				}
			}
		}
		return duplicates.size();
	}

}
