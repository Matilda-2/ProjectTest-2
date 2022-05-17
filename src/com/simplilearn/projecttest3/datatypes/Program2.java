package com.simplilearn.projecttest3.datatypes;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=1;
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(count);
        		System.out.print(" ");
        		count++;
        	}
        	System.out.println();
        }
	}

}
