package by.krivorot.hw05.task01.view;

import by.krivorot.hw05.task01.entity.Sentence;
import by.krivorot.hw05.task01.entity.Text;
import by.krivorot.hw05.task01.entity.Word;

public class TextView {

	public void printTitle(String title) {
		System.out.println(title);
	}

	public void printText(Text text) {
		for (Sentence x : text.getText()) {
			for (Word y : x.getSentense()) {
				System.out.print(" " + y.getWord());
			}
			System.out.print(".");
		}

	}

}
