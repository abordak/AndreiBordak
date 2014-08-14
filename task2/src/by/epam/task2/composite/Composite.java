package by.epam.task2.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import by.epam.task2.logic.SpaceFormatter;





public class Composite extends Component {
	private List<Component> componentList = new ArrayList<Component>();

	@Override
	public void add(Component component) {
		componentList.add(component);
	}

	@Override
	public void remove(Component component) {
		componentList.remove(component);
	}

	@Override
	public Component getChild(int i) {
		return componentList.get(i);
	}

	@Override
	public List<Component> getChildren() {
		return Collections.unmodifiableList(componentList);
	
	}

	@Override
	public String getText() {
		StringBuilder s = new StringBuilder();
		ListIterator<Component> textComponetIterator = componentList.listIterator();
		
		while (textComponetIterator.hasNext()) {
			Component Component = textComponetIterator.next();
			s.append(Component.getText());
			
			if (textComponetIterator.hasNext()) {
				Component ComponentChild = textComponetIterator.next();
				
				if (!SpaceFormatter.isPunctuationAfterWord(ComponentChild					//убираем пробелы между словом и знаком пунктуации
						.getText())															
						&& !SpaceFormatter.isPunctuationBeforeWord(Component
								.getText())) {
					s.append(" ");
				}
				textComponetIterator.previous();
			}
		}
		return s.toString();
	}
}
