package com.srm.ABCFruitShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GroceryManipulation {
	void getGrocery(ArrayList arlist )
	{
		for(int i=0;i<arlist.size();i++)
		{
			System.out.println(arlist.get(i));
		}
	}
	void DisAndTypeSort(ArrayList arlist)
	{
		Collections.sort(arlist,new SortByDisAndType());
		for(int i=0;i<arlist.size();i++)
		{
			System.out.println(arlist.get(i));
		}
	}	

	}

