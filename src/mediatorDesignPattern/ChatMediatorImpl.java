package mediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User u) {

		this.users.add(u);

	}

	@Override
	public void sendMessage(String message, User user) {

		for (User u : this.users) {
			// message should not be received by the user sending it
			if (u != user) {
				u.receive(message);
			}
		}
	}

	@Override
	public void sendPersonalMessage(String message, User u) {
		u.receive(message);

	}

}
