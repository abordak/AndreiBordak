package by.epam.task2.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.epam.task2.composite.Component;
import by.epam.task2.composite.Composite;
import by.epam.task2.composite.Leaf;


public class Logic {

	public static void replaceWordToSubstring(int paragraphNumber,int sentenceNumber,							//задание №16
													Component component,int wordLength, String substring){
		
		if ((paragraphNumber>2)||(sentenceNumber>2)){
			throw new IllegalArgumentException();
		}
		for (int j=0; j<component.getChildren().size(); j++){
			
			if (component.getChild(j) instanceof Composite){
				for (int i=0;i<component.getChild(j).getChild(paragraphNumber).
						getChild(sentenceNumber).getChildren().size();i++){
					
					if (component.getChild(j).getChild(paragraphNumber).getChild(sentenceNumber).getChild(i) instanceof Leaf){
						if (component.getChild(j).getChild(paragraphNumber).getChild(sentenceNumber).getChild(i).getText().length()==wordLength){
							component.getChild(j).getChild(paragraphNumber).getChild(sentenceNumber).getChild(i).setText(substring);
						}
					}
				}
			}
		}	
	}
	
		
	public static void deleteWordsWithConsonant(Component component){							//задание №12
		
		Pattern p = Pattern.compile("[б-д ж з к-н п-т ф-ъ ь]|[Б-Д Ж З К-Н П-Т Ф-Ъ Ь]|[B-D F-H J-N P-T V-X Z]|[b-d f-h j-n p-t v-x z]");
		String word="";
		String firstSymbol="";
		for (int i=0; i<component.getChildren().size(); i++){
			if (component.getChild(i) instanceof Composite){
				for (int j=0; j<component.getChild(i).getChildren().size();j++){
					if (component.getChild(i).getChild(j) instanceof Composite){
						for(int k=0; k<component.getChild(i).getChild(j).getChildren().size(); k++){
							if (component.getChild(i).getChild(j).getChild(k) instanceof Composite){
								for (int m=0; m<component.getChild(i).getChild(j).getChild(k).getChildren().size();m++){
									if(component.getChild(i).getChild(j).getChild(k).getChild(m) instanceof Leaf){
										word = component.getChild(i).getChild(j).getChild(k).getChild(m).getText();
										firstSymbol = word.substring(0, 1);
										Matcher matcher = p.matcher(firstSymbol);
										if(matcher.find()){
											component.getChild(i).getChild(j).getChild(k).getChild(m).setText("");
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	
}
