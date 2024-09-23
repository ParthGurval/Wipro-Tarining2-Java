package com.wipro.unionFind;

import java.util.*;

public class UnionFind {

	private int[] parent;
	private int[] rank; 
	
	public UnionFind(int size) {
		
		parent = new int[size];
		rank = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			parent[i] = i;
			rank[i] = 0;
		}
	}
	
	
	public int find(int x) {
	
		if(parent[x] != x) {
			
			parent[x] = find(parent[x]);
		}
		
		return parent[x];
	}
	
	public void union(int x, int y) {
		
		int rootX = find(x);
		int rootY = find(y);
		
		if(rootX != rootY) {
			
			if(rank[rootX] > rank[rootY]) {
				
				parent[rootY] = rootX;
			}
			
			else if(rank[rootX] < rank[rootY]) {
				
				parent[rootX] = rootY;
			}
			
			else {
				
				parent[rootY] = rootX;
				rank[rootX]++;
			}
		}
	}
	
	
	public boolean connected(int x, int y) {
		
		return find(x) == find(y);
	}
	
	 public static void main(String[] args) {
		 
		 UnionFind uf = new UnionFind(10);
		 
		 
		 uf.union(0, 1);
		 uf.union(1, 2);
		 uf.union(3, 4);
		 uf.union(4, 5);
		 
		 System.out.println("Before Union: ");
		 
		 System.out.println("\nAre nodes 0 & 2 Connected: "+uf.connected(0, 2));
		 System.out.println("Are nodes 0 & 3 Connected: "+uf.connected(0, 3));
		 System.out.println("Are nodes 1 & 5 Connected: "+uf.connected(1, 5));
		 
		 
		 uf.union(2, 3);
		 
		 System.out.println("\nAfter Union: ");
		 
		 System.out.println("\nAre nodes 0 & 2 Connected: "+uf.connected(0, 2));
		 System.out.println("Are nodes 0 & 3 Connected: "+uf.connected(0, 3));
		 System.out.println("Are nodes 1 & 5 Connected: "+uf.connected(1, 5));
		 
		 
	 }
}
