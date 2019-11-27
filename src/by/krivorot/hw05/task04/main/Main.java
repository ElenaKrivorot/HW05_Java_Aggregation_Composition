package by.krivorot.hw05.task04.main;

import java.util.Collections;

import by.krivorot.hw05.task04.entity.Account;
import by.krivorot.hw05.task04.entity.Client;
import by.krivorot.hw05.task04.logic.AccountBallanceComparator;
import by.krivorot.hw05.task04.logic.AccountNumberComparator;
import by.krivorot.hw05.task04.logic.AccountStatusComparator;
import by.krivorot.hw05.task04.logic.ClientLogic;
import by.krivorot.hw05.task04.view.ClientView;

public class Main {

	public static void main(String[] args) {

		Client client = new Client("Bond", "James");
		client.setAccounts(new Account("132154567845", 56445));
		client.setAccounts(new Account("156548945648", -564));
		client.setAccounts(new Account("154697642762", 324294));
		client.setAccounts(new Account("156445464556", false, -5455));

		ClientView view = new ClientView();

		Collections.sort(client.getAccounts(),
				new AccountStatusComparator().thenComparing(new AccountBallanceComparator()));
		view.printAccounts(client);

		Collections.sort(client.getAccounts(),
				new AccountStatusComparator().thenComparing(new AccountNumberComparator()));
		view.printAccounts(client);

		ClientLogic logic = new ClientLogic();
		view.printBallance("positiv", logic.countPositiveBallance(client));
		view.printBallance("negative", logic.countNegativeBallance(client));
		view.printBallance("total", logic.countTotalBallance(client));
	}

}
