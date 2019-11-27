package by.krivorot.hw05.task04.view;

import by.krivorot.hw05.task04.emptity.Account;
import by.krivorot.hw05.task04.emptity.Client;

public class ClientView {

	public void printAccounts(Client client) {
		System.out.println(client.getName() + " " + client.getSername());
		for (Account x : client.getAccounts()) {
			System.out.println(x);
		}
	}

	public void printBallance(String mes, Double ballance) {
		System.out.println("The current " + mes + " account balance is " + ballance);
	}

}
