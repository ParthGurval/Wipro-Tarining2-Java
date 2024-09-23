package com.wipro.SubsetSumBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet2 {

    
    static void findSubsetsWithSum(int[] nums, int target, int index, List<Integer> subset) {
        
        if (target == 0) {
            System.out.println("Subset Found: " + subset);
            return;
        }
        
        
        if (index >= nums.length || target < 0) {
            return;
        }
        
        
        subset.add(nums[index]);
        findSubsetsWithSum(nums, target - nums[index], index + 1, subset);
        
        
        subset.remove(subset.size() - 1);
        
        
        findSubsetsWithSum(nums, target, index + 1, subset);
    }
    
    
    static void subSetSum(int[] nums, int target) {
        List<Integer> subset = new ArrayList<>();
        findSubsetsWithSum(nums, target, 0, subset);
    }

    public static void main(String[] args) {
        int[] nums = {1, 9, 7, 5, 18, 12, 20, 15};
        int target = 35;
        
        
        subSetSum(nums, target);
    }
}

