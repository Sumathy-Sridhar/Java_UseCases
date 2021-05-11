package com.srm.indauto_jio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
	var fileToParse = "C:\\Users\\Admin\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\S4JIOCarEDI\\OEM02202020_001.txt";
        BufferedReader fileReader = null;
        FileReader fr=null;
        try
        {
            var line = "";
            fr=new FileReader(fileToParse);
            fileReader=new BufferedReader(fr);
            while ((line = fileReader.readLine()) != null) 
            {
            	String[] tokens = line.split("@@");
                for(String token : tokens)
                {
                  System.getLogger(token);
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally
        {
        	if(fileReader!=null) {
            try {
                fileReader.close();
                fr.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        	}
        }

	}	
}
