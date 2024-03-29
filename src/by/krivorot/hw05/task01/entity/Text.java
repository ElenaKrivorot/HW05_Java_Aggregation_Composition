package by.krivorot.hw05.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
	private String title;
	private List<Sentence> text;

	public Text(String title) {
		this.title = title;
		this.text = new ArrayList<Sentence>();
	}

	public Text(String title, List<Sentence> text) {
		this.title = title;
		this.text = text;
	}

	public Text(String title, Sentence... sentence) {
		this.title = title;
		this.text = new ArrayList<Sentence>();
		for (Sentence x : sentence) {
			text.add(x);
		}
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public Sentence getText(int index) {
		return text.get(index);
	}

	public void setText(Sentence sentence) {
		this.text.add(sentence);
	}

	public void setText(int index, Sentence sentence) {
		this.text.add(index, sentence);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}

}
