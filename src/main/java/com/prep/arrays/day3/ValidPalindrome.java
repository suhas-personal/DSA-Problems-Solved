package com.prep.arrays.day3;

public class ValidPalindrome {

	public boolean solution(String s) {
	    
		// convert the string to lower case
		String ls = s.toLowerCase();
		
		int left =0;
		int right = s.length() - 1;
		char [] cArray = ls.toCharArray();
		
		
		// remove all non-alphanumeric characters
		
		while(right>=left) {
			
			
			// check if the char is a-z if not move to next element 
			while(!Character.isLetterOrDigit(cArray[left])) {
				left++;
				if(right<left) {
					break;
				}
			}
			
			// check if the char is a-z if not move to previous element 
			while(!Character.isLetterOrDigit(cArray[right])) {
				right--;
				if(right<left) {
					break;
				}
			}
			
			if(right<left) {
				break;
			}else if(cArray[left] != cArray[right]) {
				return false;
			}
			right--;
			left++;
		}
		
		return true;
    }
}
