package by.krivorot.hw05.task02.logic;

import by.krivorot.hw05.task02.entity.Engine;

public class EngineLogic {

	public double fuel(Engine engine, double volume) {
		double rest;
		double valueOfFuel;

		valueOfFuel = engine.getCurrentValueOfFuel() + volume;
		if (valueOfFuel > engine.getVolumeOfFuelTank()) {
			engine.setCurrentValueOfFuel(engine.getVolumeOfFuelTank());
			rest = valueOfFuel - engine.getVolumeOfFuelTank();
		} else {
			engine.setCurrentValueOfFuel(valueOfFuel);
			rest = 0;
		}
		return rest;
	}
}
