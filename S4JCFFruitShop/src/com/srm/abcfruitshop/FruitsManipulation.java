package com.srm.abcfruitshop;
import java.util.List;
import java.util.logging.Logger;
public class FruitsManipulation {
	static Logger log=Logger.getLogger(FruitsManipulation.class.getName());
	void getFruitArray(List<FruitDetails> arrlist )
	{
		for(var i=0;i<arrlist.size();i++)
		{
			log.info((arrlist.get(i))+ " ");
		}
	}
	void searchByDistributor(List<FruitDetails> arrlist,String disName)
	{
		log.info("SEARCH BY DISTRIBUTOR DONE SUCCESSFULLY....");
		for(FruitDetails fdetails:arrlist)
		{
			if(fdetails.distributorname.equals(disName))
			{
				log.info(fdetails + " ");
			}
		}
	}
	void searchByFruitName(List<FruitDetails> arrlist,String fName )
	{
		log.info("SEARCH BY FRUIT NAME DONE SUCCESSFULLY...");
		for(FruitDetails fname:arrlist)
		{
			if(fname.fruitname.equals(fName))
			{
				log.info(fname + " ");
				
			}
		}
	}
	void searchByLocation(List<FruitDetails> fd,String location)
	{
		log.info("SEARCH BY LOCATION DONE SUCCESSFULLY.....");
		for(FruitDetails floc:fd)
		{
			if(floc.location.equals(location))
			{
				log.info(floc + " ");
			}
		}
	}

}
