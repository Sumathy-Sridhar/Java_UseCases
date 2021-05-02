package com.srm.javalab_one;

import java.util.Scanner;

public class SwapTemp {
	static void swapThird(int num1, int num2) {
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping: ");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Swapping Two numbers using Third Varibale...");
		System.out.println("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2=sc.nextInt();
		swapThird(num1, num2);
	}

}
