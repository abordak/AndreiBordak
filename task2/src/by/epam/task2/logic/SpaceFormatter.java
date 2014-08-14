package by.epam.task2.logic;

public final class SpaceFormatter {
	
	public static boolean isPunctuationAfterWord(String text) {								//проверяем наличе пунктуации после слова
		if ((",".equals(text) || "»".equals(text)|| ".".equals(text)
				|| ")".equals(text)|| "?".equals(text) || ";".equals(text)
					|| ":".equals(text) || "!".equals(text))) {
			return true;
		}
		return false;
	}

	public static boolean isPunctuationBeforeWord(String text) {								//проверяем наличие пунктуации пред словом
		if (("«".equals(text) || "(".equals(text))) {
			return true;
		}
		return false;
	}
}
