package by.krivorot.hw05.task01.main;

import by.krivorot.hw05.task01.emptity.Sentence;
import by.krivorot.hw05.task01.emptity.Text;
import by.krivorot.hw05.task01.emptity.Word;
import by.krivorot.hw05.task01.view.TextView;

public class Main {

	public static void main(String[] args) {

		Sentence sentence1 = new Sentence(new Word("American"), new Word("music"), new Word("has"), new Word("it's"),
				new Word("own"), new Word("history"));
		Sentence sentence2 = new Sentence(new Word("The"), new Word("development"), new Word("of"),
				new Word("American"), new Word("music"), new Word("has"), new Word("gone"), new Word("through"),
				new Word("changes"));
		Text text = new Text("America’s music culture", sentence1, sentence2);

		sentence2.setSentense(8, new Word("different"));

		TextView view = new TextView();
		view.printTitle(text.getTitle());
		view.printText(text);

	}

}
