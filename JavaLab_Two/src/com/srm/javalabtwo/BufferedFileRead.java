package com.srm.javalabtwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class BufferedFileRead {
	static Logger log=Logger.getLogger(BufferedFileRead.class.getName());
	public static void main(String[] args) {
		
		{  
			try  
			{  
			var file=new File("C:\\Users\\Admin\\Desktop\\Demo.txt");    
			var fr=new FileReader(file);  
			var br=new BufferedReader(fr);   
			var sb=new StringBuffer();      
			String line;  
			while((line=br.readLine())!=null)  
			{  
			sb.append(line);      
			sb.append("\n");       
			}  
			fr.close();      
			log.info("Contents of File: ");  
			log.info(sb.toString());   
			}  
			catch(IOException e)  
			{  
			e.printStackTrace();  
			}  
			}  

	}

}
