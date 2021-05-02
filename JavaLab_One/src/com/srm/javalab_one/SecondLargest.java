package com.srm.javalab_one;

import java.util.Scanner;

public class SecondLargest {
	static void secLarge(int arr[],int n) {
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		System.out.println("Second largest number is:");
		System.out.println(arr[arr.length-2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding Second Largest Element in the array..");
		System.out.println("Enter array length: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Array Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		secLarge(arr,n);
	}

}
