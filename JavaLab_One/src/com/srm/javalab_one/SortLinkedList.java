package com.srm.javalab_one;

import java.util.ArrayList;
import java.util.Collections;

public class SortLinkedList {

	public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sumathy");
        al.add("cony");
        al.add("Milk");
        al.add("Brown");
        Collections.sort(al);
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
    }


	}

