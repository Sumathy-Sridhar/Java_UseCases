package com.srm.filehandling;
import java.io.File;
import java.util.logging.Logger;
public class FileHandling implements ParentClass {
	static Logger log = Logger.getLogger(FileHandling.class.getName());
	public static void main(String[] args) 
	{
		var rtobj=new SampleFile1();
		var lsobj=new SampleFile2();
		var skobj=new SampleFile3();
		
		var name1="Sample_file1.txt";
		var name2="Sample_file2.txt";
		var name3="Sample_file3.txt";
		
		var path="C:\\Users\\Admin\\Desktop\\Java\\Files";
		
		File[] file = new File(path).listFiles();
		 
		for(File filename:file)
		{
			if (filename.getName().contains(name1))
			{
				lsobj.fileread(filename);
			}
			else if(filename.getName().contains(name2))
			{
				rtobj.fileread(filename);
			}
			else if(filename.getName().contains(name3))
			{
				skobj.fileread(filename);
			}
			else
			{
				log.info("Comapany Not Registered");
			}	
		}
	}
}
