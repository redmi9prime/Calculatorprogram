package com.test;

import java.util.Scanner;

public class Calculator {
	
	static void multiply(int a,int b) {
		
		System.out.println(a*b);
	}
	static void division(int a, int b) {
		
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the number");
		int b=sc.nextInt();
		System.out.println("Enter your choice * , /");
		String c= sc.next();
		switch (c) {
		
		case "*" : 
			System.out.println("The multiplication is : ");
			multiply(a,b);
			break;
			
		case "/" :
			System.out.println("The Division is : ");
			division(a, b);
			break;
		}
		sc.close();
		
		
	}

}
