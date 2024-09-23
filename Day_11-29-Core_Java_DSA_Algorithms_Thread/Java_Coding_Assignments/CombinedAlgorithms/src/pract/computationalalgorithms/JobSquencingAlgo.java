package pract.computationalalgorithms;

import java.util.*;

public class JobSquencingAlgo {

    // Purpose: Define a static inner class to represent a job with an ID, deadline, and profit.
    static class job {

        int id;       // Purpose: Store the job ID
        int deadline; // Purpose: Store the job's deadline
        int profit;   // Purpose: Store the profit associated with the job

        // Purpose: Constructor to initialize a job with an ID, deadline, and profit
        public job(int id, int deadline, int profit) {
            this.id = id;           // Explanation: Assign the parameter id to the instance variable id
            this.deadline = deadline; // Explanation: Assign the parameter deadline to the instance variable deadline
            this.profit = profit;   // Explanation: Assign the parameter profit to the instance variable profit
        }
    }

    public static void main(String[] args) {
        // Purpose: Entry point of the program. Creates an array of job objects and calculates the maximum profit.

        // Purpose: Create an array of jobs with ID, deadline, and profit
        job[] jobs = {
            new job(1, 2, 20),   // Explanation: Create a job with ID 1, deadline 2, and profit 20
            new job(2, 2, 60),   // Explanation: Create a job with ID 2, deadline 2, and profit 60
            new job(3, 1, 40),   // Explanation: Create a job with ID 3, deadline 1, and profit 40
            new job(4, 3, 100),  // Explanation: Create a job with ID 4, deadline 3, and profit 100
            new job(5, 4, 80)    // Explanation: Create a job with ID 5, deadline 4, and profit 80
        };

        // Purpose: Call maxProfit method to calculate the maximum profit and print the result
        System.out.println("Maximum Profit from job is: " + maxProfit(jobs));
    }

    // Purpose: Calculate the maximum profit by scheduling jobs within their deadlines
    static int maxProfit(job[] jobs) {
        // Parameters: jobs - Array of job objects containing ID, deadline, and profit

        // Purpose: Sort the jobs based on profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit); // Explanation: Sort jobs so that the job with the highest profit comes first

        int n = jobs.length; // Purpose: Get the total number of jobs
        int maxDeadLine = 4; // Purpose: Set an initial value for the maximum deadline

        // Purpose: Find the maximum deadline among all jobs
        for (job j : jobs) {
            maxDeadLine = Math.max(maxDeadLine, j.deadline); // Explanation: Update maxDeadLine with the highest deadline found
        }

        // Purpose: Initialize an array to track whether a time slot is filled
        boolean[] slot = new boolean[maxDeadLine]; // Explanation: Array to mark available time slots for jobs
        // Purpose: Initialize an array to store the job sequence
        int[] jobSeq = new int[maxDeadLine]; // Explanation: Array to keep track of the job IDs in the selected sequence

        int totProfit = 0; // Purpose: Initialize total profit

        // Purpose: Iterate through each job to schedule it in the available slot
        for (job j : jobs) {
            // Purpose: Check slots starting from the last possible slot to the earliest available
            for (int k = Math.min(maxDeadLine - 1, j.deadline - 1); k >= 0; k--) {
                if (!slot[k]) { // Explanation: If the slot is available, assign the job to this slot
                    slot[k] = true;   // Purpose: Mark the slot as filled
                    jobSeq[k] = j.id; // Purpose: Store the job ID in the sequence array
                    totProfit += j.profit; // Purpose: Add the profit of the job to the total profit
                    break; // Explanation: Break the loop once the job is scheduled
                }
            }
        }

        // Purpose: Print the job sequence that leads to maximum profit
        System.out.print("Job Sequence: ");

        // Purpose: Loop through the job sequence array to print the selected jobs
        for (int i = 0; i < maxDeadLine; i++) {
            if (slot[i]) { // Explanation: Print the job ID if the slot is filled
                System.out.print("Job " + jobSeq[i] + " ");
            }
        }

        System.out.println(); // Purpose: Move to a new line after printing the job sequence

        return totProfit; // Purpose: Return the total profit obtained from the job sequence
    }
}


//		Here’s a structured flowchart diagram for the `JobSequencingAlgo` class, which outlines the step-by-step process for solving the Job Sequencing Problem:
//		
//		(Start)
//		   |
//		   V
//		(Initialize array of jobs with ID, deadline, and profit)
//		   |
//		   V
//		(Call maxProfit with jobs array)
//		   |
//		   V
//		(Inside maxProfit:
//		   |
//		   V
//		   (Sort jobs by profit in descending order)
//		      |
//		      V
//		      (Inside sorting logic:
//		         |
//		         V
//		         (Compare two jobs based on their profit)
//		            |
//		            V
//		            (Sort jobs with higher profit first)
//		   |
//		   V
//		   (Initialize maxDeadline with a default value)
//		   |
//		   V
//		   (Find the maximum deadline among all jobs)
//		      |
//		      V
//		      (Loop through each job:
//		         |
//		         V
//		         (Update maxDeadline with the highest deadline found)
//		   |
//		   V
//		   (Initialize slot array to track filled time slots)
//		   |
//		   V
//		   (Initialize jobSeq array to store job sequence)
//		   |
//		   V
//		   (Initialize totalProfit to 0)
//		   |
//		   V
//		   (Loop through each job to schedule it)
//		      |
//		      V
//		      (For each job:
//		         |
//		         V
//		         (Check slots from the latest to earliest available)
//		            |
//		            V
//		            (If slot is available:
//		               |
//		               V
//		               (Mark slot as filled)
//		               |
//		               V
//		               (Store job ID in jobSeq)
//		               |
//		               V
//		               (Add job profit to totalProfit)
//		               |
//		               V
//		               (Break loop after scheduling job)
//		   |
//		   V
//		   (Print job sequence leading to maximum profit)
//		      |
//		      V
//		      (Loop through jobSeq to print job IDs)
//		   |
//		   V
//		   (Print total profit obtained from job sequence)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		2. **Initialize Array of Jobs**:
//		   - Define an array `jobs` with `job` objects, each having an ID, deadline, and profit.
//		3. **Call `maxProfit`**:
//		   - Begin the process of calculating the maximum profit by calling `maxProfit()` with the `jobs` array.
//		4. **Inside `maxProfit`**:
//		   - **Sort Jobs**:
//		     - **Sort by Profit**: Use a comparator to sort jobs based on their profit in descending order.
//		     - **Compare Jobs**: For each pair of jobs, compare their profit and sort accordingly.
//		   - **Initialize `maxDeadline`**: Set a default value for the maximum deadline.
//		   - **Find Maximum Deadline**:
//		     - **Loop Through Jobs**:
//		       - **Update `maxDeadline`**: Find the highest deadline among all jobs.
//		   - **Initialize Slot Array**:
//		     - **Track Filled Time Slots**: Create an array to mark available time slots for jobs.
//		   - **Initialize `jobSeq` Array**:
//		     - **Store Job Sequence**: Create an array to keep track of the job IDs in the selected sequence.
//		   - **Initialize `totalProfit`**: Start with a total profit of 0.
//		   - **Loop Through Jobs to Schedule**:
//		     - **For Each Job**:
//		       - **Check Slots**:
//		         - **If Slot is Available**:
//		           - **Mark Slot as Filled**: Assign the job to the available slot.
//		           - **Store Job ID**: Record the job ID in the `jobSeq` array.
//		           - **Add Job Profit**: Increase `totalProfit` by the job's profit.
//		           - **Break Loop**: Exit the loop after scheduling the job.
//		5. **Print Job Sequence**:
//		   - **Loop Through `jobSeq`**:
//		     - **Print Job IDs**: Display the job IDs in the selected sequence.
//		6. **Print Total Profit**: Output the total profit obtained from the job sequence.
//		7. **End**: Finish the execution of the program.
//		
//		This flowchart provides a clear visualization of how the Job Sequencing Problem is solved by sorting jobs based on profit, scheduling them in available time slots, and calculating the maximum profit achievable.
