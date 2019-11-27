package by.krivorot.hw05.task03.view;

import by.krivorot.hw05.task03.entity.Country;
import by.krivorot.hw05.task03.entity.Region;

public class CountryView {

	public void printCapital(Country country) {
		System.out.println("The capital of " + country.getName() + " is " + country.getCapital().getName());
	}

	public void printSqare(Country country) {
		System.out.println("The square of " + country.getName() + " is " + country.getSquare());
	}

	public void printNumberOfRegions(Country country, int number) {
		System.out.println("The  " + country.getName() + " has " + number + " regions");
	}

	public void printRegionCenters(Country country) {
		System.out.println("The region centers of " + country.getName() + " are:");
		for (Region x : country.getRegions()) {
			System.out.println(x.getCenter().getName());
		}
	}
}
