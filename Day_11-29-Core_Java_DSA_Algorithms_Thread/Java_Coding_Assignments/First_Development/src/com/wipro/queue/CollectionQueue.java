package com.wipro.queue;

import java.util.PriorityQueue;

public class CollectionQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		System.out.println("Is Queue Empty: "+que.isEmpty());
//		System.out.println(que.peek());
//		System.out.println(que.element());
		
		
		
		for(int i=1; i<=10; i++) {
			
			que.offer(i);
		}
		
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		
	}

}
