package datastructures.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSolutions extends MapExercises {
	
	@Override
	public Map<String, String> flipFlop(Map<String, String> map) {
		Map<String, String> flipFlopMap = new HashMap<String, String>();
		for (String key : map.keySet()) {
			String value = map.get(key);
			flipFlopMap.put(value, key);
		}
		return flipFlopMap;
	}
	
	@Override
	public Map<String, String> symmetrize(Map<String, String> map) {
		Map<String, String> symmetrizedMap = new HashMap<String, String>();
		for (String key : map.keySet()) {
			String value = map.get(key);
			symmetrizedMap.put(key, value);
			symmetrizedMap.put(value, key); // Same as the method above, just add this!
		}
		return symmetrizedMap;
	}
	
	public class CipherSolution extends Cipher {
		int currInt = 1; // Increment to create a new unique integer.
		
		Map<String, Integer> encryptMap = new HashMap<String, Integer>();
		Map<Integer, String> decryptMap = new HashMap<Integer, String>();

		@Override
		public List<Integer> encrypt(List<String> message) {
			List<Integer> secretMessage = new ArrayList<Integer>();
			for (String word : message) {
				Integer encryptedValue = encryptMap.get(word);
				if (encryptedValue == null) {
					// First time we're seeing the word. Add an encrypted value association to our maps.
					encryptedValue = currInt;
					++currInt; // Increment so we use a new value for the next new word that is seen.

					encryptMap.put(word, encryptedValue);
					decryptMap.put(encryptedValue, word);
				}
				secretMessage.add(encryptedValue);
			}
			return secretMessage;
		}
		
		@Override
		public List<String> decrypt(List<Integer> secretMessage) {
			List<String> message = new ArrayList<String>();
			for (Integer encryptedValue : secretMessage) {
				// Find the word associated with the encryptedValue in the decryptMap.
				message.add(decryptMap.get(encryptedValue));
			}
			return message;
		}
	}

	@Override
	public Cipher getCipher() {
		return new CipherSolution();
	}
}
