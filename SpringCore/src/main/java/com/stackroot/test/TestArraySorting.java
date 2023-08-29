package com.stackroot.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestArraySorting {

	public static void main(String[] args) {
		int [] nums = {1,-2,1,3,4,7,8};
		
		/*
		 * int min = Arrays.stream(nums) .sorted() .filter(n -> n >=0)
		 * .collect(Collectors.minBy(Comparator.naturalOrder())).get();
		 */
		Arrays
		.stream(nums)
		.sorted()
		.forEach(n -> System.out.println(n));
		
	Arrays.sort(nums);
		List<Integer> list = Arrays
				.stream(nums)
				.sorted()
				.filter(n -> n > 0)
				.boxed()
				.collect(Collectors.toList());
		
		/*
		 * for(int i = 0; i < list.size(); i++) { if(i+1 != list.get(i)) {
		 * System.out.println("smallest positive number = "+i); break; } }
		 */
		int i = 1;
		for(Integer j: list) {
			if(i != j) {
				System.out.println(i);
				break;
			} else i++;
		}
	}

}
