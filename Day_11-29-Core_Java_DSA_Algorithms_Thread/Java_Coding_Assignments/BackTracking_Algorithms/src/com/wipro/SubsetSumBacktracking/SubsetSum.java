package com.wipro.SubsetSumBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
	
	static boolean subSetSoln(int[] nums, int target, int index, List<Integer> subset) {
		
		if(target == 0) {
			
			System.out.println("Subset Found: " + subset);
			return true;
		}
		
		if(index >= nums.length || target < 0) {
			
			return false;
		}
		
		subset.add(nums[index]);
		if(subSetSoln(nums, target - nums[index], index + 1, subset)) {
			
			return true;
		}
		
		subset.remove(subset.size() - 1);
		
		return subSetSoln(nums, target, index + 1, subset);
	}
	
	static boolean subSetSum(int[] nums, int target) {
		
		List<Integer> subset = new ArrayList<>();
		
		return subSetSoln(nums, target, 0, subset);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3, 34, 4, 12, 5, 2};
		
		int target = 9;
		
		if(!subSetSum(nums, target)) {
			
			System.out.println("No Subset with sum: " + target);
		}

	}

}
