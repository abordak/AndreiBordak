package by.epam.task2.main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import by.epam.task2.composite.Component;
import by.epam.task2.logic.Logic;
import by.epam.task2.parser.ReadFile;
import by.epam.task2.parser.TextParser;


public class Main {

	static Logger logger = Logger.getLogger(Main.class);
	private static final String FILE_PATH = "resources\\source.txt";
	static {
		new DOMConfigurator().doConfigure("property\\log4j.xml",
				LogManager.getLoggerRepository());
	}
	public static void main(String[] args) {

		TextParser parser = new TextParser();
		String text = ReadFile.readFile(FILE_PATH);
		
		Component textComponent = parser.parseText(text);		
		System.out.println(textComponent.getText());

		try{
			Logic.replaceWordToSubstring(0, 0, textComponent, 4, "3");
		}catch(IllegalArgumentException e){
			logger.error("Illegal Argument", e);
		}
		Logic.deleteWordsWithConsonant(textComponent);
		 
		System.out.println(textComponent.getText());

		

	}

}
