package by.krivorot.hw05.task04.logic;

import by.krivorot.hw05.task04.emptity.Account;
import by.krivorot.hw05.task04.emptity.Client;

public class ClientLogic {

	public double countPositiveBallance(Client client) {
		double ballance = 0;

		for (Account x : client.getAccounts()) {
			if (x.getBallance() > 0) {
				ballance = ballance + x.getBallance();
			}
		}
		return ballance;
	}

	public double countNegativeBallance(Client client) {
		double ballance = 0;

		for (Account x : client.getAccounts()) {
			if (x.getBallance() < 0) {
				ballance = ballance + x.getBallance();
			}
		}
		return ballance;
	}

	public double countTotalBallance(Client client) {
		double ballance = 0;

		for (Account x : client.getAccounts()) {
			ballance = ballance + x.getBallance();
		}
		return ballance;
	}
}
