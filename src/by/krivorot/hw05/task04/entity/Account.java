package by.krivorot.hw05.task04.entity;

public class Account {
	private String number;
	private boolean status;
	private double ballance;

	public Account(String number, double ballance) {
		this.number = number;
		this.status = true;
		this.ballance = ballance;
	}

	public Account(String number, boolean status, double ballance) {
		this.number = number;
		this.status = status;
		this.ballance = ballance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getBallance() {
		return ballance;
	}

	public void setBallance(double ballance) {
		this.ballance = ballance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ballance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + (status ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(ballance) != Double.doubleToLongBits(other.ballance))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", status=" + status + ", ballance=" + ballance + "]";
	}

}
