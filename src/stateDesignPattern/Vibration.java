package stateDesignPattern;

public class Vibration implements MobileAlertState{

	@Override
	public void doAction() {
		System.out.println("Vibration mode...");
	}

}
