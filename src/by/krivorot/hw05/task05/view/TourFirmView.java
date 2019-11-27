package by.krivorot.hw05.task05.view;

import java.util.List;

import by.krivorot.hw05.task05.emptity.Tour;

public class TourFirmView {

	public void printTours(List<Tour> tours) {
		for (Tour x : tours) {
			System.out.println(x);
		}
	}

}
