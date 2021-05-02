package com.srm.JavaLab_Two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        List<String> l = new ArrayList<String>();  
        System.out.println("Enter n value: ");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++) {
        	l.add(sc.nextLine());
        } 
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
	}

}
