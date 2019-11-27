package by.krivorot.hw05.task03.emptity;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String name;
	private Town capital;
	private double square;
	private List<Region> regions;

	public Country(String name, Town capital, double square) {
		this.name = name;
		this.capital = capital;
		this.square = square;
		this.regions = new ArrayList<Region>();
	}

	public Country(String name, Town capital, double square, List<Region> regions) {
		this.name = name;
		this.capital = capital;
		this.square = square;
		this.regions = regions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Town getCapital() {
		return capital;
	}

	public void setCapital(Town capital) {
		this.capital = capital;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public Region getRegions(int index) {
		return regions.get(index);
	}

	public void setRegions(Region region) {
		this.regions.add(region);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", square=" + square + ", regions=" + regions + "]";
	}

}
