package com.srm.IndAutoJIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
	/*	// TODO Auto-generated method stub
		 FileReader fr =
			      new FileReader("C:\\Users\\Admin\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\S4JExceptionCarEDI\\OEM02202020_001.txt");
		    BufferedReader br = new BufferedReader
		    		(new FileReader("C:\\Users\\Admin\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\S4JIOCarEDI\\OEM02202020_001.txt"));    
		    String st;
		    String[] split= {};
		    while ((st = br.readLine()) != null)
		    {
		      System.out.println(st);
		      split=st.split("@@");
		      for(int i=0;i<split.length;i++)
			    {
			    	System.out.println(split[i]);
			    }
		    }*/
        String fileToParse = "C:\\Users\\Admin\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\S4JIOCarEDI\\OEM02202020_001.txt";
        BufferedReader fileReader = null;
         
        //Delimiter used in text file
        final String DELIMITER = ",";
        try
        {
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));
             
            //Read the file line by line
            while ((line = fileReader.readLine()) != null) 
            {
                //Get all tokens available in line
                String[] tokens = line.split("@@");
                for(String token : tokens)
                {
                    //Print all tokens
                    System.out.println(token);
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

	}	
}
