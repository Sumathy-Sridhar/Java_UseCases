package com.srm.javalab_one;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list = new LinkedList<String>();
	        list.add("Brown");
	        list.add("cony");
	        list.add("Peach");
	        list.add("goma");
	        list.add("Milk");
	        System.out.println("LinkedList before sorting: " + list); 
	        Collections.sort(list);
	        System.out.println("LinkedList Aafter sorting in Natural: " + list);
	        Collections.sort(list, new Comparator<String>() {
	        	@Override public int compare(String s1, String s2) { 
	        		return s1.length() - s2.length(); } } );
	        System.out.println("LinkedList After sorting using Comparator: " + list); }

	}


