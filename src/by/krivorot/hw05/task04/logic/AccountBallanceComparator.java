package by.krivorot.hw05.task04.logic;

import java.util.Comparator;

import by.krivorot.hw05.task04.emptity.Account;

public class AccountBallanceComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		if (o1.getBallance() > o2.getBallance())
			return 1;
		else if (o1.getBallance() < o2.getBallance())
			return -1;
		else
			return 0;
	}

}
