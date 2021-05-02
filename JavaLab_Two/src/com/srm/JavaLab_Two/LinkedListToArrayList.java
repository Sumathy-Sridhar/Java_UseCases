package com.srm.JavaLab_Two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        List<String> l = new ArrayList<String>();  
        System.out.println("Enter n value: ");
        int n =sc.nextInt();
        System.out.println("Enter LinkedList Elements: ");
        for(int i=1;i<=n;i++) {
        	l.add(sc.nextLine());
        } 
        
	List<String> list = new ArrayList<String>(l);
	System.out.println("Converted ArrayList : ");
	for (String str : list){
	  System.out.println(str);
	}
  }
}
