package by.krivorot.hw05.task03.main;

import by.krivorot.hw05.task03.emptity.Country;
import by.krivorot.hw05.task03.emptity.District;
import by.krivorot.hw05.task03.emptity.Region;
import by.krivorot.hw05.task03.emptity.Town;
import by.krivorot.hw05.task03.logic.CountryLogic;
import by.krivorot.hw05.task03.view.CountryView;

public class Main {

	public static void main(String[] args) {

		Region region1 = new Region("Brest", new Town("Brest"));
		region1.setDistricts(new District("Brest", region1.getCenter()));
		region1.getDistricts(0).setTowns(region1.getCenter());
		region1.setDistricts(new District("Baranovichy", new Town("Baranovichy")));
		region1.getDistricts(1).setTowns(region1.getDistricts(1).getCenter());
		region1.setDistricts(new District("Pinsk", new Town("Pinsk")));
		region1.getDistricts(2).setTowns(region1.getDistricts(2).getCenter());

		Region region2 = new Region("Minsk", new Town("Minsk"));
		region2.setDistricts(new District("Minsk", region2.getCenter()));
		region2.getDistricts(0).setTowns(region2.getCenter());
		region2.setDistricts(new District("Puhovichy", new Town("Marina Gorka")));
		region2.getDistricts(1).setTowns(region2.getDistricts(1).getCenter());
		region2.setDistricts(new District("Miadel", new Town("Miadel")));
		region2.getDistricts(2).setTowns(region2.getDistricts(2).getCenter());

		Country country = new Country("Belarus", region2.getDistricts(0).getTowns(0), 207595.0);
		country.setRegions(region1);
		country.setRegions(region2);

		CountryLogic logic = new CountryLogic();
		CountryView view = new CountryView();

		view.printCapital(country);
		view.printSqare(country);
		view.printNumberOfRegions(country, logic.countRegions(country));
		view.printRegionCenters(country);
	}

}
