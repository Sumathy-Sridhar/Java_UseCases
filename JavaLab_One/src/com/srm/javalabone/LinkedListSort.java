package com.srm.javalabone;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.logging.Logger;
public class LinkedListSort {
	static Logger log=Logger.getLogger(LinkedListSort.class.getName());
	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
	        list.add("Brown");
	        list.add("cony");
	        list.add("Peach");
	        list.add("goma");
	        list.add("Milk");
	        log.info("LinkedList before sorting: " + list); 
	        Collections.sort(list);
	        log.info("LinkedList Aafter sorting in Natural: " + list);
	        Collections.sort(list, new Comparator<>() {
	        	@Override public int compare(String s1, String s2) { 
	        		return s1.length() - s2.length(); } } );
	        log.info("LinkedList After sorting using Comparator: " + list); }

	}


