package by.krivorot.hw05.task02.emptity;

import java.util.Arrays;

public class Automobile {
	private String model;
	private Wheel[] wheel = new Wheel[4];
	private Engine engine;

	public Automobile(String model, Wheel[] wheel, Engine engine) {
		this.model = model;
		this.wheel = wheel;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Wheel[] getWheel() {
		return wheel;
	}

	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}

	public Wheel getWheel(int index) {
		return wheel[index];
	}

	public void setWheel(int index, Wheel wheel) {
		this.wheel[index] = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + Arrays.hashCode(wheel);
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
		Automobile other = (Automobile) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (!Arrays.equals(wheel, other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automobile [model=" + model + ", wheel=" + Arrays.toString(wheel) + ", engine=" + engine + "]";
	}

}
