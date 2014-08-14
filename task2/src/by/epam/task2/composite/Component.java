package by.epam.task2.composite;

import java.util.List;

public abstract class Component{

	public void add(Component component) {
		throw new UnsupportedOperationException();
	}

	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}

	public Component getChild(int i) {
		throw new UnsupportedOperationException();
	}
	

	public String getText() {
		throw new UnsupportedOperationException();
	}

	public void setText(String text) {
		throw new UnsupportedOperationException();
	}
	
	
	public List<Component> getChildren() {
		throw new UnsupportedOperationException();
	}

}
