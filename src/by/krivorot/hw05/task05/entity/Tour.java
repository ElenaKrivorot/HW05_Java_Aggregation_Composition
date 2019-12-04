package by.krivorot.hw05.task05.entity;

public class Tour {
	private String counrty;
	private String resort;
	private String startDate;
	private int days;
	private Transport transport;
	private Food food;
	private TourType type;

	public Tour(String counrty, String resort, String startDate, int days, Transport transport, Food food, TourType type) {
		this.counrty = counrty;
		this.resort = resort;
		this.startDate = startDate;
		this.days = days;
		this.transport = transport;
		this.food = food;
		this.type = type;
	}

	public String getCounrty() {
		return counrty;
	}

	public void setCounrty(String counrty) {
		this.counrty = counrty;
	}

	public String getResort() {
		return resort;
	}

	public void setResort(String resort) {
		this.resort = resort;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String date) {
		this.startDate = startDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public TourType getType() {
		return type;
	}

	public void setType(TourType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((counrty == null) ? 0 : counrty.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + days;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((resort == null) ? 0 : resort.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Tour other = (Tour) obj;
		if (counrty == null) {
			if (other.counrty != null)
				return false;
		} else if (!counrty.equals(other.counrty))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (days != other.days)
			return false;
		if (food != other.food)
			return false;
		if (resort == null) {
			if (other.resort != null)
				return false;
		} else if (!resort.equals(other.resort))
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [counrty=" + counrty + ", resort=" + resort + ", date=" + startDate + ", days=" + days + ", transport="
				+ transport + ", food=" + food + ", type=" + type + "]";
	}

}
