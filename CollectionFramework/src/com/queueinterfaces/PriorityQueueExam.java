package com.queueinterfaces;

import java.util.PriorityQueue;

public class PriorityQueueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue();
		p.add("java");
		p.add("python");
		p.add("php");
		p.add("c++");
		p.add("c");
		
		System.out.println(p);
		System.out.println(p.size());
		System.out.println("return front element="+p.element());
		System.out.println("after using element method="+p);
		p.remove();
		System.out.println("after removing="+p);
		
		p.poll();
		System.out.println(p.poll());
		System.out.println(p.peek());
		

	}

}
