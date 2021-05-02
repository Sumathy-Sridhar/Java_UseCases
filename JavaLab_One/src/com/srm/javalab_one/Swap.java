package com.srm.javalab_one;

import java.util.Scanner;

public class Swap {
	static void swapNumbers(int num1, int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping...");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Swapping Two numbers without using Third Varibale...");
		System.out.println("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2=sc.nextInt();
		swapNumbers(num1,num2);
	}

}
