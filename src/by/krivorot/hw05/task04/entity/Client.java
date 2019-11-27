package by.krivorot.hw05.task04.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String surname;
	private String name;
	private List<Account> accounts;

	public Client(String surname, String name, List<Account> accounts) {
		this.surname = surname;
		this.name = name;
		this.accounts = accounts;
	}

	public Client(String surname, String name) {
		this.surname = surname;
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Account getAccounts(int index) {
		return accounts.get(index);
	}

	public void setAccounts(Account account) {
		this.accounts.add(account);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [surname=" + surname + ", name=" + name + ", accounts=" + accounts + "]";
	}
	
	
}
