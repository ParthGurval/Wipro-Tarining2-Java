package com.wipro.bellManFordAlgo;

import java.util.*;

public class BellManFordAlgo {

	class Edge {
		
		int src, dest, weight;
		Edge(int src, int dest, int weight){
			
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}
	
	int V, E;
	Edge[] edges;
	
	BellManFordAlgo(int v, int e){
		
		V = v;
		E = e;
		
		edges = new Edge[E];
		
		for(int i = 0; i < e; i++) {
			
			edges[i] = new Edge(0, 0, 0);
		}
	}
	
	void BellManFord(int src){
		
		int[] dist = new int[V];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[src] = 0;
		
		for(int i = 0; i < V; i++) {
			
			for(int j = 0; j < E; j++) {
				
				int u = edges[j].src;
				int v = edges[j].dest;
				int weight = edges[j].weight;
				
				if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
					
					dist[v] = dist[u] + weight;
				}
			}
		}
		
		for(int j = 0; j < E; j++) {
			
			int u = edges[j].src;
			int v = edges[j].dest;
			int weight = edges[j].weight;
			
			if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
				
				System.out.println("Graph Contains Negative weight cycle");
				return;
			}
		}
		
		displaySoln(dist);
	}
	
	void displaySoln(int[] dist) {
		
		System.out.println("Vertex Distance From Source ");
		
		for(int i = 0; i < V; i++) {
			
			System.out.println(i + " \t\t " + dist[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 5;
		int E = 8;
		
		BellManFordAlgo bmfa = new BellManFordAlgo(V, E);
		
		bmfa.edges[0] = bmfa.new Edge(0, 1, -1);
		bmfa.edges[1] = bmfa.new Edge(0, 2, 4);
		bmfa.edges[2] = bmfa.new Edge(1, 2, 3);
		bmfa.edges[3] = bmfa.new Edge(1, 3, 2);
		bmfa.edges[4] = bmfa.new Edge(1, 4, 2);
		bmfa.edges[5] = bmfa.new Edge(3, 2, 5);
		bmfa.edges[6] = bmfa.new Edge(3, 1, 1);
		bmfa.edges[7] = bmfa.new Edge(4, 3, -3);
		
		bmfa.BellManFord(0);
	}

}
