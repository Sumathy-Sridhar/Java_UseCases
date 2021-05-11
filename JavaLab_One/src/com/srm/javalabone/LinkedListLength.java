package com.srm.javalabone;
import java.util.LinkedList;
import java.util.logging.Logger;

public class LinkedListLength {
	static Logger log=Logger.getLogger(LinkedListLength.class.getName());
	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Brown");
        list.add("Cony");
        list.add("Peach");
        list.add("Goma");
        list.add("Milk");
        log.info("LinkedList:" + list);
        log.info("The Length of the linked list is: "+ list.size()); 
                                                

	}

}
