package com.wipro.JobSequencing_problem;

import java.util.*;

public class JobSquencingAlgo {
	
	static class job{
		
		int id;
		int deadline;
		int profit;
		
		public job(int id, int deadline, int profit) {
			
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		job[] jobs = {
				
				new job(1, 2, 20),
		        new job(2, 2, 60),
		        new job(3, 1, 40),
		        new job(4, 3, 100),
		        new job(5, 4, 80)
		};
		
		System.out.println("Maximum Profit from job is: " + maxProfit(jobs));
	}
	
	static int maxProfit(job[] jobs) {
		
		Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
		
		int n = jobs.length;
		
		int maxDeadLine = 4;
		
		for(job j: jobs) {
			
			maxDeadLine = Math.max(maxDeadLine, j.deadline);
		}
		
		boolean[] slot = new boolean[maxDeadLine];
		int[] jobSeq = new int[maxDeadLine];
		
		int totProfit = 0;
		
		for(job j: jobs) {
			
			for(int k = Math.min(maxDeadLine - 1, j.deadline - 1); k >= 0; k--) {
				
				if(!slot[k]) {
					
					slot[k] = true;
					jobSeq[k] = j.id;
					totProfit += j.profit;
					break;
				}
			}
		}
		
		System.out.print("Job Sequemce: ");
		
		for(int i = 0; i < maxDeadLine; i++) {
			
			if(slot[i]) {
				
				System.out.print("Job " + jobSeq[i] + " ");
			}
		}
		
		System.out.println();
		
		return totProfit;
	}
	

}
