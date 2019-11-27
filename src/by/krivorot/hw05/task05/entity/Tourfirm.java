package by.krivorot.hw05.task05.entity;

import java.util.ArrayList;
import java.util.List;

public class Tourfirm {
	private String name;
	private List<Tour> tours;

	public Tourfirm(String name) {
		this.name = name;
		this.tours = new ArrayList<Tour>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	public Tour getTours(int index) {
		return tours.get(index);
	}

	public void setTours(Tour tour) {
		this.tours.add(tour);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tours == null) ? 0 : tours.hashCode());
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
		Tourfirm other = (Tourfirm) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tours == null) {
			if (other.tours != null)
				return false;
		} else if (!tours.equals(other.tours))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tourfirm [name=" + name + ", tours=" + tours + "]";
	}

}
