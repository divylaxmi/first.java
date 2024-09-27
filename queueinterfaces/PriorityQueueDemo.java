package com.queueinterfaces;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(1);
		q.add(2);
		q.add(22);
		q.add(27);
		q.add(20);
		q.offer(11);
		//q.add("a");
		System.out.println(q);
		System.out.println(q.size());
		
		
		//element remove
		System.out.println("return frontelement="+q.element());
		System.out.println("after using element method="+q);
		q.remove();
		System.out.println("after removing="+q);
		
		q.poll();
		System.out.println(q.poll());
		System.out.println(q.peek());
		
	}

}
