package by.htp.text.entity;

import java.util.List;

public class Text {
	
	private String title;
	
	private List<Sentence> text;

	public Text() {
		
	}
	
	public Text(String title, List<Sentence> text) {
		this.title = title;
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	public void addText(int position, List<Sentence> addedText) {
			text.addAll(position, addedText);
	}

	@Override
	public String toString() {
		String sentences = "";
			for(Sentence sentence : text) {
				sentences = sentences.concat(sentence.toString());
			}
		return sentences;
	}
	
	
}
