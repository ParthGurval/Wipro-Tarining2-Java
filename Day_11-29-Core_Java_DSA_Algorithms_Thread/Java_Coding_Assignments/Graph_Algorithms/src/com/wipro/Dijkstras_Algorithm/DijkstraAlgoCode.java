package com.wipro.Dijkstras_Algorithm;

import java.util.*;

public class DijkstraAlgoCode {
	
	public static int[] dijkstra(int[][] graph, int source) {
		
		int n = graph.length;
		
		int[] dist = new int[n];
		
		boolean[] visited = new boolean[n];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source] = 0;
		
		for(int i = 0; i < n - 1; i++) {
			
			int u = minDist(dist, visited);
			
			visited[u] = true;
			
			for(int v = 0; v < n; v++) {
				
				if(!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
					
					dist[v] = dist[u] + graph[u][v];
				}
			}
		}
		
		return dist;
	}
	
	public static int minDist(int[] dist, boolean[] visited) {
		
		int min = Integer.MAX_VALUE, minIndex = -1;
		
		for(int v = 0; v < dist.length; v++) {
			
			if(!visited[v] && dist[v] <= min) {
				min = dist[v];
				minIndex = v;
			}
		}
		
		return minIndex;
	}
	
	public static void displaySoln(int[] dist) {
		
		System.out.println("Vertex \t\t Distance from source");
		
		for(int i =0; i < dist.length; i++) {
			System.out.println(i + " \t\t " + dist[i]);
		}
	}
	
	public static int shortestPath(int[] dist, int node) {
		
		return dist[node];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = {
	            {0, 4, 0, 0, 0, 0, 0, 8, 0},
	            {4, 0, 8, 0, 0, 0, 0, 11, 0},
	            {0, 8, 0, 7, 0, 4, 0, 0, 2},
	            {0, 0, 7, 0, 9, 14, 0, 0, 0},
	            {0, 0, 0, 9, 0, 10, 0, 0, 0},
	            {0, 0, 4, 14, 10, 0, 2, 0, 0},
	            {0, 0, 0, 0, 0, 2, 0, 1, 6},
	            {8, 11, 0, 0, 0, 0, 1, 0, 7},
	            {0, 0, 2, 0, 0, 0, 6, 7, 0}
	        };
		
		int[] totDist = dijkstra(graph, 0);
		
		displaySoln(totDist);
		
		int tgtNode = 4;
		
		System.out.println("\nShortest Distance from node 0: " + tgtNode + " is: " + shortestPath(totDist, tgtNode));
	}

}
