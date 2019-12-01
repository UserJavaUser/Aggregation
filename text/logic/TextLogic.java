package by.htp.text.logic;

import java.util.Arrays;

import by.htp.text.entity.Sentence;
import by.htp.text.entity.Text;

public class TextLogic {

	public void addSentence(Sentence first, Text text) {
			text.getText().addAll(Arrays.asList(first));
		
	}
}
