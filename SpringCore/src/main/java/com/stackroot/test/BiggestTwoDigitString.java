package com.stackroot.test;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class BiggestTwoDigitString {

	public static void main(String[] args) {
		String input = "50552";
		
		Set<Integer> nums = new HashSet();
		String number = "";
		for(int i =0; i+1 <= input.length()-1; i++) {
			number = String.valueOf(input.charAt(i)) + String.valueOf(input.charAt(i+1));
			nums.add(Integer.valueOf(number));
		}
		OptionalInt result = nums.stream().filter(n -> n >0).mapToInt(v -> v).max();
		System.out.println(result.getAsInt());
	
	}

}
