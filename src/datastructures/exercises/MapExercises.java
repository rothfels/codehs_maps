package datastructures.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
	
	/** 
	 * The first two exercises will give you familiarity with the basic methods of a map, which are:
	 * 
	 * 		put(key, value): associate a value with a key; we can show this relationship visually as key -> value
	 * 		get(key): return the value associated with a key, or null if none exists
	 * 		keySet(): a list of all the keys in the map
	 * 		values(): a list of all the values in the map
	 * 
	 * Note: the size of a map is the same as the size of keySet() and values(). Like any collection in Java,
	 * you can get the number of items in the a map with the method size().
	 */
	
	
	/**
	 * Creates a new Map whose (key, value) pairs have been flipped.
	 * 
	 * A map like this
	 * 		"harry" -> "sally"
	 * 		"yoda" -> "vader"
	 * has a flipFlop like this
	 * 		"sally" -> "harry"
	 * 		"vader" -> "yoda"
	 * 
	 * Concretely, we take every (key, value) pair in the map and should .put(value, key) in the flipFlopMap.
	 */
	public Map<String, String> flipFlop(Map<String, String> map) {
		Map<String, String> flipFlopMap = new HashMap<String, String>();
		// Add stuff to flipFlopMap.
		return flipFlopMap;
	}
	
	/**
	 * Creates a new Map whose (key, value) pairs also include all (value, key) pairs from the source map.
	 * 
	 * A map like this
	 * 		"harry" -> "sally"
	 * 		"yoda" -> "vader"
	 * has a symmetrized map like this
	 * 		"sally" -> "harry"
	 * 		"harry" -> "sally"
	 * 		"vader" -> "yoda"
	 * 		"yoda" -> "vader"
	 * 
	 * Concretely, we take every (key, value) pair in the map and should .put(value, key) in the flipFlopMap.
	 */
	public Map<String, String> symmetrize(Map<String, String> map) {
		Map<String, String> symmetrizedMap = new HashMap<String, String>();
		// Add stuff to symmetrizedMap.
		return symmetrizedMap;
	}
	
	
	/**
	 * The last exercise asks you to solve a novel problem for which a Map is useful.
	 * Can you figure out how to use a Map effectively?
	 */
	
	
	/**
	 * In addition to just being a plain cool word, a "cipher" is a secret or disguised
	 * way of writing. For example, let's say you want to give your friend the following message:
	 * 
	 * 		I want to want to floss but I never want to
	 * 
	 * But you don't want your dentist to find out about this! So you give your friend the following message instead:
	 *
	 *		1 2 3 2 3 4 5 1 6 2 3
	 *
	 * You tell your friend how to decipher the secret message so he/she can read it, and your message
	 * is kept safe from falling into your dentist's hands! Because even if your dentist finds the message written
	 * on a note or in an email, a bunch of numbers doesn't seem to have much to do with flossing. :)
	 * 
	 * Although there are many ways to create a cipher, here's the idea for this exercise:
	 * 
	 *		- read in a message (a bunch of words which we will store in a list)
	 *		- for each unique word, assign a unique integer (starting at 1)
	 *		- replace the word with its integer
	 *
	 * To decipher a message, replace each integer with its equivalent word.
	 * (Notice this is exactly what we did in the example above to produce 1 2 3 2 3 4 5 1 6 2 3).
	 *
	 * One way to create unique integers is to start somewhere (like 1) and keep incrementing
	 * as long as you need a new number. As long as you don't increment too much you'll guarantee
	 * that you'll never use the same integer twice! (Do you know why incrementing too much might cause problems?)
	 */
	public class Cipher {
		/**
		 * Create instance variables here to use in encrypt / decrypt methods below.
		 * Hint: Map will be useful.
		 */
		int currInt = 1; // Increment to create a new unique integer.
		
		/**
		 * Produce cipher text from a readable message (represented as a list of words).
		 * From the example above:
		 * 		I want to want to floss but I never want to
		 * becomes
		 * 		1 2 3 2 3 4 5 1 6 2 3
		 * 
		 * You should be able to create any number of cipher texts with a single instance of a Cipher.
		 * 
		 * For example, after encrypting the message above we can encrypt:
		 * 		I want bugs to die
		 * which becomes
		 * 		1 2 7 3 8
		 * 
		 * Notice that after the first encrypted message is produced that the second encrypted messages still uses
		 * the number 1 to represent "I", 2 to represent "want", but uses new numbers
		 * (7 and 8) to represents words that were not seen in the first message ("bugs" and "die").
		 */
		public List<Integer> encrypt(List<String> message) {
			List<Integer> secretMessage = new ArrayList<Integer>();
			// Do something.
			return secretMessage;
		}
		
		/**
		 * Reproduce a readable message from a cipher text.
		 */
		public List<String> decrypt(List<Integer> secretMessage) {
			List<String> message = new ArrayList<String>();
			// Do something.
			return message;
		}
	}
	
	// Cipher factory method; don't change anything here.
	public Cipher getCipher() {
		return new Cipher();
	}
}
