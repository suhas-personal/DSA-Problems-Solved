package com.prep.arrays.day1;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	 public boolean solution(int[] nums) {
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        for(int i=0;i<nums.length;i++) {
	        	int count = map.getOrDefault(nums[i], 0);
	        	if (count > 0) {
	        		return true;
	        	}
	        	map.put(nums[i], count+1);
	        }
	        return false;
	    }
}
