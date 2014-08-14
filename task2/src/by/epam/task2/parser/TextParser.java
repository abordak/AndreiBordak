package by.epam.task2.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import by.epam.task2.composite.*;



public class TextParser {

	static Logger logger = Logger.getLogger(TextParser.class);
	public static String propertyPath;
	public static Properties property;
	
	static {
		property = new Properties();
		propertyPath = "property\\regex.properties";
		
		try {
			property.load(new FileInputStream(propertyPath));
		} catch (IOException e) {
			logger.error("Incorrect property file path",e);
		}
	}
	
	public Component parseText(String text) {		
		Component textComposite = new Composite();
		Component child;
		Pattern paragraph = Pattern.compile(property.getProperty("ParagraphRegex"));
		Matcher matcherParagraph = paragraph.matcher(text);
		
		while (matcherParagraph.find()) {
			if (matcherParagraph.group().matches(
					property.getProperty("ListingRegex"))) {
				child = new Leaf();
				child.setText(matcherParagraph.group());
			} else {
				child = new Composite();
				child.add(parseToSentences(matcherParagraph.group()));
			}
			textComposite.add(child);
		}
		return textComposite;
	}

	public Component parseToSentences(String text) {	
		Component textComposite = new Composite();
		Pattern sentence = Pattern.compile(property.getProperty("SentenceRegex"));
		Matcher matcherSentence = sentence.matcher(text);
		
		while (matcherSentence.find()) {
			textComposite.add(parseToWords(matcherSentence.group()));
		}
		return textComposite;
	}

	public Component parseToWords(String text) {	
		Component textComposite = new Composite();
		Component child;
		Pattern word = Pattern.compile(property.getProperty("WordRegex"));
		Matcher matcherWord = word.matcher(text);
		
		while (matcherWord.find()) {
			child = new Leaf();
			child.setText(matcherWord.group());
			textComposite.add(child);
		}
		return textComposite;
	}
}
