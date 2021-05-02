package com.srm.JavaLab_Two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        List<String> arraylist = new ArrayList<String>();  
        System.out.println("Enter n value: ");
        int n =sc.nextInt();
        System.out.println("Enter ArrayList Elements : ");
        for(int i=1;i<=n;i++) {
        	arraylist.add(sc.nextLine());
        }
        System.out.println(" ");
        System.out.println("Before Sorting:");
 	   for(String str: arraylist){
 			System.out.println(str);
 		}
 	   System.out.println(" ");
 	   Collections.sort(arraylist, Collections.reverseOrder());
 	   System.out.println("ArrayList in descending order:");
 	   for(String str: arraylist){
 			System.out.println(str);
 		}

	}

}
