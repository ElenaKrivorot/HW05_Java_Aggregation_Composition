package by.krivorot.hw05.task05.logic;

import java.util.ArrayList;
import java.util.List;

import by.krivorot.hw05.task05.emptity.Food;
import by.krivorot.hw05.task05.emptity.Tour;
import by.krivorot.hw05.task05.emptity.Tourfirm;
import by.krivorot.hw05.task05.emptity.Transport;

public class TourFirmLogic {

	public List<Tour> findByTransportFoodDays(Tourfirm tourfirm, Transport transport, Food food, int days) {
		List<Tour> findtours = new ArrayList<Tour>();
		List<Tour> tours = tourfirm.getTours();

		for (Tour x : tours) {
			if (x.getTransport().compareTo(transport) == 0 && x.getFood().compareTo(food) == 0 && x.getDays() == days) {
				findtours.add(x);
			}
		}

		return findtours;
	}
}
