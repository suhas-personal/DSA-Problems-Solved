package com.prep.arrays.day2;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public boolean solution(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		int [] sCountArray = new int[26]; 
		int [] tCountArray = new int[26]; 
		
		
		for(Character ch: s.toCharArray()) {
			sCountArray[ch - 'a'] += 1; 
		}
		
		for(Character ch: t.toCharArray()) {
			tCountArray[ch - 'a'] += 1; 
		}
		
		for(int i=0; i<sCountArray.length; i++) {
			if(sCountArray[i]!= tCountArray[i]) {
				return false;
			}
		}
		
		return true;
		
	}
}
