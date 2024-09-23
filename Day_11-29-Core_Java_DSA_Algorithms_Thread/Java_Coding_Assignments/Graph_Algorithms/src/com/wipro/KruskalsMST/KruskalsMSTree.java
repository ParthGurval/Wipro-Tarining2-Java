package com.wipro.KruskalsMST;

import java.util.*;

public class KruskalsMSTree {
	
	static class Edge implements Comparable<Edge>{
		
		int src, dest, weight;
		
		Edge(int src, int dest, int weight){
			
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
		
		public int compareTo(Edge compareEdge) {
			
			return this.weight - compareEdge.weight;
		}
	}
	
	int V;
	List<Edge> edge = new ArrayList<>();
	
	KruskalsMSTree(int V){
		this.V = V;
	}
	
	void addEdge(int src, int dest, int weight) {
		
		edge.add(new Edge(src, dest, weight));
	}
	
	int find(int[] parent, int i) {
		
		if(parent[i] != i) {
			
			parent[i] = find(parent, parent[i]);
		}
		
		return parent[i];	
	}
	
	void union(int[] parent, int[] rank, int x, int y) {
		
		int xroot = find(parent, x);
		int yroot = find(parent, y);
	
		if(rank[xroot] < rank[yroot]) {
			parent[xroot] = yroot;
		}
		
		else if (rank[xroot] > rank[yroot]) {
			parent[yroot] = xroot;
		}
		
		else {
			parent[yroot] = xroot;
			rank[xroot]++;
		}
	}
	
	void KruskalsMSTree() {
		
		Collections.sort(edge);
		
		int[] parent = new int[V];
		int[] rank = new int[V];
		
		for(int i = 0; i < V; i++) {
			
			parent[i] = i;
			rank[i] = 0;
		}
		
		List<Edge> result = new ArrayList<>();
		
		for(Edge e : edge) {
			
			int x = find(parent, e.src);
			int y = find(parent, e.dest);
			
			if(x != y) {
				
				result.add(e);
				union(parent, rank, x, y);				
			}
		}
		
		System.out.println("Edges in the constructing MST: ");
		
		int minimumCost = 0;
		
		for(Edge edge : result) {
			
			System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
			minimumCost += edge.weight;
		}
		
		System.out.println("Minimum Cost Spanning Tree: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int V=4;
		
		KruskalsMSTree graph = new KruskalsMSTree(V);
		
		graph.addEdge(0, 1, 10);
		graph.addEdge(0, 2, 6);
		graph.addEdge(0, 3, 5);
		graph.addEdge(1, 3, 15);
		graph.addEdge(2, 3, 4);
		
		graph.KruskalsMSTree();
		
	}

}
