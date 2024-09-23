package com.wipro.dfsGraph;

import java.util.*;

public class DfsGraph {
	
	public static void dfsGraph(int node, boolean[] visited, List<List<Integer>> graph) {
		
		visited[node] = true;
		System.out.print(node + " ");
		
		for(int neighbor : graph.get(node)) {
			
			if(!visited[neighbor]) {
				
				dfsGraph(neighbor, visited, graph);
			}
		}
	}
	
	public static void main(String[] args) {
		
		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i = 0; i < 7; i++) {
			
			graph.add(new ArrayList<>());
			
			graph.get(0).add(1);
			graph.get(0).add(2);
			
			graph.get(1).add(0);
			graph.get(1).add(3);
			graph.get(1).add(4);
			
			graph.get(2).add(1);
			graph.get(2).add(5);
			graph.get(2).add(6);
			
			graph.get(3).add(1);
			graph.get(4).add(1);
			
			graph.get(5).add(2);
			graph.get(6).add(2);
			
			
			System.out.print("DFS Staring from Node 0: ");
			
			boolean[] visited = new boolean[graph.size()];
			
			dfsGraph(0, visited, graph);
		}
		
	}

}
