package by.krivorot.hw05.task01.emptity;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	private List<Word> sentense;

	public Sentence() {
		this.sentense = new ArrayList<Word>();
	}

	public Sentence(List<Word> sentense) {
		this.sentense = sentense;
	}

	public Sentence(Word... word) {
		this.sentense = new ArrayList<Word>();
		for (Word x : word) {
			sentense.add(x);
		}
	}

	public List<Word> getSentense() {
		return sentense;
	}

	public void setSentense(List<Word> sentense) {
		this.sentense = sentense;
	}

	public Word getSentense(int index) {
		return sentense.get(index);
	}

	public void setSentense(Word word) {
		this.sentense.add(word);
	}

	public void setSentense(int index, Word word) {
		this.sentense.add(index, word);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentense == null) ? 0 : sentense.hashCode());
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
		Sentence other = (Sentence) obj;
		if (sentense == null) {
			if (other.sentense != null)
				return false;
		} else if (!sentense.equals(other.sentense))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentense=" + sentense + "]";
	}

}
