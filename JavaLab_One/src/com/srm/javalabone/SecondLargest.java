package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class SecondLargest {
	static Logger log=Logger.getLogger(SecondLargest.class.getName());
	static void secLarge(int arr[],int n) {
		int temp;
		for(var i=0;i<arr.length;i++)
		{
			for(var j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		log.info("Second largest number is:");
		log.fine(arr[arr.length-2]+ " ");
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Finding Second Largest Element in the array..");
		log.info("Enter array length: ");
		var n=sc.nextInt();
		int[] arr= new int[n];
		log.info("Array Elements: ");
		for(var i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		secLarge(arr,n);
		sc.close();
	}

}
