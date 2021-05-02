package com.srm.JavaLab_Two;

import java.util.Scanner;

public class ArrayMaxValue {
	static void arrayMax(int arr[]) {
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] < arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		 
		}
		System.out.println("Maximum Element in the array: " +arr[0]);  

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter no of elements of Array : ");
		n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter array elements: ");
		for( i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arrayMax(arr);
	}

}
