package javaConcept;

import java.util.HashMap;

//Q5. Two Sum (VERY IMPORTANT ⭐)
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 13;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int needed = target - nums[i];

			if (map.containsKey(needed)) {
				System.out.println(map.get(needed) + " " + i);
				return;
			}

			map.put(nums[i], i);
		}
	}
}