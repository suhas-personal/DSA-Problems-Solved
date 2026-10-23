package com.prep.arrays.day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public int[] solution(int[] nums, int target) {
		
		Map<Integer, Integer> complementMap = new HashMap<>();
		
		for(int i=0; i<nums.length; i++ ) {
			int complement = target - nums[i];
			
			if(complementMap.containsKey(complement)) {
				return new int [] { i, complementMap.get(complement) };
			}
			complementMap.put(nums[i], i);
		}
		return new int[] {};
	}

	
	
}
