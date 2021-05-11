package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayMaxValue {
	static Logger log=Logger.getLogger(ArrayMaxValue.class.getName());
	static void arrayMax(int[] arr) {
		for (var i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
		{  
		var tmp = 0;  
		if (arr[i] < arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		 
		}
		log.info("Maximum Element in the array: " +arr[0]);  

	}

	public static void main(String[] args) {
		var  sc=new Scanner(System.in);
		
		log.info("Enter no of elements of Array : ");
		var n=sc.nextInt();
		var arr= new int[n];
		log.info("Enter array elements: ");
		for(var i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arrayMax(arr);
		sc.close();
	}

}
