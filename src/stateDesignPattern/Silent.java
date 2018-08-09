package stateDesignPattern;

public class Silent implements MobileAlertState{

	@Override
	public void doAction() {
		System.out.println("Silent Mode....");
		
	}

}
