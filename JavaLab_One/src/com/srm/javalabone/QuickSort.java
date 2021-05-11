package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;
public class QuickSort {
	static Logger log=Logger.getLogger(QuickSort.class.getName());
	static void sort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	static void quickSort(int arr[], int low, int high) {
		int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
        while (i <= j) 
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } 
        if (low < j)
            quickSort(arr, low, j); 
        if (i < high)
            quickSort(arr, i, high);
    }
	
	public static void main(String[] args) {
        var sc = new Scanner( System.in );       
        log.info("Enter number of array elements");
        var n = sc.nextInt();
        int arr[] = new int[ n ];
        log.info("\nEnter "+ n +" integer array elements");
        for (var i = 0; i < n; i++)
            arr[i] = sc.nextInt();
               sort(arr);
        log.info("\nElements after Quick sorting ");        
        for (var i = 0; i < n; i++)
            log.info(arr[i]+" ");            
        log.info("");
        sc.close();
    }    

		

	}
