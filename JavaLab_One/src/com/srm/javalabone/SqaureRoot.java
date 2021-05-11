package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;
public class SqaureRoot {
	static Logger log=Logger.getLogger(SqaureRoot.class.getName());
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
		var sc=new Scanner(System.in);
		log.info("SqaureRoot without using sqrt()...");
		log.info("Enter number : ");
		var num=sc.nextInt();
		double res=sqroot(num);
		log.info("SqaureRoot of "+num + " is "+res);
		sc.close();
	}

}
