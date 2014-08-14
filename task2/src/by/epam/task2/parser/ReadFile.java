package by.epam.task2.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class ReadFile {
	static Logger logger = Logger.getLogger(ReadFile.class);
	public static String readFile(String path){
		
		StringBuffer buffer = new StringBuffer();
		try{
			
			Scanner sc = new Scanner(new File(path));			
			while (sc.hasNext()){
				buffer.append(sc.nextLine()+"\r\n");
			}
			
			sc.close();
			return buffer.toString();
						
		} catch (FileNotFoundException e) {
			logger.error(e);
			return null;
		}
		
		
	}
}
