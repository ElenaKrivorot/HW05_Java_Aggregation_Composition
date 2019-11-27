package by.krivorot.hw05.task02.entity;

public class Engine {
	private String model;
	private Double volumeOfFuelTank;
	private Double currentValueOfFuel;
	private Double fuelConsumptionPer100km;

	public Engine(String model, Double volumeOfFuelTank, Double currentValueOfFuel, Double fuelConsumptionPer100km) {
		this.model = model;
		this.volumeOfFuelTank = volumeOfFuelTank;
		this.currentValueOfFuel = currentValueOfFuel;
		this.fuelConsumptionPer100km = fuelConsumptionPer100km;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getVolumeOfFuelTank() {
		return volumeOfFuelTank;
	}

	public void setVolumeOfFuelTank(Double volumeOfFuelTank) {
		this.volumeOfFuelTank = volumeOfFuelTank;
	}

	public Double getCurrentValueOfFuel() {
		return currentValueOfFuel;
	}

	public void setCurrentValueOfFuel(Double currentValueOfFuel) {
		this.currentValueOfFuel = currentValueOfFuel;
	}

	public Double getFuelConsumptionPer100km() {
		return fuelConsumptionPer100km;
	}

	public void setFuelConsumptionPer100km(Double fuelConsumptionPer100km) {
		this.fuelConsumptionPer100km = fuelConsumptionPer100km;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentValueOfFuel == null) ? 0 : currentValueOfFuel.hashCode());
		result = prime * result + ((fuelConsumptionPer100km == null) ? 0 : fuelConsumptionPer100km.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((volumeOfFuelTank == null) ? 0 : volumeOfFuelTank.hashCode());
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
		Engine other = (Engine) obj;
		if (currentValueOfFuel == null) {
			if (other.currentValueOfFuel != null)
				return false;
		} else if (!currentValueOfFuel.equals(other.currentValueOfFuel))
			return false;
		if (fuelConsumptionPer100km == null) {
			if (other.fuelConsumptionPer100km != null)
				return false;
		} else if (!fuelConsumptionPer100km.equals(other.fuelConsumptionPer100km))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (volumeOfFuelTank == null) {
			if (other.volumeOfFuelTank != null)
				return false;
		} else if (!volumeOfFuelTank.equals(other.volumeOfFuelTank))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + ", volumeOfFuelTank=" + volumeOfFuelTank + ", currentValueOfFuel="
				+ currentValueOfFuel + ", fuelConsumptionPer100km=" + fuelConsumptionPer100km + "]";
	}

}
