package com.srm.javalab_one;

import java.util.Scanner;

public class RemoveArrayDuplicates {
	public static int removeDuplicateElements(int arr[]){
        int index = 1;
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] != arr[index-1])
               arr[index++] = arr[i];
       }

		  return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Removing Duplicate Elements in the array..");
		System.out.println("Enter array length: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Array Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		removeDuplicateElements(arr);
		System.out.println("\nThe new length of the array is: "+removeDuplicateElements(arr));

	}

}
