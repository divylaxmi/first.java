package com.staticc;

public class Table {
	int n,i,j;
	Table(int n,int i,int j){
		this.n=n;
		this.i=i;
		this.j=j;
		for(i=1;i<=n;i++) {
			for(j=i+1;j<=n;j++) {
				System.out.println(i+"*"+j+"="+i*n);
			}
			
		}
	}

}
