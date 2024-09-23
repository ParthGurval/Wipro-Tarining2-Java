package pract.bitwise;

import java.util.Scanner;

public class SetBit {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Please Enter a Number: ");
        int num = sc.nextInt(); // Read the user input
        sc.close(); // Close the Scanner to prevent resource leaks
        
        int count = 0; // Variable to store the count of set bits
        
        // Print initial number
        System.out.println("Initial Number: " + num);
        
        // Loop to count the number of set bits
        while(num > 0) {
            // Print the current state of num and the least significant bit check
            System.out.println("Current Number: " + num + ", LSB Check: " + (num & 1));
            
            count += num & 1; // Check if the least significant bit is set and add to count
            
            num >>= 1; // Right shift the number to process the next bit
            
            // Print the state of num after right shift
            System.out.println("Number after Right Shift: " + num);
        }
        
        // Print the number of set bits
        System.out.print("Number of set bits: " + count);
    }
}


//(Start)
//|
//V
//(Initialize Variables:
// num = 0  // Will store the user input number
// count = 0 // Will store the count of set bits
//)
//|
//V
//(Loop: Get Valid Input from User:
// while input is not valid:
//     try:
//         Read num from user input
//         If valid, set validInput to true
//     catch InputMismatchException:
//         Print error message and clear invalid input
// // This loop ensures that the user inputs a valid integer
//)
//|
//V
//(Loop: Count Set Bits in num:
// while num > 0:
//     count += num & 1 // Increment count if the least significant bit is set
//     num >>= 1        // Right-shift num to process the next bit
// // This loop iterates through all bits of num, counting how many are set (1)
//)
//|
//V
//(Print Result:
// Print "Number of set bits: " followed by the value of count
//)
//|
//V
//(End)
