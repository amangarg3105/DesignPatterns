package mediatorDesignPattern;

public interface ChatMediator {

	public void addUser(User u);

	public void sendMessage(String message, User u);

	public void sendPersonalMessage(String message, User u);

}
