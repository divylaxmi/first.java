package com.string;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Divya");
        sb.append("Laxmi");  
        System.out.println(sb);  
        
        sb.insert(5, " Java");  
        System.out.println(sb);  
        
        sb.delete(5, 10);  
        System.out.println(sb);  


	}

}
