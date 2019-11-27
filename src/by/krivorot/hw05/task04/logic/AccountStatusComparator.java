package by.krivorot.hw05.task04.logic;

import java.util.Comparator;

import by.krivorot.hw05.task04.entity.Account;

public class AccountStatusComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		if (!o1.isStatus() && o2.isStatus())
			return 1;
		else if (o1.isStatus() && !o2.isStatus())
			return -1;
		else
			return 0;

	}

}
