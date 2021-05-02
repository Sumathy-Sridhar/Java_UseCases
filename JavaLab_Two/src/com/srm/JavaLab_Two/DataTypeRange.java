package com.srm.JavaLab_Two;

import java.util.Scanner;

public class DataTypeRange {
	static void minmaxRange(String dataType) {
		switch(dataType) {
		case "Integer": 	     
			System.out.println("Min range of Integer = " + Integer.MIN_VALUE);
			System.out.println("Max range of integer= " + Integer.MAX_VALUE);
			break;
		case "Float":
		      System.out.println("Min range of Float = " + Float.MIN_VALUE);
		      System.out.println("Max range of float = " + Float.MAX_VALUE);
		      break;
		case "Double":
		      System.out.println("Min range of Double = " + Double.MIN_VALUE);
		      System.out.println("Max range of Double = " + Double.MAX_VALUE);
		      break;
		case "Byte":
			  System.out.println("Min range of Byte = " + Byte.MIN_VALUE);
		      System.out.println("Max range of Byte= " + Byte.MAX_VALUE);
		      break;
		case "Short":
		      System.out.println("Min range of short = " + Short.MIN_VALUE);
		      System.out.println("Max range of short = " + Short.MAX_VALUE);
		      break;
		default:
			System.out.println("Invalid Datatype...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding Min Max Range of given DataType...");
		System.out.println("Enter the DataType:");
		String dataType=sc.nextLine();
		minmaxRange(dataType);

	}

}
