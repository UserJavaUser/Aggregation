package by.htp.text.view;

import by.htp.text.entity.Text;

public class TextPrinter {
	
	public void printTitle(Text text) {
		System.out.println(text.getTitle());
	}
	

	public void printText(Text text) {
		System.out.println(text.toString());
	}
	
}
