package datastructures.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExamples {
	
	/**
	 * The types of crushes that you can make to score in a game of Candy Crush.
	 * Yummy! Each crush scores a different number of points.
	 *
	 */
	enum CandyCrushType {
		THREE_IN_A_ROW,
		FOUR_IN_A_ROW,
		FIVE_IN_A_ROW,
		L_SHAPE,
		T_SHAPE
	}
	
	/**
	 * This function creates a Map that associates a point value with each
	 * different kind of crush listed above.
	 * 
	 * We use this map to answer a question like "how many points does a 5-in-a-row score"?
	 */
	Map<CandyCrushType, Integer> candyCrushPoints() {
		Map<CandyCrushType, Integer> pointMap = new HashMap<CandyCrushType, Integer>();
		pointMap.put(CandyCrushType.THREE_IN_A_ROW, 10);
		pointMap.put(CandyCrushType.FOUR_IN_A_ROW, 20);
		pointMap.put(CandyCrushType.FIVE_IN_A_ROW, 30);
		pointMap.put(CandyCrushType.L_SHAPE, 25);
		pointMap.put(CandyCrushType.T_SHAPE, 25);
		return pointMap;
	}
	
	/**
	 * Computes the total score received in a game of Candy Crush for a given list of
	 * crushes completed during the game.
	 */
	int computeTotalCandyCrushScore(List<CandyCrushType> crushes) {
		int total = 0;
		for (CandyCrushType crush : crushes) {
			// Find the point value associated with the crush we're currently looking at and add to total.
			total += candyCrushPoints().get(crush);
		}
		return total;
	}
	
	/**
	 * Counts the number of words which are duplicated in a list.
	 * This version is different from the countDuplicates() we wrote
	 * in the ListExamples.
	 * 
	 * Can you explain why this solution is better?
	 */
	int countDuplicates(List<String> words) {
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		for (String word : words) {
			Integer currCount = wordCounts.get(word);
			if (currCount == null) { // We haven't seen the word before because nothing comes out of our map.
				wordCounts.put(word, 1);
			} else {
				wordCounts.put(word, currCount + 1);
			}
		}
		
		int duplicates = 0;
		for (Integer count : wordCounts.values()) {
			if (count > 1) {
				++duplicates;
			}
		}
		return duplicates;
	}

}
