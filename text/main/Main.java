package by.htp.text.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.text.entity.Sentence;
import by.htp.text.entity.Text;
import by.htp.text.entity.Word;
import by.htp.text.logic.TextLogic;
import by.htp.text.view.TextPrinter;

public class Main {

	public static void main(String[] args) {
			
			Word word = new Word("Lorem");
			Word word1 = new Word("ipsum");
			Word word2 = new Word("dolor");
			Word word3 = new Word("sit");
			Word word4 = new Word("amet");
			Word word5 = new Word(".");
			List<Word> words = new ArrayList<Word>();
			words.add(word);
			words.add(word1);
			words.add(word2);
			words.add(word3);
			words.add(word4);
			words.add(word5);
			
			Word word11 = new Word("Vestibulum");
			Word word12 = new Word("lacinia");
			Word word13 = new Word("faucibus");
			Word word14 = new Word("auctor");
			Word word15 = new Word(".");
			List<Word> words2 = new ArrayList<Word>();
			words2.add(word11);
			words2.add(word12);
			words2.add(word13);
			words2.add(word14);
			words2.add(word15);
			
			Sentence first = new Sentence(words);
			Sentence second = new Sentence(words2);
			List<Sentence> sentences = new ArrayList<Sentence>();
			sentences.add(first);
			sentences.add(second);
			
			String title = "Lorem Ipsum";
			Text text = new Text(title, sentences);
			
			TextLogic logic = new TextLogic();
			TextPrinter printer = new TextPrinter();
			printer.printTitle(text);
			printer.printText(text);
			
			logic.addSentence(first, text);
			printer.printText(text);
		}

}

