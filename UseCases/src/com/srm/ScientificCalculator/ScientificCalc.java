package com.srm.ScientificCalculator;

import java.util.Scanner;

public class ScientificCalc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
	    Double num1, num2,result; 
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Choose an operation: " );
	    System.out.println("1. Sum()");
	    System.out.println("2. Divide()");
	    System.out.println("3. SquareRoot()");
	    System.out.println("4. CubeRoot()");
	    System.out.println("5. Tan()");
	    System.out.println("6. Cos()");
	    op = scan.next().charAt(0);
	    System.out.println("You Entered the "+op+ " operation");
	    switch(op) {
	    case '1': System.out.println("Enter number 1: ");
	    			num1=scan.nextDouble();
	              System.out.println("Enter number 2: ");;
	              num2=scan.nextDouble();
	              result=num1+num2;
	              System.out.println("Sum of "+num1 + num2+ "is " + result);
	              break;
	    
	    case '2': 
	    	System.out.println("Enter number 1: ");
			num1=scan.nextDouble();
          System.out.println("Enter number 2: ");;
          num2=scan.nextDouble();
          result=num1/num2;
          System.out.println("Division of "+num1 + num2+ " is " + result);
          break;
	    
	    case '3' :
	    	  System.out.println("Enter number : ");
		  	    num1 = scan.nextDouble();
		  	  System.out.println("square root of "+num1+" is :"+Math.sqrt(num1));
	          break;
	   
	    case '4':
	    	 System.out.println("Enter number : ");
		  	    num1 = scan.nextDouble();
		  	  System.out.println("Cube root of "+num1+" is :"+Math.cbrt(num1));
	          break;
	         
	    case '5': 
	    	 System.out.println("Enter number : ");
		  	    num1 = scan.nextDouble();
		  	  System.out.println("Tan value of "+num1+" is :"+Math.tan(num1));
	          break;
	          
	    case '6':  System.out.println("Enter number : ");
  	    num1 = scan.nextDouble();
  	    System.out.println("Cos value of "+num1+" is :"+Math.cos(num1));
  	    break;
  	    
  	    default: System.out.println("Invalid Operation....");
  	    break;

	    }
	}
}
