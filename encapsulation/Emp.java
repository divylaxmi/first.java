package com.encapsulation;

public class Emp {
	public String name;
	private String id;
	protected String email="try to access this protected email";
	protected void email1() {
		System.out.println("access this protected email");
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}

}
