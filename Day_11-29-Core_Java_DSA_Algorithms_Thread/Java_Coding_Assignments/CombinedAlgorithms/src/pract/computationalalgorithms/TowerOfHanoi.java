package pract.computationalalgorithms;

public class TowerOfHanoi {

    // Purpose: Solve the Tower of Hanoi problem using recursion
    // Parameters:
    //   - int n: The number of disks to move
    //   - char fromRod: The rod from which the disk is to be moved
    //   - char toRod: The rod to which the disk is to be moved
    //   - char auxRod: The auxiliary rod used for temporary storage
    static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {

        // Purpose: Base case for the recursion, handle the simplest case where only one disk is to be moved
        if (n == 1) {
            // Explanation: If there is only one disk, move it directly from the source rod to the target rod
            System.out.println("Moving Disk 1 from rod " + fromRod + " to rod " + toRod);
            return; // Purpose: End the recursion for this branch as the disk has been moved
        }

        // Purpose: Recursively move n-1 disks from the source rod to the auxiliary rod using the target rod as a temporary storage
        solveHanoi(n - 1, fromRod, auxRod, toRod); // Explanation: Move the top n-1 disks to the auxiliary rod

        // Purpose: Move the nth disk (largest) from the source rod to the target rod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Purpose: Recursively move the n-1 disks from the auxiliary rod to the target rod using the source rod as a temporary storage
        solveHanoi(n - 1, auxRod, toRod, fromRod); // Explanation: Move the n-1 disks from the auxiliary rod to the target rod
    }

    public static void main(String[] args) {
        // Purpose: Main method to start the execution of the Tower of Hanoi solution

        int numDisk = 3; // Purpose: Define the number of disks to be moved in the Tower of Hanoi problem
        System.out.println("Tower of Hanoi has " + numDisk + " Disks");

        // Purpose: Call the solveHanoi method to solve the Tower of Hanoi problem for the given number of disks
        solveHanoi(numDisk, 'A', 'C', 'B'); // Explanation: Start the process of moving the disks from rod A to rod C using rod B as auxiliary
    }

}

//		Here’s a structured flowchart diagram for the `TowerOfHanoi` class, which outlines the step-by-step process for solving the Tower of Hanoi problem using recursion:
//		
//		(Start)
//		   |
//		   V
//		(Define the solveHanoi() method to solve the Tower of Hanoi problem)
//		   |
//		   V
//		(In solveHanoi():
//		   |
//		   V
//		   (Check if n == 1 (Base Case))
//		      |
//		      V
//		      (If true:
//		         |
//		         V
//		         (Print "Moving Disk 1 from rod fromRod to rod toRod")
//		         |
//		         V
//		         (Return to end the recursion)
//		   |
//		   V
//		   (If false:
//		      |
//		      V
//		      (Recursively move n-1 disks from fromRod to auxRod using toRod as auxiliary)
//		         |
//		         V
//		         (Call solveHanoi(n - 1, fromRod, auxRod, toRod))
//		      |
//		      V
//		      (Print "Move disk n from rod fromRod to rod toRod")
//		      |
//		      V
//		      (Recursively move n-1 disks from auxRod to toRod using fromRod as auxiliary)
//		         |
//		         V
//		         (Call solveHanoi(n - 1, auxRod, toRod, fromRod))
//		   |
//		   V
//		(End of solveHanoi())
//		   |
//		   V
//		(In main():
//		   |
//		   V
//		   (Define the number of disks numDisk)
//		   |
//		   V
//		   (Print "Tower of Hanoi has numDisk Disks")
//		   |
//		   V
//		   (Call solveHanoi(numDisk, 'A', 'C', 'B'))
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		2. **Define `solveHanoi()` Method**:
//		   - **Purpose**: Solve the Tower of Hanoi problem using recursion.
//		   - **Parameters**:
//		     - `int n`: The number of disks to move.
//		     - `char fromRod`: The rod from which the disk is to be moved.
//		     - `char toRod`: The rod to which the disk is to be moved.
//		     - `char auxRod`: The auxiliary rod used for temporary storage.
//		3. **Inside `solveHanoi()` Method**:
//		   - **Check if `n == 1` (Base Case)**:
//		     - **If True**:
//		       - **Print Move**: Display the move of the single disk from `fromRod` to `toRod`.
//		       - **Return**: End the recursion for this branch.
//		   - **If False**:
//		     - **Recursively Move `n-1` Disks**:
//		       - **Move to Auxiliary Rod**: Call `solveHanoi(n - 1, fromRod, auxRod, toRod)` to move the top `n-1` disks to `auxRod`.
//		     - **Move the nth Disk**:
//		       - **Print Move**: Display the move of the nth disk from `fromRod` to `toRod`.
//		     - **Recursively Move `n-1` Disks to Target Rod**:
//		       - **Move to Target Rod**: Call `solveHanoi(n - 1, auxRod, toRod, fromRod)` to move the `n-1` disks from `auxRod` to `toRod`.
//		4. **End of `solveHanoi()` Method**: Completion of the Tower of Hanoi problem solving for the current recursive call.
//		5. **Inside `main()` Method**:
//		   - **Define Number of Disks**:
//		     - **Set `numDisk`**: Specify the number of disks to solve the Tower of Hanoi problem.
//		   - **Print Disks**:
//		     - **Display**: Print the number of disks.
//		   - **Call `solveHanoi()`**:
//		     - **Start Solution**: Initiate the Tower of Hanoi solution process by calling `solveHanoi(numDisk, 'A', 'C', 'B')`.
//		6. **End**: Completion of the Tower of Hanoi program execution.