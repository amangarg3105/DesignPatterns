package mediatorDesignPattern;

public class UserImpl extends User {

	public UserImpl(ChatMediator med, String name) {
		super(med, name);

	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Sending Message = " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": Received Message: " + msg);
	}

	@Override
	public void sendPersonalMessage(String msg, User u) {

		System.out.println(this.name + ": Sending Personal Message = " + msg);
		mediator.sendPersonalMessage(msg, u);
	}

}
