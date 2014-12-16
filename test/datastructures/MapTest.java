package datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import datastructures.exercises.MapExercises;
import datastructures.exercises.MapExercises.Cipher;
import datastructures.exercises.MapSolutions;

public class MapTest {
	
	/**
	 * Switch which line below is commented to change from your solutions to the sample solutions.
	 */
	// MapExercises exercises = new MapExercises();
	MapExercises exercises = new MapSolutions();

	@Test
	public void flipFlopEmptyMap() {
		Map<String, String> flipFlop = exercises.flipFlop(new HashMap<String, String>());
		assertNotNull(flipFlop);
		assertEquals(0, flipFlop.size());
	}
	
	@Test
	public void flipFlopMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("harry", "sally");
		map.put("vader", "yoda");
		
		Map<String, String> flipFlop = exercises.flipFlop(map);
		assertNotNull(flipFlop);
		assertEquals(2, flipFlop.size());
		assertEquals("harry", flipFlop.get("sally"));
		assertEquals("vader", flipFlop.get("yoda"));
		assertNull(flipFlop.get("harry"));
		assertNull(flipFlop.get("vader"));
	}
	
	@Test
	public void symmetrizeEmptyMap() {
		Map<String, String> symmetrized = exercises.symmetrize(new HashMap<String, String>());
		assertNotNull(symmetrized);
		assertEquals(0, symmetrized.size());
	}
	
	@Test
	public void symmetrizeMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("harry", "sally");
		map.put("vader", "yoda");
		map.put("identity", "identity");
		
		Map<String, String> symmetrized = exercises.symmetrize(map);
		assertNotNull(symmetrized);
		assertEquals(5, symmetrized.size());
		assertEquals("harry", symmetrized.get("sally"));
		assertEquals("vader", symmetrized.get("yoda"));
		assertEquals("sally", symmetrized.get("harry"));
		assertEquals("yoda", symmetrized.get("vader"));
		assertEquals("identity", symmetrized.get("identity"));
	}
	
	@Test
	public void cipher() {
		Cipher c = exercises.getCipher();
		
		List<String> msg1 = new ArrayList<String>();
		msg1.add("I");
		
		List<Integer> cipher1 = c.encrypt(msg1);
		assertEquals(1, cipher1.size());
		assertEquals(1, cipher1.get(0).intValue());
		
		List<String> decrypt1 = c.decrypt(cipher1);
		assertEquals(1, decrypt1.size());
		assertEquals(msg1.get(0), decrypt1.get(0));
		
		List<String> msg2 = new ArrayList<String>();
		for (String str : "I want to want to floss but I never want to".split(" ")) {
			msg2.add(str);
		}		
		List<Integer> expectedCipher = new ArrayList<Integer>();
		for (String str : "1 2 3 2 3 4 5 1 6 2 3".split(" ")) {
			expectedCipher.add(Integer.parseInt(str));
		}
		
		List<Integer> cipher2 = c.encrypt(msg2);
		for (int i = 0; i < expectedCipher.size(); ++i) {
			assertEquals(expectedCipher.get(i), cipher2.get(i));
		}
		
		List<String> decrypt2 = c.decrypt(cipher2);
		for (int i = 0; i < msg2.size(); ++i) {
			assertEquals(msg2.get(i), decrypt2.get(i));
		}		
	}

}
