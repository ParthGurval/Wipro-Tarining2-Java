package pract.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSetSum {

    // Modified function to find all subsets with the given sum
	/* 
	 * This is a static method used to find all subsets within the array nums that sum up to the target.
		Parameters:
		int[] nums: The input array containing integers.
		int target: The target sum that the subsets should equal.
		int index: The current index in the array to consider for the subset.
		List<Integer> subset: The current subset being formed.
	 * 
	 */
    static void findSubsetsWithSum(int[] nums, int target, int index, List<Integer> subset) {
        
    	
    	// If the target is 0, print the current subset	
//      This condition checks if the target sum has been achieved (i.e., reduced to 0).
//      If so, it prints the current subset and returns, ending this branch of recursion.
        if (target == 0) {
            System.out.println("Subset Found: " + subset);
            return;
        }
        
        
        // Base case: if index is out of bounds or target is negative, return
//        This checks two conditions:
//        	If the index is beyond the last element of the array (index >= nums.length), which means all elements have been considered.
//        	If the target becomes negative (target < 0), indicating the subset has exceeded the desired sum.
//        	In either case, the method returns without further processing.
        if (index >= nums.length || target < 0) {
            return;
        }
        
        // Include the current number in the subset and continue
//        This step includes the current number (nums[index]) in the subset.
//        It then recursively calls findSubsetsWithSum with the updated target (decreasing it by the current number) and moves to the next index (index + 1).
        subset.add(nums[index]);
        findSubsetsWithSum(nums, target - nums[index], index + 1, subset);
        
        // Backtrack: remove the number and move to the next
//        After exploring the path where the current number is included, this line removes the last added number from the subset.
//        This is the backtracking step, allowing the algorithm to explore the path where the current number is excluded.
        subset.remove(subset.size() - 1);
        
        // Exclude the current number and continue with the next index
//        After backtracking, this line explores the path where the current number is not included in the subset.
//        It calls findSubsetsWithSum with the same target but moves to the next index (index + 1).
        findSubsetsWithSum(nums, target, index + 1, subset);
    }
    
    // Function to start the subset search
//    This method initializes the process by creating an empty list (subset) to store the subsets.
//    It then calls findSubsetsWithSum with the initial parameters (nums, target, starting index 0, and the empty subset).
    static void subSetSum(int[] nums, int target) {
        List<Integer> subset = new ArrayList<>();
        findSubsetsWithSum(nums, target, 0, subset);
    }

//    The main method is the entry point of the program.
//    It initializes an array nums and a target sum target.
//    The method subSetSum is then called to find and print all subsets of nums that sum up to the target.
    public static void main(String[] args) {
        int[] nums = {1, 9, 7, 5, 18, 12, 20, 15};
        int target = 35;
        
        // Call the function to find all subsets with the given sum
        subSetSum(nums, target);
    }
}

//This code uses backtracking to explore all possible subsets of an array and prints the ones that sum to a specified target.
//Key techniques include recursion, subset generation, and backtracking to explore different subset combinations efficiently.


//
//List<Integer>: 
//	This is an interface in Java from the java.util package that represents a list, which is an ordered collection of elements. 
//	The elements in the list are of type Integer, which means the list will store integers.
//
//subset: 
//	This is the name of the variable that will hold the reference to the list. 
//	In this case, subset is a variable that references a list of integers.
//
//new ArrayList<>(): 
//	This creates a new instance (object) of the ArrayList class, which is a specific implementation of the List interface. 
//	ArrayList is a resizable array, meaning it can grow as needed to accommodate new elements.
//	
	



//		Certainly! Below is a structured flowchart diagram for the `SubSetSum` class, which outlines the step-by-step process for finding all subsets within an array that sum up to a target value:
//		
//		(Start)
//		   |
//		   V
//		(Initialize array and target)
//		   |
//		   V
//		(Call subSetSum with the input array and target)
//		   |
//		   V
//		(Inside subSetSum:
//		   |
//		   V
//		   (Create an empty list 'subset')
//		   |
//		   V
//		   (Call findSubsetsWithSum with initial parameters (nums, target, index 0, and empty subset))
//		      |
//		      V
//		      (Inside findSubsetsWithSum:
//		         |
//		         V
//		         (Base Case 1: Check if target is 0)
//		            |
//		            V
//		            (If true, print "Subset Found" with current subset and return)
//		         |
//		         V
//		         (Base Case 2: Check if index is out of bounds or target is negative)
//		            |
//		            V
//		            (If true, return without further processing)
//		         |
//		         V
//		         (Include current number (nums[index]) in the subset)
//		            |
//		            V
//		            (Recursively call findSubsetsWithSum with updated target (target - nums[index]) and next index (index + 1))
//		         |
//		         V
//		         (Backtrack: Remove the last added number from the subset)
//		         |
//		         V
//		         (Exclude current number and recursively call findSubsetsWithSum with the same target and next index (index + 1))
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		1. **Start**: Begin the execution of the program.
//		2. **Initialize Array and Target**:
//		   - Define the array `nums` with integer values and the `target` sum to find subsets for.
//		3. **Call `subSetSum`**:
//		   - Begin the subset sum search by calling the `subSetSum()` method with the `nums` array and `target`.
//		4. **Inside `subSetSum`**:
//		   - **Create an Empty List**: Initialize `subset` as an empty `ArrayList` to store potential subsets.
//		   - **Call `findSubsetsWithSum`**: Start finding subsets by calling `findSubsetsWithSum()` with initial parameters: the array `nums`, the `target`, starting index `0`, and the empty `subset`.
//		5. **Inside `findSubsetsWithSum`**:
//		   - **Base Case 1**: Check if the `target` is 0.
//		     - **If True**: Print the current subset as a valid subset and return to end this branch of recursion.
//		   - **Base Case 2**: Check if the `index` is out of bounds (i.e., `index >= nums.length`) or the `target` is negative.
//		     - **If True**: Return without further processing.
//		   - **Include Current Number**: Add `nums[index]` to the current subset.
//		     - **Recursively Call**: Try to find subsets including this number by calling `findSubsetsWithSum()` with updated parameters (reduced `target`, next index).
//		   - **Backtrack**: Remove the last added number from the subset (backtrack).
//		   - **Exclude Current Number**: Explore the path where `nums[index]` is not included in the subset.
//		     - **Recursively Call**: Try to find subsets excluding this number by calling `findSubsetsWithSum()` with the same `target` and next index.
//		6. **End**: Finish the execution of the program.
//		
//		This flowchart outlines the recursive approach used to find all subsets of a given array that sum up to a specified target. It handles both inclusion and exclusion of each element to explore all possible subsets.