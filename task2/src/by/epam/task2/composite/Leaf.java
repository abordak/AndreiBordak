package by.epam.task2.composite;

public class Leaf extends Component {

	private String text;

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}


	@Override
	public int hashCode() {
		final int code = 69;
		int result = 1;
		result = code * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass())
			return false;
		
		Leaf other = (Leaf) obj;
		if (text == null) {
			{
				if (other.text != null) {
					return false;
				}
			}
		} else if (!text.equals(other.text)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Leaf [text=" + text + "]";
	}
}
