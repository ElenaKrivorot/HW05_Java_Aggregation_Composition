package by.krivorot.hw05.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String name;
	private Town center;
	private List<Town> towns;

	public District(String name, Town center) {
		this.name = name;
		this.center = center;
		this.towns = new ArrayList<Town>();
	}

	public District(String name, Town center, List<Town> towns) {
		this.name = name;
		this.center = center;
		this.towns = towns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Town getCenter() {
		return center;
	}

	public void setCenter(Town center) {
		this.center = center;
	}

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

	public Town getTowns(int index) {
		return towns.get(index);
	}

	public void setTowns(Town town) {
		this.towns.add(town);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((towns == null) ? 0 : towns.hashCode());
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
		District other = (District) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (towns == null) {
			if (other.towns != null)
				return false;
		} else if (!towns.equals(other.towns))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", center=" + center + ", towns=" + towns + "]";
	}

}
