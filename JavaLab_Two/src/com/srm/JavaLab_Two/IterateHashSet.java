package com.srm.JavaLab_Two;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     HashSet<String> hset = new HashSet<String>();
	     hset.add("Brown");
	     hset.add("Cony");
	     hset.add("Peach");
	     hset.add("Goma");
	     hset.add("Milk");
	     System.out.println("Elements of HashSet: ");
	     System.out.println(" ");
	     Iterator<String> it = hset.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }
	  }

	}
