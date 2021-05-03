package com.srm.ABCFruitShop;

import java.util.ArrayList;

public class FruitsManipulation {

	void getFruitArray(ArrayList arrlist )
	{
		for(int i=0;i<arrlist.size();i++)
		{
			System.out.println(arrlist.get(i));
		}
	}
	void serachByDistributor(ArrayList<FruitDetails> arrlist,String disName)
	{
		System.out.println("SEARCH BY DISTRIBUTOR DONE SUCCESSFULLY....");
		for(FruitDetails fdetails:arrlist)
		{
			if(fdetails.DistributorName.equals(disName))
			{
				System.out.println(fdetails);
			}
		}
	}
	void searchByFruitName(ArrayList<FruitDetails> arrlist,String Name )
	{
		System.out.println("SEARCH BY FRUIT NAME DONE SUCCESSFULLY...");
		for(FruitDetails fname:arrlist)
		{
			if(fname.fruitName.equals(Name))
			{
				System.out.println(fname);
			}
		}
	}
	void searchByLocation(ArrayList<FruitDetails> arrlist,String location)
	{
		System.out.println("SEARCH BY LOCATION DONE SUCCESSFULLY.....");
		for(FruitDetails floc:arrlist)
		{
			if(floc.location.equals(location))
			{
				System.out.println(floc);
			}
		}
	}

}
