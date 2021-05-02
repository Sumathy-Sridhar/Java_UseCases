package com.srm.JavaLab_Two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arrlist= new ArrayList<String>();  
        System.out.println("Enter n value: ");
        int n =sc.nextInt();
        System.out.println("Enter ArrayList Elements: ");
        for(int i=1;i<=n;i++) {
        	arrlist.add(sc.nextLine());
        } 
		String array[] = new String[arrlist.size()];              
		for(int j =0;j<arrlist.size();j++){
		  array[j] = arrlist.get(j);
		}
		System.out.println("Coverted string: ");
		for(String k: array)
		{
			System.out.println(k);
		}

	}

}
