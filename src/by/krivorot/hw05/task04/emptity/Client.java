package by.krivorot.hw05.task04.emptity;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String sername;
	private String name;
	private List<Account> accounts;

	public Client(String sername, String name, List<Account> accounts) {
		this.sername = sername;
		this.name = name;
		this.accounts = accounts;
	}

	public Client(String sername, String name) {
		this.sername = sername;
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}

	public String getSername() {
		return sername;
	}

	public void setSername(String sername) {
		this.sername = sername;
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
		result = prime * result + ((sername == null) ? 0 : sername.hashCode());
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
		if (sername == null) {
			if (other.sername != null)
				return false;
		} else if (!sername.equals(other.sername))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [sername=" + sername + ", name=" + name + ", accounts=" + accounts + "]";
	}
	
	
}
