package by.krivorot.hw05.task05.main;

import by.krivorot.hw05.task05.emptity.Food;
import by.krivorot.hw05.task05.emptity.Tour;
import by.krivorot.hw05.task05.emptity.TourType;
import by.krivorot.hw05.task05.emptity.Tourfirm;
import by.krivorot.hw05.task05.emptity.Transport;
import by.krivorot.hw05.task05.logic.TourFirmLogic;

public class Main {

	public static void main(String[] args) {

		Tourfirm tourfirm = new Tourfirm("TezTour");
		tourfirm.setTours(new Tour("Montenegro", "Bechichy", "12.06.20", 9, Transport.AIR, Food.FB, TourType.RECREATION));
		tourfirm.setTours(new Tour("Montenegro", "Budva", "12.06.20", 9, Transport.AIR, Food.HB, TourType.RECREATION));
		tourfirm.setTours(new Tour("Montenegro", "Bechichy", "15.07.20", 11, Transport.TRAIN, Food.BB, TourType.RECREATION));
		tourfirm.setTours(new Tour("Montenegro", "Bechichy, Kotor", "12.06.20", 7, Transport.BUS, Food.RO, TourType.EXCURSION));
		tourfirm.setTours(new Tour("Montenegro", "Kotor", "27.08.20", 11, Transport.AIR, Food.FB, TourType.RECREATION));
		tourfirm.setTours(new Tour("Montenegro", "budva", "13.08.20", 9, Transport.TRAIN, Food.AI, TourType.RECREATION));
		tourfirm.setTours(new Tour("Montenegro", "Kotor", "17.07.20", 7, Transport.AIR, Food.BB, TourType.EXCURSION));
		
		TourFirmLogic find = new TourFirmLogic();
		
	}

}
