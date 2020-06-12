package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Day12_InsertDeleteGetRandom {

}

class RandomizedSet {

	ArrayList<Integer> nums;
	HashMap<Integer, Integer> map;

	/** Initialize your data structure here. */
	public RandomizedSet() {
		nums = new ArrayList<Integer>();
		map = new HashMap<Integer, Integer>();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		if (map.containsKey(val)) {
			return false;
		}

		// Add the value to map
		map.put(val, nums.size());
		// Add the value to list
		nums.add(val);
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		if (!map.containsKey(val)) {
			return false;
		}

		int loc = map.get(val);

		// If it is not the last one, then swap the last one with this val
		if (loc < nums.size() - 1) {
			int lastElement = nums.get(nums.size() - 1);
			nums.set(loc, lastElement);
			map.put(lastElement, loc);
		}
		map.remove(val);
		nums.remove(nums.size() - 1);

		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Random rand = new Random();
		return nums.get(rand.nextInt(nums.size()));
	}
}