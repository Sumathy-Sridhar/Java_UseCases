package com.srm.javalab_one;

import java.util.Scanner;

public class SqaureRoot {
	public static double sqroot(int num) {
		double temp;  
		double root=num/2;  
		do   
		{  
		temp=root;  
		root=(temp+(num/temp))/2;  
		}   
		while((temp-root)!= 0);  
		return root;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("SqaureRoot without using sqrt()...");
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		double res=sqroot(num);
		System.out.println("SqaureRoot of "+num + " is "+res);
	}

}
