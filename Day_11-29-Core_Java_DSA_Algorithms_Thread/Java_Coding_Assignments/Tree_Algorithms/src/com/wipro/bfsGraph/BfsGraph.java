package com.wipro.bfsGraph;

import java.util.*;


public class BfsGraph {
	
	public static void bfSearch(int startNode, List<List<Integer>> graph) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		boolean[] visited = new boolean[graph.size()];
		
		queue.add(startNode);
		visited[startNode] = true;
		
		while(!queue.isEmpty()) {
			
			int node = queue.poll();
			System.out.print(node + " ");
			
			for(int neighbor : graph.get(node)) {
				
				if(!visited[neighbor]) {
					
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i = 0; i < 7; i++) {
			
			graph.add(new ArrayList<>());
		}
		
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
		
		
		System.out.print("BFS Staring from Node 0: ");
		bfSearch(0, graph);
		
	}

}
