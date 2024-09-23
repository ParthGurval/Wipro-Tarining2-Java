package com.wipro.Travelling_Salesman_Algorithm;

import java.util.*;

public class TSPUsingMST {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] graph = {
				
				   {0, 10, 15, 20},
				   {10, 0, 35, 25},
				   {15, 35, 0, 30},
				   {20, 25, 30, 0}
			};
		
		System.out.println("Approximate TSP cost (using MST): " + calcTSPCost(graph));
	}
	
	static int calcTSPCost(int[][] graph) {
		
		int n = graph.length;
		boolean[] visited = new boolean[n];
		int[] key = new int[n];
		int[] parent = new int[n];
		Arrays.fill(key,  Integer.MAX_VALUE);
		key[0] = 0;
		parent[0] = -1;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> key[i]));
		
		pq.add(0);
		
		while(!pq.isEmpty()) {
			
			int u = pq.poll();
			visited[u] = true;
			
			for(int v = 0; v < n; v++) {
				
				if(graph[u][v] != 0 && !visited[v] && graph[u][v] < key[v]) {
					
					key[v] = graph[u][v];
					pq.add(v);
					parent[v] = u;
				}
			}
			
		}
		
		int mstWeight = 0;
		
		for(int i = 1; i < n; i++) {
			
			mstWeight += graph[i][parent[i]];
		}
		
		return 2 * mstWeight;
	}

}
