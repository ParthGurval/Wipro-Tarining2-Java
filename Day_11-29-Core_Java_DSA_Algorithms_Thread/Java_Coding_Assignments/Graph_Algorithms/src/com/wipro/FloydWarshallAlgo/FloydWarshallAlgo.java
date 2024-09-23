package com.wipro.FloydWarshallAlgo; 

public class FloydWarshallAlgo {
	
	final static int INF = 99999;
	
	void floydWarshall(int graph[][], int V) {
		
		int dist[][] = new int[V][V];
		
		for(int i = 0; i < V; i++) {
			
			for(int j = 0; j < V; j++) {
				
				dist[i][j] = graph[i][j];
				
				
			}
		}
		
		for(int k = 0; k < V ; k++) {
			
			for(int i = 0; i < V; i++) {
				
				for(int j = 0; j < V; j++) {
					
					if(dist[i][k] + dist[k][j] < dist[i][j])
						dist[i][j] = dist[i][k] + dist[k][j];
				}
			}
		}
		
		printSoln(dist, V);
	}

	void printSoln(int dist[][], int V) {
		
		System.out.println("Shortest distance between every pair of vertices: ");
		
		for(int i = 0; i < V; i++) {
			
			for(int j = 0; j < V; j++) {
				
				if(dist[i][j] == INF) {
					
					System.out.print("INF");
				}
				
				else {
					
					System.out.print(dist[i][j] + "  ");
				}
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 5;
		
		int graph[][] = {
				
				{0, 4, 2, INF, 1},
				{INF, 0, INF, INF, 6},
				{1, INF, 0, 3, INF},
				{INF, INF, INF, 0, 2},
				{INF, INF, INF, 4, 0}
		};
		
		FloydWarshallAlgo fwa = new FloydWarshallAlgo();
		
		fwa.floydWarshall(graph, V);
	}

}
