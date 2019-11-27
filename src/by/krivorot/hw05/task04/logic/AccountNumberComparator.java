package by.krivorot.hw05.task04.logic;

import java.util.Comparator;

import by.krivorot.hw05.task04.emptity.Account;

public class AccountNumberComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {

		return o1.getNumber().compareTo(o2.getNumber());
	}

}
