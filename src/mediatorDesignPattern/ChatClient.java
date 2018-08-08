package mediatorDesignPattern;

/*
 * Mediator design pattern is one of the important and widely used behavioral design pattern. Mediator enables decoupling of objects by introducing a layer in between so
 *  that the interaction between objects happen via the layer. If the objects interact with each other directly, the system components are tightly-coupled with each other 
 *  that makes higher maintainability cost and not hard to extend. Mediator pattern focuses on providing a mediator between objects for communication and help in 
 *  implementing lose-coupling between objects.
 *  
 *   we will try to implement a chat application where users can do group chat and send personal messages. Every user will be identified by it’s name and they can send and receive messages. 
 *   The message sent by any user should be received by all the other users in the group.
 */
public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "Maurya");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");

		System.out.println("****************");

		user2.send("Hey Guys");

		System.out.println("****************");

		user1.sendPersonalMessage("Hey Lisa", user2);
		user2.sendPersonalMessage("Hey Pankaj", user1);

	}

}
