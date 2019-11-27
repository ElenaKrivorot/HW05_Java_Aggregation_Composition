package by.krivorot.hw05.task02.main;

import by.krivorot.hw05.task02.emptity.Automobile;
import by.krivorot.hw05.task02.emptity.Engine;
import by.krivorot.hw05.task02.emptity.Wheel;
import by.krivorot.hw05.task02.logic.AutomobileLogic;
import by.krivorot.hw05.task02.logic.EngineLogic;
import by.krivorot.hw05.task02.view.AutomobileView;

public class Main {

	public static void main(String[] args) {
		double driveDistance;
		double fuelRest;

		Automobile automobile = new Automobile("Ford",
				new Wheel[] { new Wheel("front left", "Belshina", false), new Wheel("front right", "Belshina", false),
						new Wheel("back left", "Belshina", true), new Wheel("back right", "Belshina", false) },
				new Engine("v4", 70.0, 0.0, 10.0));

		AutomobileLogic alogic = new AutomobileLogic();
		driveDistance = alogic.drive(automobile, 100);
		AutomobileView view = new AutomobileView();
		view.printDriveDistance(driveDistance);

		Wheel newWheel = new Wheel("spare", "Belshina", false);
		alogic.changeWheel(automobile, newWheel, "back left");
		driveDistance = alogic.drive(automobile, 100);
		view.printDriveDistance(driveDistance);

		EngineLogic elogic = new EngineLogic();
		fuelRest = elogic.fuel(automobile.getEngine(), 80);
		driveDistance = alogic.drive(automobile, 800);
		view.printFuelRest(fuelRest);
		view.printDriveDistance(driveDistance);
	}

}
