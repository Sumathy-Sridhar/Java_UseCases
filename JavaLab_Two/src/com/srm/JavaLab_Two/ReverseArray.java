package com.srm.JavaLab_Two;

import java.util.Scanner;

public class ReverseArray {

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
		System.out.println("Reversed Array: ");
		for(i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
