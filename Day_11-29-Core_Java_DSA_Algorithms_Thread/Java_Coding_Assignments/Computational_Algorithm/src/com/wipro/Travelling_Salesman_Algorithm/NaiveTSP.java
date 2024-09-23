package com.wipro.Travelling_Salesman_Algorithm;

import java.util.*;

public class NaiveTSP {

	static int[][] graph = {
	
		   {0, 10, 15, 20},
		   {10, 0, 35, 25},
		   {15, 35, 0, 30},
		   {20, 25, 30, 0}
	};
	
	static int n = graph.length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> path = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			path.add(i);
		}
		
		int[] result = new int[1];
		result[0] = Integer.MAX_VALUE;
		
		permute(path, 0, path.size() - 1, result);
		
		System.out.println("Minimum Cost is: " + result[0]);
		
	}
	
	static void swap(List<Integer> path, int i, int j) {
		
		int temp = path.get(i);
		path.set(i, path.get(j));
		path.set(j, temp);
	}
	
	static int calcCost(List<Integer> path) {
		
		int cost = 0;
		
		for(int i = 0; i < path.size(); i++) {
			
			int from = path.get(i);
			int to = path.get((i + 1) % path.size());
			cost += graph[from][to];
		}
		
		return cost;
	}
	
	static void permute(List<Integer> path, int l, int r, int[] result) {
		
		if(l == r) {
			
			int cost = calcCost(path);
			System.out.println("Checking path: " + path + " with cost: " + cost);
			result[0] = Math.min(result[0], cost);
		}
		
		else {
			
			for(int i = l; i <= r; i++) {
				
				swap(path, l, i);
				permute(path, l + 1, r, result);
				swap(path, l, i);
			}
		}
	}

}
