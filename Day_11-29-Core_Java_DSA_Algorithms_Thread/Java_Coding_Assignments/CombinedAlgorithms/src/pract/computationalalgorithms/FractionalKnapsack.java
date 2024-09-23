package pract.computationalalgorithms;

import java.util.Arrays; // Purpose: Import the Arrays class. Explanation: This is used to sort the array of items.
import java.util.Comparator; // Purpose: Import the Comparator interface. Explanation: This is used to define custom sorting logic for items.

// Purpose: Class representing an item with a value and weight.
// Explanation: Each object of this class will store the value and weight of an item.
class Item {
    int value, weight; // Purpose: Store the value and weight of the item. Explanation: These fields hold the respective values for each item.

    // Purpose: Constructor to initialize the value and weight of the item.
    // Explanation: This constructor takes value and weight as parameters and assigns them to the fields of the class.
    public Item(int value, int weight) {
    	
//    	Purpose: Assigns the value passed as a parameter to the instance variable value of the object.
//    	Explanation: The this keyword refers to the current object. It distinguishes the instance variable value from the parameter value.
        this.value = value;
        
//        Purpose: Assigns the weight passed as a parameter to the instance variable weight of the object.
//        Explanation: Similarly, this.weight refers to the object's instance variable, ensuring it is set to the value provided when the object is created.
        this.weight = weight;
        
//        Why We Use the this Keyword:
//        	Purpose: The this keyword is used in Java to refer to the current object within a method or constructor.
//        	Explanation: When a method or constructor parameter has the same name as an instance variable, the this keyword is used to differentiate 
//        	between the two. It helps the compiler understand that you are referring to the instance variable of the object and not the local variable 
//        	or parameter.
    }
}

// Purpose: Class that contains the logic for solving the Fractional Knapsack problem.
// Explanation: The main logic of the Fractional Knapsack problem is implemented in this class.
public class FractionalKnapsack {

    // Purpose: Function to calculate the maximum value we can obtain with the given knapsack capacity.
    // Explanation: This function takes an array of items and the knapsack capacity and returns the maximum value that can be obtained.
    static double getMaxValue(Item[] items, int capacity) {
        // Purpose: Sort items by value-to-weight ratio in descending order.
        // Explanation: A comparator is used to compare items based on their value-to-weight ratio. The items array is sorted in descending order based on this ratio.
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            // Purpose: Compare two items based on value-to-weight ratio.
            // Explanation: This method compares two items and sorts them such that items with higher value-to-weight ratios come first.
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight; // Purpose: Calculate ratio for item o1. Explanation: The ratio of value to weight is computed for the first item.
                double r2 = (double) o2.value / o2.weight; // Purpose: Calculate ratio for item o2. Explanation: The ratio of value to weight is computed for the second item.
                return Double.compare(r2, r1); // Purpose: Compare the two ratios. Explanation: The item with the higher ratio should appear first in the sorted order.
            }
        });

        double totalValue = 0.0; // Purpose: Initialize the total value collected. Explanation: This variable will store the cumulative value of items added to the knapsack.
        
        // Purpose: Loop through the sorted items.
        // Explanation: Iterate over each item in the sorted array to determine how much of it can be added to the knapsack.
        for (Item item : items) {
            if (capacity - item.weight >= 0) {
                // Purpose: Check if the item can fit entirely in the knapsack.
                // Explanation: If the remaining capacity is greater than or equal to the item's weight, the item can be fully added to the knapsack.
                capacity -= item.weight; // Purpose: Reduce the capacity of the knapsack. Explanation: The item's weight is subtracted from the remaining capacity of the knapsack.
                totalValue += item.value; // Purpose: Increase the total value collected. Explanation: The full value of the item is added to the total value.
            } else {
                // Purpose: If only part of the item can fit, take the fraction that fits.
                // Explanation: If the item can't be fully added to the knapsack, calculate the fraction of the item's value that corresponds to the remaining capacity.
                double fraction = ((double) capacity / item.weight); // Purpose: Calculate the fraction of the item that can fit. Explanation: The remaining capacity is divided by the item's weight to determine the fraction.
                totalValue += (item.value * fraction); // Purpose: Add the fractional value to the total. Explanation: The fractional value of the item is added to the total value.
                break;  // Purpose: Exit the loop as the knapsack is full. Explanation: No more capacity left, so the loop is terminated.
            }
        }

        return totalValue; // Purpose: Return the total value obtained. Explanation: The function returns the maximum value that can be carried in the knapsack.
    }

    public static void main(String[] args) {
        // Purpose: Array of items with their respective values and weights.
        // Explanation: Define an array of items that will be used as input to the getMaxValue function.
        Item[] items = {
            new Item(60, 10), // Purpose: Create an item with value 60 and weight 10. Explanation: This item object is instantiated and added to the array.
            new Item(100, 20), // Purpose: Create an item with value 100 and weight 20. Explanation: This item object is instantiated and added to the array.
            new Item(120, 30)  // Purpose: Create an item with value 120 and weight 30. Explanation: This item object is instantiated and added to the array.
        };
        
        int capacity = 50; // Purpose: Knapsack capacity. Explanation: The total weight capacity of the knapsack is set to 50 units.

        // Purpose: Get the maximum value that can be obtained.
        // Explanation: The getMaxValue function is called with the items array and the knapsack capacity. It returns the maximum value that can be obtained.
        double maxValue = getMaxValue(items, capacity);
        
        // Purpose: Print the result.
        // Explanation: The maximum value that can be carried in the knapsack is printed to the console.
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}


//		Here’s a structured flowchart diagram for the `FractionalKnapsack` class, which outlines the step-by-step process for solving the Fractional Knapsack problem:
//		
//		(Start)
//		   |
//		   V
//		(Initialize items array and knapsack capacity)
//		   |
//		   V
//		(Call getMaxValue with items array and knapsack capacity)
//		   |
//		   V
//		(Inside getMaxValue:
//		   |
//		   V
//		   (Sort items by value-to-weight ratio in descending order)
//		      |
//		      V
//		      (Inside sorting logic:
//		         |
//		         V
//		         (Compare two items based on their value-to-weight ratio)
//		            |
//		            V
//		            (Calculate ratio for item o1 and item o2)
//		            |
//		            V
//		            (Sort items with higher ratios first)
//		   |
//		   V
//		   (Initialize totalValue as 0.0)
//		   |
//		   V
//		   (Loop through sorted items)
//		      |
//		      V
//		      (For each item:
//		         |
//		         V
//		         (Check if item can fit entirely in the knapsack)
//		            |
//		            V
//		            (If yes:
//		               |
//		               V
//		               (Reduce knapsack capacity by item's weight)
//		               |
//		               V
//		               (Increase totalValue by item's value)
//		            |
//		            V
//		            (If no:
//		               |
//		               V
//		               (Calculate fraction of item that can fit)
//		               |
//		               V
//		               (Increase totalValue by fractional value)
//		               |
//		               V
//		               (Break loop as knapsack is full)
//		   |
//		   V
//		(Return totalValue)
//		   |
//		   V
//		(Print maximum value obtained)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		2. **Initialize Items Array and Knapsack Capacity**:
//		   - Define an array `items` with `Item` objects, each having a value and weight.
//		   - Set the `capacity` of the knapsack.
//		3. **Call `getMaxValue`**:
//		   - Begin the process of calculating the maximum value obtainable by calling `getMaxValue()` with the `items` array and `capacity`.
//		4. **Inside `getMaxValue`**:
//		   - **Sort Items**:
//		     - **Sort by Value-to-Weight Ratio**: Use a `Comparator` to sort items based on their value-to-weight ratio in descending order.
//		     - **Compare Items**: For each pair of items, compute the value-to-weight ratio and sort accordingly.
//		   - **Initialize `totalValue`**: Start with a total value of 0.0.
//		   - **Loop Through Sorted Items**:
//		     - **For Each Item**:
//		       - **Check if Item Can Fit Entirely**:
//		         - **If Yes**:
//		           - **Reduce Capacity**: Subtract the item's weight from the remaining knapsack capacity.
//		           - **Increase Total Value**: Add the item's value to `totalValue`.
//		         - **If No**:
//		           - **Calculate Fraction**: Determine how much of the item can fit based on the remaining capacity.
//		           - **Increase Total Value**: Add the fractional value of the item to `totalValue`.
//		           - **Break Loop**: Exit the loop since the knapsack is full.
//		5. **Return `totalValue`**: Return the calculated maximum value that can be obtained.
//		6. **Print Maximum Value Obtained**: Output the maximum value to the console.
//		7. **End**: Finish the execution of the program.
//		
//		This flowchart provides a clear visualization of how the Fractional Knapsack problem is solved using sorting based on value-to-weight ratios and then filling the knapsack in a greedy manner.