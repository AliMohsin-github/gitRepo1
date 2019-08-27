package com.git.java;

public class removeConflict {

	public static void main(String[] args) {

		System.out.println("wellcome to GIT Tutorial Sayed");		
		System.out.println("wellcome to GIT Tutorial Mohsin");
		System.out.println("wellcome to GIT Tutorial Ali");
		
		int a = 10;
		int b = 20;
		
		int c = a + b;
		
		System.out.println("Dear Mohsin Value of addition is:" +c );
		
		setMessage();
		
	}
	
	public static void setMessage() {
		
		System.out.println("Test message to resolve Merge conflict in GIT");
	}

}
