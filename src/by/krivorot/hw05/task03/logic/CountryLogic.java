package by.krivorot.hw05.task03.logic;

import by.krivorot.hw05.task03.emptity.Country;

public class CountryLogic {

	public int countRegions(Country country) {
		int i;
		int number = 0;

		for (i = 0; i < country.getRegions().size(); i++) {
			number = number + 1;
		}
		return number;
	}
}
