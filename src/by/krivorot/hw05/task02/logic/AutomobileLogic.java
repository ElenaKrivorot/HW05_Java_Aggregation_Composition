package by.krivorot.hw05.task02.logic;

import by.krivorot.hw05.task02.emptity.Automobile;
import by.krivorot.hw05.task02.emptity.Wheel;

public class AutomobileLogic {

	public int findWheel(Automobile automobile, String position) {
		int i;

		for (i = 0; i < 4; i++) {
			Wheel x = automobile.getWheel()[i];
			if (x.getPosition().equals(position)) {
				return i;
			}
		}
		return 5;
	}

	public void changeWheel(Automobile automobile, Wheel newWheel, String position) {
		int i;

		i = findWheel(automobile, position);
		if (i != 5) {
			newWheel.setPosition(position);
			automobile.setWheel(i, newWheel);
		}

	}

	public double drive(Automobile automobile, double distance) {
		double driveDistance;

		if (!automobile.getWheel(0).isDamage() && !automobile.getWheel(1).isDamage()
				&& !automobile.getWheel(2).isDamage() && !automobile.getWheel(3).isDamage()) {
			if (automobile.getEngine().getCurrentValueOfFuel() != 0) {
				driveDistance = automobile.getEngine().getCurrentValueOfFuel()
						/ automobile.getEngine().getFuelConsumptionPer100km() * 100;
				if (driveDistance > distance) {
					driveDistance = distance;
				}
				return driveDistance;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}
}
